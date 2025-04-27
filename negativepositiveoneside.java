public class negativepositiveoneside {
    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    public static void negpos(int[]arr) {
     int left=0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left]<0){
                left++;
            }
            if(arr[right]>0){
                right--;
            }
        }
    }
    public static void main(String[]args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println("original array : ");
        printarray(arr);
        System.out.println("sorted array ");
        negpos(arr);

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");


        }
    }
}
