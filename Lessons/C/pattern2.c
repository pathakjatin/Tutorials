#include <stdio.h> // number pattern 
int main()
{
    int i,j,rows ;
    printf("Enter number of rows :");
    scanf("%d" , &rows);
    for ( i = rows; i >= 1; i--)
    {
        for (j = i; j >= 1; j--)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    return 0;
}