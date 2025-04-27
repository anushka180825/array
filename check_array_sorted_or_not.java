public class check_array_sorted_or_not {
    public static boolean sorted(int arr[]){
        boolean check=true;
        for(int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }
    public static void main(String arg[]){
        int arr[]={1,5,6,7};
        System.out.println(sorted(arr));

    }
}
