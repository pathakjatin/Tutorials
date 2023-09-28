#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
    struct node *prev;
};
struct node *start = NULL; // Initialize the start pointer to NULL
struct node *tail = NULL; // Initialize the tail pointer to NULL
// function declaration
void addbegin();
void addrear();
void delbegin();
void delrear();
void displayfront();
void displayrear();

void main(){
    int choice;
    printf("\n1.Add at begin\n 2.Add at rear\n 3.Delete from begin\n 4.Delete from end\n 5.Display from front\n 6.Display from end\n 7.Exit\n"); 
    scanf("%d" , &choice);
    do
    {
        switch (choice)
        {
        case 1: addbegin();
            break;
        case 2:addrear();
            break;
        case 3: delbegin();
            break;
        case 4:delrear();
            break;
        case 5: displayfront();
            break;
        case 6: displayrear();
            break;
        case 7:printf("Program exited");
        break;
        default:printf("Invalid choice");
            break;
        }
    } while (choice!=7);
    
}
void addbegin(){
    int x;
    struct node *ptr;
    ptr=(struct node *) malloc(sizeof(struct node *));
    printf("Enter data :\n");
    scanf("%d" , &x);
    if (start==tail) //only 1 node present
    {
        ptr->data=x;
        ptr->next=tail;
        ptr->prev=start;
        start=tail=ptr;
    }
    else{               //for multiple nodes
        ptr->data=x;
        ptr->prev=NULL;
        ptr->next=start;
        start->prev=ptr;
        start=ptr;
    }
}
void addrear(){
    int x;
    struct node *ptr;
    ptr=(struct node *) malloc(sizeof(struct node *));
    printf("Enter data :\n");
    scanf("%d" , &x);
    if (start==tail) //only 1 node present
    {
        ptr->data=x;
        ptr->next=tail;
        ptr->prev=start;
        start=tail=ptr;
    }
    else{               //for multiple nodes
        ptr->data=x;
        ptr->next=NULL;
        ptr->prev=tail;
        tail->next=ptr;
        tail=ptr;
    }
}
void delbegin(){
    struct node *ptr;
    if (start==NULL)        //for no node
    {
        printf("List is empty");
    }
    else if (start==tail)       // for single node
    {
        start=ptr;
        start=tail=NULL;
        free(ptr);
    }
    else                        // for multiple nodes
    {
        ptr=start;
        start=start->next;
        start->prev=NULL;
        free(ptr);
    }
    
}
void delrear(){
    struct node *ptr;
        if (start==NULL)        //for no node
    {
        printf("List is empty");
    }
    else if (start==tail)       // for single node
    {
        start=ptr;
        start=tail=NULL;
        free(ptr);
    }
    else                        // for multiple nodes
    {
        ptr=tail;
        tail=tail->prev;
        tail->next=NULL;
        free(ptr);
    }
}
void displayfront(){

}
void displayrear(){
    
}