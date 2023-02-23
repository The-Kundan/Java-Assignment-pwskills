package Arrays_Assignment;

public class Array4 {
    public static void main(String[] args) {
        int [] arr ={2,-3,5,8,1,0,-4};
        int min=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            min=Math.min(min,arr[i]);
        }
        System.out.println("Minimum value: "+min);

    }
}
