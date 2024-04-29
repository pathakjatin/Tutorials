import math

class Rectangle:
    def __init__(self,length,breadth):
        self.length = length
        self.breadth = breadth
    def calculateArea(self):
        return self.length * self.breadth
    
class Cube:
    def __init__(self,side):
        if side is not None:
            self.side = side

    def calculateArea(self,side=None,edge=None):
        if side is not None:
            area = 6 * side**2
            print("The area of the cube with side {} is : {}".format(side,area))
        elif edge is not None:
            area = 6 * edge**2
            print("The area of the cube with edge {} is : {}".format(edge,area))


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

cube1 = Cube(5)
cube1.calculateArea(side=5)

cube2 = Cube(10)
cube2.calculateArea(edge=10)

print("Area of circle is : " , areaofcircle)
print("Perimeter of circle is : " , peri)
print("Area of rectangle is : " , areaofrectangle)
del rect
del circle
del cube2,cube1