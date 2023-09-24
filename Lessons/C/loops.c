#include <stdio.h>
int main()
{
    // LOOPS


    //float i;
    //for ( i = 0.0; i <= 10.0; i=i+1)
    //{
    //    printf("%0.1f \n" , i);
    //}
    
    //for (char ch = 'A'; ch <= 'Z'; ch++)
    //{
    //  printf("%c \n" , ch);
    //}
    
    //int k=0; int n;
    //printf("enter number :\n");
    //scanf("%d" , &n);
    //while (k<=n)
    //{
    //    printf("%d \n" , k);
    //    k++;
    //}
    int i=0; int n , j , sum=0;
    printf("enter number :\n");
    scanf("%d" , &n);
    //do
    //{
    //    printf("%d \n" , k);
    //    k++; 
    //} while (k<=n);
    for ( i = 0 , j=n; i <= n && j>= 1; i++ , j-- )
    {
        sum=sum+i;
        printf("%d \n" , j);
    }
    printf("the sum is : %d \n" , sum);

    //for ( int i = n; i >= 1; i--)
    //{
    //    printf("%d \n" , i);
    //}
    
    return 0; 
}