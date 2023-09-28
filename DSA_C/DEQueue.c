#include <stdio.h>
// #include <conio.h>
#define MAXSIZE 10
void addfront();
void delfront();
void addrear();
void delrear();
void display();
int rear=-1 , front=0 , q[MAXSIZE];

void main(){
    int choice;
    printf("1.insert rear\n 2.insert front\n 3.delete rear\n 4.delete front\n 5.Display\n 6.Exit\n");
    do
    {
        printf("\n Enter choice :\n");
        scanf("%d" , &choice);
        switch (choice)
    {
    case 1: addrear();
        break;
    case 2: addfront();
        break;
    case 3: delrear();
        break;
    case 4: delfront();
        break;
    case 5: display();
        break;
    case 6:
        printf("Program exited");
        break;
    default:
    printf("Invalid choice");
        break;
    }
    } while (choice !=6);
    
}
void addrear(){
    int val;
    if (rear==MAXSIZE-1)
    {
        printf("cannot insert from rear\n");
    }
    else{
        printf("Enter the value: \n");
        scanf("%d" , &val);
        if ((front==-1)&&(rear==-1))
        {
            front=rear=0;
            q[rear]=val;
        }
        else{
            rear++;
            q[rear]=val;
        }
    }
}
void addfront(){
    int val;
    if (front==0)
    {
        printf("cannot insert from front\n");
    }
    else{
        printf("Enter the value: \n");
        scanf("%d" , &val);
        if ((front==-1)&&(rear==-1))
        {
            front=rear=0;
            q[front]=val;
        }
        else{
            front--;
            q[front]=val;
        }
    }
}
void delfront(){
    int x;
    if (front==-1)
    {
        printf("Queue is empty!\n");
    }
    else{
        x=q[front];
        if (front==rear)
        {
            front=rear=-1;
        }
        else{
            front++;
        }
        printf("Deleted value is: %d\n" ,x);
    }
}
void delrear(){
    int x;
    if (rear==-1)
    {
        printf("Queue is empty!\n");
    }
    else{
        x=q[rear];
        if (front==rear)
        {
            front=rear=-1;
        }
        else{
            rear++;
        }
        printf("Deleted value is: %d\n" ,x);
    }
}
void display(){
    int i;
    if (rear==-1)
    {
        printf("Queue is empty!\n");
    }
    else{
        for ( i = front; i <= rear; i++)
        {
            printf("%d \t", q[i]);
        }
        
    }
}