#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node* link;
};
typedef struct node *listptr; //we are calling this pointer as listptr
listptr insertfront(int value, listptr first)
{
	listptr newnode;
	newnode = (listptr)malloc(sizeof(struct node)); //typecasting by listptr
	if (first == NULL) //case 1
	{
		newnode->data = value;
		newnode->link = NULL;
		return newnode;
	}
	//case 2 and case 3
	newnode->data = value;
	newnode->link = first;
	return newnode; //bcz newnode is the new first node
}

listptr deletefront(listptr first)
{
	listptr newfirst, delnode;
	if (first == NULL)
	{
		printf("Nothing can be deleted, the linked list is empty");
		return NULL; //return first;
	}
	if (first->link == NULL)
	{
		free(first);
		return first; //return NULL;
	}
	delnode = first;
	newfirst = delnode->link; //initialising newfirst to link of delnode
	first = newfirst; //whatever in newfirst is now called as first
	printf("The deleted value is %d\n", delnode->data);
	free(delnode);
	return newfirst; //return first;
}

listptr insertrear(int value, listptr first) //first is just a reference pointer
{
	listptr newnode, trail;
	newnode = (listptr)malloc(sizeof(struct node));
	if (first == NULL)
	{
		newnode->data = value;
		newnode->link = NULL;
		return newnode; //newnode is the newfirst node
	}
	//case 2 and 3
	trail = first; //below is case 3
	while (trail->link != NULL)
	{
		trail = trail->link;           //cond true for all the nodes except last node  
	}
	trail->link = newnode;
	newnode->data = value;
	newnode->link = NULL; //if newnode is null and accessing null pointer link is not possible
	return first;
}

listptr deleterear(listptr first)
{
	listptr newlast, trail;
	if (first == NULL) //case 1
	{
		printf("The linked list is empty so nothing can be deleted!!");
		return NULL; //return first;
	}
	//case 2
	if (first->link == NULL) //means only one node
	{
		printf("The deleted value is %d\n", first->data);
		free(first);
		return NULL;
	}
	//case 3
	trail = first;
	newlast = NULL;
	while (trail->link != NULL)
	{
		newlast = trail;
		trail = trail->link;
	}
	printf("The deleted value is %d\n", trail->data); //do before free func.
	newlast->link = NULL;
	free(trail);
	return first;
}

void display(listptr first)
{
	listptr trail;
	if (first == NULL)
	{
		printf("Linked list is empty,nothing can be display!!");
		return;
	}
	trail = first;
	while (trail->link!= NULL)
	{
		printf("%d\n", trail->data); //check...if %d
		trail = trail->link;
	}
	printf("%d\n", trail->data); //this is for the last node...will be executed only once
	//return first; //returning first bcz first is the reference variable
}

void main() //cannot pass parameters
{
	listptr first = NULL; //initially no nodes in the list
	int choice, value;//check if newlast shd be added
	for (;;)
	{
		printf("1.Inserting from the front end\n2.Deleting from the front end\n3.Inserting from the rear end\n4.Deleting from the rear end\n5.Display\n");
		printf("Enter your choice:\n"); scanf("%d", &choice);
		switch (choice)
		{
		case 1:printf("Enter a number:\n"); scanf("%d", &value);
			first = insertfront(value, first);
			break;
		case 2:first = deletefront(first);
			break;
		case 3:printf("Enter a value:"); scanf("%d", &value);
			first = insertrear(value, first);
			break;
		case 4:first = deleterear(first);
			break;
		case 5:display(first);
			break;
		default:printf("Wrong choice program is terminating!!");
			exit(1);
		}
	}
}