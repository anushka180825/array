public class evenoddoneside {
    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void evenodd(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] % 2 != 0 && arr[end] % 2 == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            if (arr[start] % 2 == 0) {
                start++;

            }
            if (arr[end] % 2 != 0) {
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("original array : ");
        printarray(arr);
        System.out.println("sorted array ");
        evenodd(arr);

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");


        }
    }
}