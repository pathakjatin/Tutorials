#include <stdio.h>

int fibonacci(int n);

int main() {
    int n;

    printf("Enter the number of terms: ");
    scanf("%d", &n);

    printf("Fibonacci Series: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", fibonacci(i));
    }
    printf("\n");

    return 0;
}

int fibonacci(int n) {
    // Base case: fib(0) = 0, fib(1) = 1
    if (n == 0)
        return 0;
    else if (n == 1)
        return 1;

    // Recursive case: fib(n) = fib(n-1) + fib(n-2)
    return fibonacci(n - 1) + fibonacci(n - 2);
}
