#include <stdio.h>
enum Level{
    LOW,
    MEDIUM,
    HIGH
};
int main(){

    enum Level myvar = HIGH;
    printf("%d", myvar);

    return 0;
}