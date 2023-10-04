package go_calculator

import "testing"

func TestAdd(t *testing.T) {
	expected := 4
	actual := Add(2, 2)
	if actual != expected {
		t.Errorf("expected %q but got %q", expected, actual)
	}
}

func TestSubtract(t *testing.T) {
	expected := 0
	actual := Subtract(2, 2)
	if actual != expected {
		t.Errorf("expected %q but got %q", expected, actual)
	}
}
