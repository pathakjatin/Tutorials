#include <stdio.h>
#include <math.h>
int main()
{
    int sum=0, i, n, p;
    printf("Enter the Number: ") && scanf("%d", &n);

    i=n;
    while (i != 0){
    p = i%10;
    i = i/10;
    sum = sum + (p*p*p);
    }

    if (sum == n)
    {
        printf("%d is Armstrong number", n);
    }   
    else
    {
        printf("%d is not Armstrong number", n);
    }
    return 0;
}