#include <stdio.h>
struct employee{
    char name[20];
    struct address{
        char city[20];
        int pin;
        char country[14];
    }add;
}emp;
int main(){
    struct employee emp;
    printf("Enter employee information:\n");
    printf("Name:\n City:\n Pincode:\n Country:\n");
    scanf("%s %s %d %s", &emp.name, &emp.add.city, &emp.add.pin, &emp.add.country);
    printf("Employee details are as follows:- \n Name:%s\n City:%s\n Pincode:%d\n Country:%s\n",emp.name, emp.add.city, emp.add.pin, emp.add.country);
    return 0;
}