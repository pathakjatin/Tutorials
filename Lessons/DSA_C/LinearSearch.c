#include <stdio.h>
int linearSearch(int arr[],int size,int element){
    for (int i = 0; i < size; i++)
    {
        if (arr[i]==element)
        {
            return i;
        }
    }
    return -1;
}
int main(){
    int arr[10];
    int element;
    printf("Enter sorted/unsorted array: \n");
    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &arr[i]);
    }
    int size=sizeof(arr)/sizeof(int);
    printf("Enter the element to be found:\n");
    scanf("%d",&element);
    int searchIndex=linearSearch(arr,size,element);
    printf("The element %d was found at index %d \n",element,searchIndex);
    return 0;
}