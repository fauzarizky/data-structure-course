public class MergeSortExample {
    static void merge(int[] arr, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = middle + 1, k = 0;

        while (i <= middle && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= middle) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // copy the sorted subarray into original array
        // arr[left..right]
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }

    static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Memanggil sort untuk bagian kiri dan kanan
            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            // Menggabungkan kedua bagian
            merge(arr, left, middle, right);
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Arrays sebelum diurutkan:");
        printArray(arr);

        sort(arr, 0, arr.length - 1);
        System.out.println("\nArrays setelah diurutkan:");
        printArray(arr);
    }
}
