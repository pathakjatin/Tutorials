#include <stdio.h>
int decimal();
int main(){
    int x=10;
    // printf("Enter a number:");
    // scanf("%d",&x);
    printf("Binary is:%d" ,decimal(x));
    return 0;
}
int decimal(int x){
    int rem,i,j;
    int a[10];
    while (x!=0)
    {
        rem=x%2;
        x=x/2;
        a[i]=rem;
        i++;
    }
    for (int j = i-1; j >= 0; j--)
    {
        printf("%d",a[j]);
    }
    return a[j];
}