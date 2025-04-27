import java.util.*;
public class max_value_array{
    public static int getlargest(int number[]){
       int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                largest=number[i];
            }

        }
        return largest;
    }
    public static void main(String args[]){
        int number[]={9,2,14,16,29,8,4,89};
        System.out.println("the largest value is : "+getlargest(number));
    }
}
