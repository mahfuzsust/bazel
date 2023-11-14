import unittest
from sum import Sum

class TestSum(unittest.TestCase):
    def test_add(self):
        print("Testing add")
        s = Sum()
        self.assertEqual(s.add(1, 2), 3)
        self.assertEqual(s.add(3, 3), 6)

    def test_add_negative(self):
        print("Testing add negative")
        s = Sum()
        self.assertEqual(s.add(-4, -11), -15)

if __name__ == '__main__':
    unittest.main()