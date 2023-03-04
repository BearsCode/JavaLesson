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
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }

                logFile.write("После итерации " + (i + 1) + ": ");
                for (int k = 0; k < n; k++) {
                    logFile.write(arr[k] + " ");
                }
                logFile.write("\n");
            }
            logFile.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл журнала.");
            e.printStackTrace();
        }
    }
}
