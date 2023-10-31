#include <stdio.h>
struct Center{
    float x,y;
};
struct  Circle
{
    float radius;
    struct Center centre;
};
int main(){
    struct Circle mcir;
    mcir.radius = 5.0;
    mcir.centre.x = 2.0;
    mcir.centre.y = 3.0;
    printf("Circle radius: %.2f\n" ,mcir.radius);
    printf("Circle Center:(%.2f,%.2f)\n", mcir.centre.x, mcir.centre.y);
    return 0;
}
