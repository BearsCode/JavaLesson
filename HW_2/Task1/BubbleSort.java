// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.
package Task1;
import java.io.FileWriter;
import java.io.IOException;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 42, 6, 1, 3, 2};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] arr) {
        try {
            FileWriter logFile = new FileWriter("log.txt");
            int n = arr.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                logFile.write("После итерации " + (i + 1) + ": ");
                for (int k = 0; k < n; k++) {
                    logFile.write(arr[k] + " ");
                }
                logFile.write("\n");
                if (!swapped) {
                    break;
                }
            }
            logFile.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл журнала.");
            e.printStackTrace();
        }
    }
}
