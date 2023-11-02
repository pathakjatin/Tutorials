#include <stdio.h>
void printArray(int *A, int n){
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", A[i]);
    }
    printf("\n");
}
void bubbleSort(int *A, int n){
    int temp;
    for (int i = 0; i < n-1; i++)
    {
        for (int j = 0; j < n-1-i; j++) // for comparison in each pass
        {
            if (A[j]>A[j+1])
            {
                temp=A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
            }
            
        }
        
    }
    
}
int main(){
    int n=6;
    int A[n];
    printf("Enter array: \n");
    for (int i = 0; i < 6; i++)
    {
        scanf("%d", &A[i]);
    }
    printArray(A,n); // printing the array before sorting
    bubbleSort(A,n); // function to perform bubble sort
    printArray(A,n); // printing the array after sorting
    return 0;
}