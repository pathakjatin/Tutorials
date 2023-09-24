#include <stdio.h>
#include <math.h>
#include <unistd.h>

int main()
{   
    int x;
    float a;

    start:
    printf("\n\nPermitted Operations:\n1.Square Root of a number \
            \n2.Square of a number \n3.Cube of a number \
            \n4.Check weather number is prime \n5.Factorial of a number \
            \n6.Prime Factors of a number\n\n" );

    printf ("Enter The Operation You Want to use: ") && scanf ("%d",&x);

	switch (x) {
        case 1:{
            printf ("\nIntput a Number: ") && scanf("%f", &a);
            float sq_rt = sqrt(a);
            printf("Square root of %.0f is %.2f", a, sq_rt);
            break;}
        case 2:{
            printf ("\nIntput a Number: ") && scanf("%f", &a);
            float sq = (a*a);
            printf("Square of %.2f is %.2f", a, sq);
            break;}
        case 3:{
            printf ("\nIntput a Number: ") && scanf("%f", &a);
            float cu = (a*a*a);
            printf("Cube of %.2f is %.2f", a, cu);
            break;}
        case 4:{
            printf ("\nIntput a Number: ") && scanf("%f", &a);
            int temp = a;
            int b, c;
                    
            for (b=2 ; b < temp ; b++)
            {
                c = temp%b;
                
                if (c == 0){
                    printf ("\n%d is not prime number", temp);
                    break;}
                else{
                    printf ("\n%d is prime number", temp);
                    break;}
            }
        }
        case 5:{
            printf ("\nIntput a Number: ") && scanf("%f", &a);
            int temp = a;
            int b, c=1;

            for(b=1;b<=temp;b++)
            {
                c=c*b; 
            }
            printf("Factorial of %d is: %d",temp,c);
            break;}
    }
    return 0;
}