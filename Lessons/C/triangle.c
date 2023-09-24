#include <stdio.h>
int main ()
{
    int rows , i , j ,coefficient=1;
    printf("Enter the number of rows :");
    scanf ("%d" , &rows);

    for ( i = 0; i < rows; i++)
    {
        for (j = 0; j <= i; j++)
        {
            if (j==0 || i==0)
            {
                coefficient=1;
            }
            else
            {
                coefficient=coefficient * (i-j+1)/j;
            }
            printf("%d" , coefficient);
        }
        printf("\n");
    }
    return 0;    
}