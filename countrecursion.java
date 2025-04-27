public class countrecursion {
    public static int sod(int n){

        if(n<10){
            return 1;

        }
      return 1+sod(n/10);
    }
    public static void main(String[]args){
        int count;
        System.out.println(sod(123));
    }
}
