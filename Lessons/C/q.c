#include <stdio.h> // number pattern 
int main()
{
    int i,j,rows ;
    printf("Enter number of rows :");
    scanf("%d" , &rows);
    for ( i = 1; i <= rows; i++)
    {
        for (j = 1; j <= i; j++)
        {
            printf("%d",i);
            i++;
        }
        printf("\n");
    }
    return 0;
}