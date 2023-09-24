#include <stdio.h>

#define MAX_SIZE 10

int main() {
    int matrix[MAX_SIZE][MAX_SIZE];
    int n;

    printf("Enter the size of the matrix: ");
    scanf("%d", &n);

    printf("Enter the matrix elements:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }

    // Calculate the sum of diagonal elements
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += matrix[i][i];
    }

    printf("Sum of diagonal elements: %d\n", sum);

    return 0;
}
