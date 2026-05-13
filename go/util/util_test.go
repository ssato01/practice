package main

import "testing"

func Test_isLeapYear(t *testing.T) {
	type args struct {
		year int
	}
	tests := []struct {
		name string
		args int
		want bool
	}{
		{
			name: "4で割り切れる年はうるう年",
			args: 2024,
			want: true,
		},
		{
			name: "4で割り切れない年はうるう年ではない",
			args: 2023,
			want: false,
		},
		{
			name: "100で割り切れるが400で割り切れない年はうるう年ではない",
			args: 1900,
			want: false,
		},
		{
			name: "400で割り切れる年はうるう年",
			args: 2000,
			want: true,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got := isLeapYear(tt.args)
			if got != tt.want {
				t.Errorf("isLeapYear(%d) = %t, want %t", tt.args, got, tt.want)
			}
		})
	}
}
