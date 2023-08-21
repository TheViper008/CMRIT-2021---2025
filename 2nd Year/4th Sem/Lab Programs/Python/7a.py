import math

class Shape:
    def __init__(self):
        self.name = ""
        self.area = 0

    def showArea(self):
        print(f"Area of {self.name} is {self.area}")

class Triangle(Shape):
    def __init__(self, base, height):
        self.name="Triangle"
        self.base = base
        self.height = height

    def calcArea(self):
        self.area = 0.5 * self.base * self.height


class Circle(Shape):
    def __init__(self, radius):
        self.name="Circle"
        self.radius = radius

    def calcArea(self):
        self.area = math.pi * self.radius * self.radius


class Rectangle(Shape):
    def __init__(self, length, width):
        self.name = "Rectangle"
        self.length = length
        self.width = width

    def calcArea(self):
        self.area = self.length * self.width

c1 = Circle(5)
c1.calcArea()
c1.showArea()

t1 = Triangle(5,4)
t1.calcArea()
t1.showArea()

r1 = Rectangle(3,2)
r1.calcArea()
r1.showArea()