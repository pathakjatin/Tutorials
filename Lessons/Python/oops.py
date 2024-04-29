import math

class Rectangle:
    def __init__(self,length,breadth):
        self.length = length
        self.breadth = breadth
    def calculateArea(self):
        return self.length * self.breadth
    
class Cube:
    def __init__(self,side):
        self.side = side


class Circle:
    def __init__(self,radius):
        self.radius = radius
    def calculateArea(self):
        return self.radius**2 * math.pi
    def calculatePerimeter(self):
        return 2 * math.pi * self.radius

rect = Rectangle(50,100)
areaofrectangle = rect.calculateArea()

circle = Circle(10)
areaofcircle = circle.calculateArea()
peri = circle.calculatePerimeter()
print("Area of circle is : " , areaofcircle)
print("Perimeter of circle is : " , peri)
print("Area of rectangle is : " , areaofrectangle)
