#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next;
};

struct node *head, *temp, *new_node, *temp1;
void insert();
void intbeg();
void intend();
void intaft();
void intbef();
void del();
void delbeg();
void delend();
void delcer();
void display();

int main()
{
    int num, i, a;
    head=0;
    
    do{
        new_node=(struct node*)malloc(sizeof(struct node));
        new_node->next=0;
        printf("\nEnter The Data: ");
        scanf("%d", &new_node->data);
        
        if(head==0)
        {
            head=temp=new_node;
        }
        else
        {
            temp->next=new_node;
            temp=new_node;
        }
        printf("\nDo you want to continue?: ");
        scanf("%d", &i);
    }while(i);
    
    temp=head;
    while(temp->next!=0)
    {
        printf("\n%d\t%u", temp->data, temp->next);
        temp=temp->next;
    }
    printf("\n%d\t%u", temp->data, temp->next);
    
    do{
    printf("\n\nChoose an option \n1. Insertion \n2. Deletion \n3. Display \n4.END\t:");
    scanf("%d", &a);
    
    switch(a){
        case 1: 
        insert();
        break;
        
        case 2:
        del();
        break;
        
        case 3:
        display();
        break;
        
        case 4:
        printf("Ending....\n\n\nEnded!!");
        break;
        
        default: 
        printf("\nEnter a valid choice");
        break;
    }
    }while(a!=4);
    
    return 0;
    
}

void insert()
{
    int in; 
    printf("\n\n\nChoose What Insertion do you want \n1.Insert at Beginning \n2.Insert at End \n3.Insert before specific \n4.Insert after specific \t:");
    scanf("%d", &in);
    
    switch(in)
    {
        case 1:
        intbeg();
        break;
        
        case 2:
        intend();
        break;
        
        case 3: 
        intbef();
        break;
        
        case 4:
        intaft();
        break;
        
    }
}

void del()
{
    int d;
   printf("\nEnter your choice: \n1.Deletion at beginning \n2.Deletion at certain point \n3.Deletion at end\t: ");
   scanf("%d", &d);
   
   switch(d)
   {
       case 1:
       delbeg();
       break;
       
       case 2:
       delcer();
       break;
       
       case 3: 
       delend();
       break;
       
       default:
       printf("\nPlease Enter A VALID Choice\n");
       break;
   }
}

void display()
{
    temp = head;
    while(temp->next!=0)
    {
        printf("\n%d\t%u", temp->data, temp->next);
        temp=temp->next;
    }
    printf("\n%d\t%u", temp->data, temp->next);
}

void delbeg()
{
   temp=head;
   head=head->next;
   free(temp);
}

void intbeg()
{
  
  new_node=(struct node*)malloc(sizeof(struct node));
  
  new_node ->next=0;
  printf("Enter Data");
  scanf("%d", &new_node->data);
  
  if (head==0)
  {
      head=temp=new_node;
  }
   else
  {
    new_node->next=head;
    head=new_node;
  }

}

void intend()
{
    new_node=(struct node*)malloc(sizeof(struct node));
    
    new_node->next = 0;
    printf("\nEnter Data: ");
    scanf("%d", &new_node->data);
    
    if(head==0)
    {
        head=temp=new_node;
    }
    else
    {
        temp=head;
        while(temp->next!=0)
        {
            temp=temp->next;
        }
        temp->next=new_node;
    }
}

void intbef()
{
     int val;
   new_node=(struct node*)malloc(sizeof(struct node));
   new_node->next=0;
   printf("\nEnter Data: ");
   scanf("%d", &new_node->data);
   
   printf("\nEnter the data of node before which to be inserted: ");
   scanf("%d", &val);
   
   temp=head;
   while(temp->next->data!=val)
   {
       temp=temp->next;
   }
   new_node->next=temp->next;
   temp->next=new_node;
}

void intaft()
{
    int val;
   new_node=(struct node*)malloc(sizeof(struct node));
   new_node->next=0;
   printf("\nEnter Data: ");
   scanf("%d", &new_node->data);
   
   printf("\nEnter the data of node after which to be inserted: ");
   scanf("%d", &val);
   
   temp=head;
   while(temp->data!=val)
   {
       temp=temp->next;
   }
   new_node->next=temp->next;
   temp->next=new_node;
}

void delcer()
{
    int val;
    printf("\nEnter Element to be deleted: ");
    scanf("%d", &val);
    
    temp=head;
    while(temp->next->data!=val)
    {
        temp=temp->next;
    }
    temp1=temp->next;
    temp->next=temp1->next;
    free(temp1);
}

void delend()
{
    temp=head;
    while(temp->next->next!=0)
    {
        temp=temp->next;
    }
    free(temp->next);
    temp->next=0;
}