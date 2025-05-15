public class CountingSortExample {
    static void sort(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }

        int[] count = new int[max + 1];
        for (int i : arr) {
            count[i]++;
        }

        int index = 0;
        for (int i = max; i >= 0; i--) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        System.out.println("Array sebelum diurutkan:");
        printArray(arr);

        sort(arr);

        System.out.println("Array setelah diurutkan:");
        printArray(arr);
    }
}
