my_list = [1,2,3,4,5,6]
list2 = ["apple" , 3.14 , True , "banana"]
list3 = ["apple" , "orange" , "grapes" , "watermelon" , "banana"]
list3.sort(reverse=False)
print(my_list)
my_list.append(7)
print(my_list)
my_list.pop(3)
print(my_list)
my_list.remove(7)
print(my_list)
my_list.insert(2 , "mango")
list2.extend(my_list)
print(list3)