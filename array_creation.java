import java.util.Scanner;

public class array_creation {
    public static void main(String args[]){
        System.out.println("enter the size of array : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("there are "+size+"element in array ");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
