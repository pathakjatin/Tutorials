str1 = "Jatin"
str2 = "Pathak"
print("Strings before concatenation")
print("str1 = " , str1)
print("str2 = " , str2)


concatenated_str = str1 + " " +str2
print("Concatenated String : " , concatenated_str)
print("Length of Concatenated String : " , len(concatenated_str))

if str1 == str2:
    print("Strings are equal")
else:
    print("Strings are not equal")

print("Uppercase concatenated string : " , concatenated_str.upper())
print("Lowercase concatenated string : " , concatenated_str.lower())

substr = concatenated_str[1:5]
print("Substring : " , substr)

replaced_str = concatenated_str.replace("Jatin", "nitaj")
print("Replaced Substring : " , replaced_str)