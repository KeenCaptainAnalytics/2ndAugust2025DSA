public class DutchNatFlag {
    
    static void sortingDNF(int arr[]){
        int i =0;// 0 
        int j = arr.length-1 ;//2
        int k =0; //traversal

        for(;k<j;){
            if(arr[k]==0){
               int temp = arr[i];
               arr[i] = arr[k];
               arr[k] = temp;
               i++;
               k++; 
            }
            else if( arr[k]==1){
                k++;
            }
            else{
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k]= temp;
                j--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,1,1,0,1,1,2,2,2,2,1,1,0,0,0};

        sortingDNF(arr);
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
