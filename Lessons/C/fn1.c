// #include <stdio.h>
// int sum(int x, int y);
// int main(){
//     int a,b,x,y;
//     printf("Enter 2 numbers:");
//     scanf("%d %d" ,&x,&y);
//     printf("%d" ,sum(x,y));
//     return 0;
// }
// int sum(int x, int y){
//     return x+y;
// }
// #include <stdio.h>
// #include <math.h>
// float power(float x);
// int main(){
//     float x;
//     printf("Enter a number:");
//     scanf("%f",&x);
//     printf("%f" , power(x));
//     return 0;
// }
// float power(float x){
//     return x*x;
// }
// #include <stdio.h>
// void swap(int *x, int *y);
// int main(){
//     int x,y;
//     printf("Enter 2 numbers:");
//     scanf("%d %d" ,&x,&y);
//     printf("Before swapping x=%d y=%d \n",x,y);
//     swap(&x,&y);
//     printf("After swapping:%d %d ",x,y);
//     return 0;
// }
// void swap(int *x, int *y){
//     int z;
//     z=*x;
//     *x=*y;
//     *y=z;
// }
// #include <stdio.h>
// int num(int x);
// int main(){ 
//     int x;
//     printf("Enter a number:");
//     scanf("%d",&x);
//     printf("%d" , num(x));
//     return 0;
// }
// int num(int x){
//     if (x%2==0)
//     {
//         return 1;
//     }
//     else{
//         return 0;
//     }
// }
#include <stdio.h>
int prime(int x);
int main(){
    int x;
    printf("Enter a number:");
    scanf("%d",&x);
    printf("%d" , prime(x));
    return 0;
}
int prime(int x){
    int i=2;
    while (i<=x/2)
    {
        if (x%i==0)
        {
            return 0;
        }
        else{
            i++;
        }
    }
    return 1;
}
