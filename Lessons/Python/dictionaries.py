my_dict = {'name':'Jatin' , 'age':'18' , 'city':'Dombivli'}
for key,value in my_dict.items():
    print(key , " : " , value)

my_dict['gender'] = 'Male'
print("Gender : " , my_dict['gender'])

my_dict['age'] = '19'
print("Dictionary after updating : " , my_dict)

removed_value = my_dict.pop('city')
print(removed_value)
print(my_dict)

if 'income' in my_dict:
    print("key exists")
else:
    print("Doesn't exists")