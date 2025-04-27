public class insertionsort {
    public static void insertion(int arr[]) {
        for(int i=1;i< arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main (String args[]){
        int arr[]={7,8,2,5,4,1,9};
        insertion(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


