#include <stdio.h>
int main ()
{
    //WAP to check wheter the entered character is upper case or lower case (using ASCII value)
    char ch;
    printf("Enter a character :\n");
    scanf("%s" , &ch);
    if (ch >= 'A' && ch <= 'Z')
    {
        printf("Character entered is upper-case\n");
    }
else if (ch >= 'a' && ch <= 'z')
{
    printf("Character entered is lower-case\n");
}
    else 
    {
        printf("Character entered is invalid\n");
    }
    return 0;
}