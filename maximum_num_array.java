//calculate the maximum value out of all the element in the array
class Arrayexample {
    void maxofarray() {
        int[] arr = {5, 3, 6, 5, 2, 8, 4};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println(" max " + ans);
    }
}

        public class maximum_num_array{
            public static void main(String[]args){
                Arrayexample obj=new Arrayexample();
                obj.maxofarray();
            }
        }
