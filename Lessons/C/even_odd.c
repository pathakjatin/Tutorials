#include <stdio.h>
int main()
{
    // WAP to check whether a number is divisible by 2 or not
    int N;
    printf("Enter a number to check if it's divisible by 2: \n");
    scanf("%d" , &N);
    if (N%2==0)
    {
        printf(" %d is divisible by 2 \n" , N);
    }
    else 
    {
        printf(" %d is not divisible by 2 \n" , N);
    }
    return 0;
}