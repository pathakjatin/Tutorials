#include <stdio.h>
#include <unistd.h>

int main()
{
    int x;
    int a[5][5],b[5][5],c[5][5],i,j;

    start:
    printf("\n\nPermitted Operations:\n1.Addition of two 3x3 matrices \
            \n2.Transpose of a 3x3 matrix \
            \n3.Multiplication of two 3x3 matrices \n\n" \
          );

    printf ("Enter The Operation You Want to use: ") && scanf ("%d",&x);

	switch (x) 
    {
        case 1:
        {
            printf("\nEnter Elements of matrix A: \n");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    scanf("%d",&a[i][j]);}}

            printf("\nEnter Elements of matrix B: \n");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    scanf("%d",&b[i][j]);}}

            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    c[i][j]=a[i][j]+b[i][j];}}

            printf("\nThe addition of both matrices will be: \n");
            for(i=0;i<3;i++)
                {
                for(j=0;j<3;j++){
                    printf("%5d",c[i][j]);}
                printf("\n");
                }
            break;
        }

        case 2:
        {

            printf("\nEnter Elements of a matrix: \n");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    scanf("%d",&a[i][j]);}}
            
            for (int i = 0; i < 3; ++i)
            for (int j = 0; j < 3; ++j) {
                c[j][i] = a[i][j];
            }

            printf("\nTranspose of the matrix:\n");
            for (int i = 0; i < 3; ++i){
                for (int j = 0; j < 3; ++j) {
                    printf("%d  ", c[i][j]);}
                printf("\n");
            }
            break;
        }

        case 3:
        {
            printf("\nEnter Elements of matrix A: \n");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    scanf("%d",&a[i][j]);}}

            printf("\nEnter Elements of matrix B: \n");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    scanf("%d",&b[i][j]);}}
   
            for(i=0;i<3;i++){    
                for(j=0;j<3;j++){    
                    c[i][j]=0;    
                    for(int k=0;k<3;k++){    
                        c[i][j]+=a[i][k]*b[k][j];}}}

            printf("\nThe Multiplication of both matrices will be: \n");
            for(i=0;i<3;i++)
                {
                for(j=0;j<3;j++){
                    printf("%5d",c[i][j]);}
                printf("\n");
                }
            break;
        }

    }
    
    return 0;
}