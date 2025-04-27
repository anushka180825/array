import java.util.*;
public class min_value_array {
    public static int smallest(int number[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(smallest > number[i]){
                smallest=number[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int number[]={9,2,14,16,29,8,4,89};
        System.out.println("the smallest number is : "+smallest(number));
    }
}
