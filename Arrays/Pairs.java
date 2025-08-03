public class Pairs {

    static void getPairs(int arr[]){
        // first ele choose
        for(int i=0;i<arr.length-1;i++){
            //2nd ele
            for(int j = i+1 ;j< arr.length ;j++){
                System.out.println( arr[i] + " - "+arr[j]);
            }
        }

     
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        getPairs(arr);
    }
}
