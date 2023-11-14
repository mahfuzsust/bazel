from projects.py_sum.sum import Sum

sum = Sum()

class Calculator:
    def addition(self, x, y): 
        return sum.add(x, y)
    def substraction(self, x, y): 
        return x - y
    