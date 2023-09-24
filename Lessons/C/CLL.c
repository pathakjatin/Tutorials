
#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *start = NULL; // Initialize the start pointer to NULL

void addbegin();
void addend();
void deletebegin();
void deleteend();
void display();

int main() {
    int choice;
    printf("1. Insert at the beginning\n2. Insert at the end\n3. Delete from the beginning\n4. Delete from the end\n5. Display\n6. Exit\n");
    
    do {
        printf("\nEnter your choice: ");
        scanf("%d", &choice);
        
        switch (choice) {
            case 1:
                addbegin();
                break;
            case 2:
                addend();
                break;
            case 3:
                deletebegin();
                break;
            case 4:
                deleteend();
                break;
            case 5:
                display();
                break;
            case 6:
                printf("Program exited\n");
                break;
            default:
                printf("Wrong choice. Program is terminating!\n");
                exit(1);
        }
    } while (choice != 6);

    return 0;
}

void addbegin() {
    int x;
    struct node *ptr, *temp;
    printf("Enter a value: ");
    scanf("%d", &x);
    
    ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = x;
    
    if (start == NULL) {
        ptr->next = ptr; // Circular reference to itself
        start = ptr;
    } else {
        temp = start;
        while (temp->next != start) {
            temp = temp->next;
        }
        temp->next = ptr;
        ptr->next = start;
        start = ptr;
    }
}

void addend() {
    int x;
    struct node *ptr, *temp;
    printf("Enter a value: ");
    scanf("%d", &x);
    
    ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = x;
    
    if (start == NULL) {
        ptr->next = ptr; // Circular reference to itself
        start = ptr;
    } else {
        temp = start;
        while (temp->next != start) {
            temp = temp->next;
        }
        temp->next = ptr;
        ptr->next = start;
    }
}

void deletebegin() {
    struct node *ptr, *temp;
    
    if (start == NULL) {
        printf("List is empty\n");
    } else if (start->next == start) {
        ptr = start;
        start = NULL;
        free(ptr);
    } else {
        ptr = start;
        temp = start;
        
        while (temp->next != start) {
            temp = temp->next;
        }
        
        start = start->next;
        temp->next = start;
        free(ptr);
    }
}

void deleteend() {
    struct node *ptr, *temp;
    
    if (start == NULL) {
        printf("List is empty\n");
    } else if (start->next == start) {
        ptr = start;
        start = NULL;
        free(ptr);
    } else {
        ptr = start;
        temp = NULL;
        
        while (ptr->next != start) {
            temp = ptr;
            ptr = ptr->next;
        }
        
        temp->next = start;
        free(ptr);
    }
}

void display() {
    struct node *ptr;
    
    if (start == NULL) {
        printf("List is empty\n");
    } else {
        ptr = start;
        
        do {
            printf("%d ", ptr->data);
            ptr = ptr->next;
        } while (ptr != start);
        
        printf("\n");
    }
}