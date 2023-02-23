package Arrays_Assignment;

public class Array5 {
    public static void main(String[] args) {
        int [] arr ={1,1,3,4,2,3,5,7,0};
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
