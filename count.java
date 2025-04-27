public class count {
    public static int count(int arr[],int x){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={1,2,4,7,8,6,1,1,5,4,1,7,5,2,1,4,8,1,1,4,1,4,1,1};
        int x=1;
        System.out.println(count(arr,x));


    }
}
