public class QuikSort {
    public static void main(String[] args) {
        int arr [] = {10, 2, 10, 25, 3, 7, 10, 95, 32,10};
        Qs(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Qs(int arr[], int start, int end){
        if(start < end) {
            int partInd = partation(arr,start,end);
            Qs(arr,partInd+1,end);
            Qs(arr,start,partInd-1);
        }
    }

    public static int partation(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start + 1;
        int j = end;
    
        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
    
            while (j >= i && arr[j] > pivot) {
                j--;
            }
    
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;
        return j;
    }
}
