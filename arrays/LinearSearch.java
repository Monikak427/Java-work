public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {9,2,4,3,1,5};
        int key = 5;
        for(int i=0;i<arr.length;i++){
            if(key == arr[i]){
                System.out.println("Element " + key + " Found at index "+ (i+1));
                break;
            }
        }
    }
}
