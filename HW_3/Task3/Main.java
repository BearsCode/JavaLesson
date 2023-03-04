package HW_3.Task3;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 6, 4, -4, 52, 14, 256, 0};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int len = arr.length;
        if (len == 1) return;

        int[] left = new int[len - (len / 2)];
        int[] right = new int[len / 2];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = arr[ (len - (len / 2)) + j ];
        }

        mergeSort(right);
        mergeSort(left);
        merge(arr, right, left);
    }

    private static void merge(int[] arr, int[] right, int[] left) {
        int cursorLeft = 0;
        int cursorRight = 0;

        for (int i = 0; i < arr.length; i++) {

            if (cursorLeft == left.length) {
                for (int j = cursorRight; j < right.length; j++) {
                    arr[i++] = right[j];
                }
                break;
            }

            if (cursorRight == right.length) {
                for (int j = cursorLeft; j < left.length; j++) {
                    arr[i++] = left[j];
                }
                break;
            }

            if(left[cursorLeft] <= right[cursorRight]){
                arr[i] = left[cursorLeft];
                cursorLeft++;
            }else{
                arr[i] = right[cursorRight];
                cursorRight++;
            }
        }
    }
}