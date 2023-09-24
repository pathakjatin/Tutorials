#include <stdio.h>
int main()
{
    float marks;

    printf("Enter marks:");
    scanf("%f", &marks);

    if (marks >= 90 && marks <= 100)
    {
        printf("Class : A+");
    }
    else if (marks >= 80 && marks <= 900)
    {
        printf("Class : A");
    }
    else if (marks >= 70 && marks <= 80)
    {
        printf("Class : B");
    }
    else if (marks >= 60 && marks <= 70)
    {
        printf("Class : C");
    }
    else if (marks >= 50 && marks <= 60)
    {
        printf("Class : D");
    }
    else if (marks >= 40 && marks <= 50)
    {
        printf("Class : E");
    }
    else
    {
        printf("Fail");
    }
}