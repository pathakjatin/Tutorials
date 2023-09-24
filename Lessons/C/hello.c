#include <stdio.h>
int main()
{
    int i,n ;
    int sum = 0;
    printf("Enter a number :\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        sum=sum+i;
    }
    printf("The sum is :%d \n",sum);

    return 0;
}