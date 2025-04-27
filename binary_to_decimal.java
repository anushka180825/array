import java.util.Scanner;

public class binary_to_decimal{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int bn=sc.nextInt();
        int ans=0;
        int pv=1;
        while(bn>0){
            int ud=bn%10;
            ans=ans+(ud*pv);
            bn=bn/10;
            pv=pv*2;

        }
        System.out.println(ans);
    }
}
