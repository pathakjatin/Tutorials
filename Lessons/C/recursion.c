#include <stdio.h>

double power(double x, int n);

int main() {
    double x;
    int n;

    printf("Enter the value of x: ");
    scanf("%lf", &x);

    printf("Enter the value of n: ");
    scanf("%d", &n);

    double result = power(x, n);
    printf("%.2lf raised to the power of %d is %.2lf\n", x, n, result);

    return 0;
}

double power(double x, int n) {
    // Base case: x^0 = 1
    if (n == 0)
        return 1;

    // Recursive case: x^n = x * x^(n-1)
    return x * power(x, n - 1);
}
