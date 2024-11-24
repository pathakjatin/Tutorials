#include <stdio.h>
union myUnion{
    int myInt;
    float myFloat;
    char myStr[30];
};
int main(){

    union myUnion data;
    data.myInt = 4;
    // printf("%d" ,data.myInt);
    data.myFloat = 4.0;
    // printf("%f" ,data.myFloat);
    printf("%d" ,data.myInt);



    return 0;
}