package interview.mergesort;

public class Mergesort {
    public static void main(String[] args) {
        int arr[] = {1, 21, 34, 5, 2, 4, 6, 8, 8, 9, 10, 1, 4, 3};

        System.out.println("Given Array");
        printArray(arr);

        sort(arr);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    public static void sort(int[] arr) {
        mergesort(arr, 0, arr.length - 1);
    }


    /**
     *
     * @param arr array to be sorted
     * @param l left index of arr
     * @param r right index of arr
     */
    public static void mergesort(int[] arr, int l, int r) {
        if (l < r) {
            int m =  (l + r) / 2;
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    /**
     *
     * @param arr array to be sorted
     * @param l left index of arr
*      @param m middle index of arr
     * @param r right index of arr
     */
    public static void merge(int[] arr, int l, int m, int r) {
        int i, j, k;

        int n1 = m - l + 1;
        int n2 =  r - m;

        // temp arrays
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];

        for (i = 0; i < n1; i++) {
            a1[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            a2[j] = arr[m + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) {
                arr[k] = a1[i];
                i++;
            } else {
                arr[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = a1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = a2[j];
            j++;
            k++;
        }
    }
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
