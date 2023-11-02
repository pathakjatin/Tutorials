#include <stdio.h>
int binarySearch(int arr[], int size, int element){
    int low=0, mid ,high=size-1;
    while (low<=high)
    {
        mid=(low+high)/2;
        if (arr[mid]==element)
        {
            return mid;
        }
        if (arr[mid]<element)
        {
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return -1;
}
int main(){
    int arr[6];
    int element;
    printf("Enter sorted array: \n");
    for (int i = 0; i < 6; i++)
    {
        scanf("%d", &arr[i]);
    }
    int size=sizeof(arr)/sizeof(int);
    printf("Enter the element to be found:\n");
    scanf("%d",&element);
    int searchIndex=binarySearch(arr,size,element);
    printf("The element %d was found at index %d \n",element,searchIndex);
    return 0;
}