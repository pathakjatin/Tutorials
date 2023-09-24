#include <stdio.h>
#include <math.h>
int main()
{   
    int x , a ,b;

    start:
    printf("\n\nPermitted Operations:\n1.Addition \
            \n2.Subtraction \n3.Multiplication of 2 numbers\n\n" );

    printf ("Enter The Operation You Want to use: ") && scanf ("%d",&x);
    	switch (x) {
        case 1:{
            printf ("\nEnter numbers to add: ") && scanf("%d,%d", &a , &b);
            int sum ;
            sum = a+b;
            printf("Sum of %d & %d is: %d", a,b,sum);
            break;}

            case 2:{
            printf ("\nEnter numbers to subtract: ") && scanf("%d,%d", &a , &b);
            int difference;
            difference = a-b;
            printf("Difference of %d & %d is: %d", a,b,difference);
            break;}

            case 3:{
            printf ("\nEnter numbers to multiply: ") && scanf("%d,%d", &a , &b);
            int product;
            product = a*b;
            printf("Product of %d& %d is: %d", a,b,product);
            break;}
            return 0;
        }
}
