public class binomial_cofficent{
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
            return f;
        }

        public static int hello ( int a, int b){
            int fact_n = factorial(a);
            int fact_r = factorial(b);
            int fact_nmr = factorial(a - b);
            int bincoff = fact_n / (fact_r * fact_nmr);
            return bincoff;
        }

        public static void main (String[]args){
            System.out.println(hello(5, 2));


        }

    }

