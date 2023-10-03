import unittest
from calculator import Calculator

class TestCalculator(unittest.TestCase):
    def test_summation(self):
        print("Testing summation")
        c = Calculator()
        self.assertEqual(c.addition(1, 2), 3)

    def test_substraction(self):
        print("Testing substraction")
        c = Calculator()
        self.assertEqual(c.substraction(10, 4), 6)

if __name__ == '__main__':
    unittest.main()