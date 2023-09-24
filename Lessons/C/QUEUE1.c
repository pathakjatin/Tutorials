#include<stdio.h>
#include<stdlib.h>
#define MAX 5
int queue[MAX];
int front = -1, rear = -1;

void insert(int val)
{
	if (rear == MAX - 1)
	{
		printf("Queue is OVERFLOWING!!");
		return;
	}
	if ((front == -1) && (rear == -1)) //means queue is empty
	{
		front = 0;
		rear = 0;
	}
	else
		rear++;
	queue[rear] = val;
}

int deleteq()
{
	int delval;
	if ((front == -1) && (rear == -1))
	{
		printf("Queue is UNDERFLOWING!!");
		return -1;
	}
	else if (front == rear)
	{
		delval = queue[front];
		front = -1;
		rear = -1;
		return delval;
	}
	else
	{
		delval = queue[front];
		front++;
		return delval;
	}
}

void display()
{
	int i;
	if ((front == -1) && (rear == -1))
	{
		printf("Stack is UNDERFLOWING!!");
	}
	else
	{
		for (i = front; i <= rear; i++)
		{
			printf("%d\n", queue[i]);
		}
	}
}

void main()
{
	int choice,val;
	for (;;)
	{
		printf("1.insert\n2.delete\n3.display\n");
		printf("Enter your choice:"); scanf("%d", &choice);
		switch (choice)
		{
		case 1: printf("Enter a number:\n"); scanf_s("%d", &val);
			insert(val);
			break;
			
		case 2: deleteq();
			break;

		case 3: display();
			break;

		default: exit(0);
		}
	}
}