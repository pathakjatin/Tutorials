#include <stdio.h>

void stringCopy(char *source, char *destination);

int main() {
    char source[100];
    char destination[100];

    printf("Enter a string: ");
    scanf("%s", source);

    stringCopy(source, destination);

    printf("Copied string: %s\n", destination);

    return 0;
}

void stringCopy(char *source, char *destination) {
    int i = 0;
    
    // Copy each character from source to destination
    while (source[i] != '\0') {
        destination[i] = source[i];
        i++;
    }
    
    // Add the null terminator to the end of destination
    destination[i] = '\0';
}
