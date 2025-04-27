//sum of the given array{4,5,6}
class hw {
    void sumofarray() {
        int[] age = {4, 5, 6};
        int sum = 0;
        for(int i = 0; i < age.length; i++) {
            sum = sum + age[i];
        }
        System.out.println(sum);
    }
}
    public class add_element_array{
        public static void main(String[] args) {
            hw obj = new hw();
            obj.sumofarray();


        }
    }
