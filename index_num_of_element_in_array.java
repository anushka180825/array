//
class arrayofindex {
    void findindex(){
        int[] arr={10,5,3,6,2,3,4};
        int x=2;
        int ans=-1;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]==x){
                        ans=i;
                    }
                }
        System.out.println("found"+ x +"at index"+ans);
    }

}
public class index_num_of_element_in_array{
    public static void main(String[] args) {
        arrayofindex obj=new arrayofindex();
        obj.findindex();

    }
}
