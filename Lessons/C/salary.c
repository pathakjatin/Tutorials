#include <stdio.h>
int main()
{
    float basic_salary, gross_salary, da, hra;
    printf("Enter basic salary:");
    scanf("%f", &basic_salary);
    da=0.5*basic_salary;
    hra=0.4*basic_salary;
    gross_salary=basic_salary+da+hra;
    printf("Gross salary is :%.2f", gross_salary);
    return 0;
}