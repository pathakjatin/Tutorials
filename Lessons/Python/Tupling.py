my_tuple = (1,2,3,4,5,6)
print(my_tuple)
print(len(my_tuple))

print(my_tuple[0])
print(my_tuple[-1])

sliced_tuple = my_tuple[1:4]
print(sliced_tuple)

tp1 = (10,20)
tp2 = (30,40)
print(tp1 + tp2)

if 3 in my_tuple:
    print("It exists")
else:
    print("It doesn't exists")