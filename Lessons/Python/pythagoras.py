side1 = float(input("Enter length of first side : "))
side2 = float(input("Enter length of second side : "))
side3 = float(input("Enter length of third side : "))

sides = [side1,side2,side3]
sides.sort()

if sides[0]**2 + sides[1]**2 == sides[2]**2:
    print("Triangle is a right angled triangle with sides {} , {} & {}" .format(side1,side2,side3))
else:
    print("Triangle is not a right angled triangle with sides {} , {} & {}" .format(side1,side2,side3))