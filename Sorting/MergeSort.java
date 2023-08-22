import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {10, 2, 10, 25, 3, 7, 10, 95, 32,10};
        Ms(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Ms(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;

        Ms(arr, start, mid);
        Ms(arr, mid + 1, end);
        Merge(arr, start, mid, end);
    }

    public static void Merge(int[] arr, int start, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }
    }
}
