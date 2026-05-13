package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func isLeapYear(year int) bool {

	isLeap := false

	if year%4 == 0 {
		if year%100 != 0 {
			isLeap = true
		} else {
			if year%400 == 0 {
				isLeap = true
			}
		}
	}

	return isLeap
}

func main() {
	scanner := bufio.NewScanner(os.Stdin)

	fmt.Println("うるう年判定を行います。年を入力してください")

	for {
		fmt.Print("> ")

		if !scanner.Scan() {
			fmt.Println("入力を読み取れませんでした")
			return
		}

		input := scanner.Text()

		year, err := strconv.Atoi(input)
		if err != nil || year <= 0 {
			fmt.Println("年は正の整数で入力してください")
			continue
		}

		fmt.Printf("%d年はうるう年か：%t\n", year, isLeapYear(year))
		break
	}
}
