#include <stdio.h>
struct myStruct
{
    int myNum;
    char myChar;
    char myStr[10];
};
int main(){
    struct myStruct s1;
    s1.myStr = "Text";
    printf("%s" , s1.myStr);

    return 0;
}