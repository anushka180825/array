public class alternativesignsumrecurrsion {
    public static int alternativesum(int n){
        if(n==0)return 0;
        if(n%2==0){
            return alternativesum(n-1)-n;
        }else {
            return alternativesum(n-1)+n;
        }
    }
    public static void main(String[]args){
        int n=5;
        System.out.println(alternativesum(n));
    }
}
