public class max_subarray_bruteforce {
    public static void maxsubarrraysum(int num[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currentsum=0;
                for(int k=start;k<=end;k++){
                    currentsum=currentsum+num[k];

                }
                System.out.println(currentsum);
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }

            }
        }
        System.out.println("max sum = "+maxsum);

    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        maxsubarrraysum(num);

    }
}
