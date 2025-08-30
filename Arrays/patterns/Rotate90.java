public class Rotate90 {
    public static void main(String[] args) {
       int mat[][] = {{5,1,9,11}, {2,4,8,10},{13,3,6,7},{15,14,12,16}};
       print(mat); 
       transpose(mat);
       print(mat);
        reverseRow(mat);
        print(mat);
    }

    static void reverse (int arr[]){
        int i =0 ;
        while(i < arr.length/2){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i] ;
            arr[arr.length-1-i] = temp;
            i++;
        }
    }
    static void reverseRow(int arr[][]){
       for(int i =0 ;i < arr.length ;i++){
             reverse(arr[i]);
       }
       
    }
    static void transpose(int [][]arr){
        for(int i= 0 ;i < arr.length ;i++){
            for(int j =i ;j < arr[i] .length ;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void print(int [][]arr){
        for(int i=0;i<arr.length ;i++){
            for(int j =0 ;j < arr[i].length ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        
        }

        System.out.println("===============================");
    }
}
