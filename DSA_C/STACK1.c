#include <stdio.h>
#define SIZE 5
int stack[SIZE];
int top=-1;
void push();
void pop();
void peek();
void display();
int main(){
    int ch;
    do
    {
        printf("1.Push\n 2.Pop\n 3.Peek\n 4.Display\n 0.Exit\n");
        printf("Enter choice:");
        scanf("%d",&ch);
        switch (ch)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
        case 4:
            display();
            break;
        }
    } while (ch!=0);
    
    return 0;
}
//function to push element in stack
void push(){
    int x;
    if (top==SIZE-1)
    {
        printf("Stack is full\n");
    }
    else
    {
        printf("Enter the element to be pushed in Stack :\n");
        scanf("%d",&x);
        top=top+1;
        stack[top]=x;
    }
}
//function to pop element in stack
void pop(){
    int x;
    if (top==-1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        x=stack[top];
        top--;
        printf("Popped element is %d\n" ,x);
    }
}
//function to peek an element in stack
void peek(){
    int x;
    if (top==-1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        x=stack[top];
        printf("Element on top of stack is %d\n" ,x);
    }
}
//to disaplay
void display(){
    if (top==-1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        for (int i = top; i >= 0; i--)
        {
            printf("%d \n",stack[i]);
        }
        
    }
}