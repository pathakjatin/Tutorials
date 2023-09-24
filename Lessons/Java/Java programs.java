import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Check Armstrong Number");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Check Prime Number");
            System.out.println("5. Generate Fibonacci Series");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    System.out.println("Factorial of " + num + " is: " + factorial(num));
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int armstrongNum = scanner.nextInt();
                    System.out.println(armstrongNum + " is " + (isArmstrong(armstrongNum) ? "" : "not ") + "an Armstrong number.");
                    break;

                case 3:
                    System.out.print("Enter a string: ");
                    String palindromeStr = scanner.next();
                    System.out.println("\"" + palindromeStr + "\" is " + (isPalindrome(palindromeStr) ? "" : "not ") + "a palindrome.");
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    int primeNum = scanner.nextInt();
                    System.out.println(primeNum + " is " + (isPrime(primeNum) ? "" : "not ") + "a prime number.");
                    break;

                case 5:
                    System.out.print("Enter the number of terms: ");
                    int fibTerms = scanner.nextInt();
                    System.out.println("Fibonacci Series:");
                    for (int i = 0; i < fibTerms; i++) {
                        System.out.print(fibonacci(i) + " ");
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 6);

        scanner.close();
    }

    // Factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Armstrong Number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        return sum == originalNum;
    }

    // Palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Prime Number
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Fibonacci Series
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}