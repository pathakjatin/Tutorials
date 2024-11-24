#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, n;  // Declare variables: i for loop iteration, n for the number of integers

    // Prompt the user to input the number of integers
    printf("Enter the number of integers: ");
    
    // Take input for n from the user (use &n to pass the address of n to scanf)
    scanf("%d", &n);

    // Dynamically allocate memory for 'n' integers using malloc
    // malloc allocates memory at runtime based on user input , stands for memory allocation
    int *ptr = (int *)malloc(n * sizeof(int));

    // Check if the memory allocation was successful
    if (ptr == NULL) {
        // If ptr is NULL, memory allocation failed, print an error and exit
        printf("Memory not available");
        exit(1);  // Terminate the program with exit status 1 (indicating error)
    }

    // Loop to take 'n' integers as input from the user
    for (int i = 0; i < n; i++) {
        printf("Enter an integer: ");  // Prompt for each integer
        scanf("%d", ptr + i);  // Store the input at ptr + i (i-th position in memory)
    }

    // Loop to print the integers entered by the user
    for (int i = 0; i < n; i++) {
        // Use pointer arithmetic to access each element (ptr + i) and dereference it (*)
        printf("%d ", *(ptr + i));  // Print the i-th integer
    }


    int *ptr = (int *)calloc(10 , sizeof(int)); // same as malloc but diff syntax
    // initialized to 0 whereas in malloc its garbage value 
    //stands for clear allocation

    //realloc() is used to change the size of the memory block without losing old data
    int *ptr = (int *)malloc(sizeof(int));
    ptr = (int *)realloc(ptr , 2*sizeof(int));
    //moves the content of old bloack to a new block without losing size
    //may get lost if new size is smaller than old size

    // Return 0 to indicate successful execution of the program
    return 0;
}
