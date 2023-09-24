#include <stdio.h> // star pattern 
int main()
{
    int i,j,k,rows , space;
    printf("Enter number of rows :");
    scanf("%d" , &rows);
    for ( i = 1; i <= rows; i++)
    {
        for (space  = i; space < rows; space++)
        {
            printf(" ");
        }
        for (j = 1; j <= i; j++)
        {
            printf("*");
        }
        for (k = 1; k < (j-1); k++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}