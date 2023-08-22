#include <stdio.h>

int BinarySearch(int arr[], int left, int right, int target)
{
    while (left <= right)
    {
        int mid = left + (right - left);
        if (arr[mid] == target)
        {
            return mid;
        }
        if (arr[mid] > target)
        {
            right = mid - 1;
        }
        else
        {
            left = mid + 1;
        }
    }
    return -1;
}

int main()
{
    int arr[] = {0, 2, 4, 5, 10, 34, 56, 66, 70, 75, 80, 100};
    int n = sizeof(arr) / sizeof(arr[0]);
    int target = 5876;
    int index = BinarySearch(arr, 0, n - 1, target);
    printf("%d ", index);
    if (index == -1)
    {
        printf("Element not found in the array\n");
    }
    return 0;
}