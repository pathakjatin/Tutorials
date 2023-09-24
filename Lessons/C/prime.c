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
    for (int i = 2; i*i <= x; i++)
    {
        if (x%i==0)
        {
            return 0;
        }
    }
    return 1;
}