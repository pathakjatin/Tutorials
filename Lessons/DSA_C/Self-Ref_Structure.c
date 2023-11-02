#include <stdio.h>

struct node {
    int data;
    int ob1,ob2;
    struct node* link;
};

int main() {
    struct node temp, ob1, ob2;
    
    // Assigning values
    ob1.data = 10;
    ob1.link = NULL;
    
    ob2.data = 20;
    ob2.link = NULL;
    
    ob1.link = &ob2;

    printf("%d\n", ob1.data);
    printf("%d\n", ob2.data);
    printf("%d\n", *ob1.link); // Use %p to print a pointer address

    return 0;
}
// another example of self referential structure
// #include <stdio.h>
// #include <stdlib.h>

// struct Node {
//     int data;
//     struct Node* next;
// };

// int main() {
//     // Creating nodes
//     struct Node node1, node2, node3;

//     // Assigning data and linking nodes
//     node1.data = 1;
//     node1.next = &node2;

//     node2.data = 2;
//     node2.next = &node3;

//     node3.data = 3;
//     node3.next = NULL;  // indicating the end of the list

//     // Traversing and printing the linked list
//     struct Node* current = &node1;
//     printf(" list elements: ");
//     while (current != NULL) {
//         printf("%d -> ", current->data);
//         current = current->next;
//     }
//     printf("NULL\n");

//     return 0;
// }
