#include <stdio.h>
int main()
{
    //break
    int n;
    do
    {
        printf("enter number \n");
        scanf("%d" , &n);
        if (n%7 == 0)
        {
            break;
        }
        
    } while (1);
    printf("end \n");
}