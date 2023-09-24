#include <stdio.h>
int main()
{
    int n ;
    int tab;
    printf("enter a number :\n");
    scanf("%d" , &n);
    for (int i = 1; i <=10; i++)
    {
        tab=i*n;
        printf("%d\n",tab);
    }
    
    return 0;
}  