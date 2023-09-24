#include <stdio.h>
#include <string.h>

int main() {
    char word[100];
    printf("Enter a word: ");
    scanf("%s", word);
    
    int length = strlen(word);
    
    // Print the word in the desired format
    for (int i = 0; i < length; i++) {
        for (int j = 0; j <= i; j++) {
            printf("%c ", word[j]);
        }
        printf("\n");
    }
    
    return 0;
}
