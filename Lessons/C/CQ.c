#include<stdio.h>
#include<stdlib.h>
#define MAX 5
int cqueue[MAX];
int front = -1, rear = -1;

void enqueue()
{
	int val;
	if (((front == 0) && (rear == MAX - 1)) || (front = rear + 1))
	{
		printf("Circular queue is FULL");
		return;
	}
	//check for empty queue, one element and multiple elements
	if ((front == -1) && (rear == -1))
	{
		front = rear = 0;
	}
	else if (rear == MAX - 1)
	{
		rear = 0;
	}
	else
		rear++;
	cqueue[rear] = val;
}

int deletecq()
{
	int delval;
	if ((front == -1) && (rear == -1)) //UNDERFLOWING 
	{
		printf("Circular queue is empty");
		return -1;
	}
	delval = cqueue[front];
	if (front == rear)
		front = rear = 0;
	else if (front == MAX - 1)
		front = 0;
	else
		front++;
	return delval;
}

void display()
{
	int i;
	if ((front == -1) && (rear == -1))
	{
		printf("Circular queue is empty");
		return;
	}
	if(front<rear)
	{
		for (i = front; i <= rear; i++)
		{
			printf("%d\n", cqueue[i]);
		}
	}
	else if (front == rear)
	{
		printf("%d\n", cqueue[front]);
	}
	else
	{
		for (i = front; i < MAX; i++)
		{
			printf("%d\n", cqueue[i]);
		}
	}
}

void main()
{
	int ch;
        do
    {
        printf("1.Insert\n 2.Delete\n 3.Display\n 4.Exit\n");
        printf("Enter choice:");
        scanf("%d",&ch);
        switch (ch)
        {
        case 1:
            enqueue();
            break;
        case 2:
            deletecq();
            break;
        case 3:
            display();
            break;
        case 4:
            break;
        }
    } while (ch!=4);
}