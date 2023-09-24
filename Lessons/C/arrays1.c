#include <stdio.h>
int main()
{
    int marks[10];
    //input
    int *ptr= &marks[0];

    for (int i = 0; i < 10; i++)
    {
        printf("%d index : " , i);
        scanf("%d" , (ptr+i));
    }
    //output

    for (int i = 0; i < 10; i++)
    {
        printf("%d index = %d\n " , i , *(ptr+i));
    }
    
    return 0;
}