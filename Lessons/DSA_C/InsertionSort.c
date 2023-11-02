#include <stdio.h>
void printArray(int *A, int n){
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", A[i]);
    }
    printf("\n");
}
void insertionSort(int* A, int n){
    int key, j;
    for (int i = 1; i < n; i++) {
        key = A[i];
        j = i - 1;
        
        while (j >= 0 && A[j] > key) {
            A[j + 1] = A[j];
            j = j - 1;
        }
        A[j + 1] = key;
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
    insertionSort(A,n); // function to perform insertion sort
    printArray(A,n); // printing the array after sorting
    return 0;
}