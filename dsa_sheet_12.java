//array min max question from dsa sheet

public class dsa_sheet_12{
        public static int find(int arr[]){
            int largest=Integer.MIN_VALUE;
            int smallest=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(largest<arr[i]){
                    largest=arr[i];
                }
                if(smallest>arr[i]){
                    smallest=arr[i];
                }
            }
            System.out.println("smallest value is :"+smallest);
            return largest;
        }
        public static void main(String args[]){
            int arr[]={3,2,1,56,10000,167};
            System.out.println("largest value is : "+find(arr));
        }
    }



