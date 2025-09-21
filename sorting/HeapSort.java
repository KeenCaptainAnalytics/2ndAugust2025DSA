public class HeapSort {
    static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void convertIntoHeap(int arr[]){

        for(int i = arr.length-1 ;i>=0 ;i--){
            
            int ci = i;
        
            while(ci < arr.length ){
                 int li = 2*ci +1 ;
                int ri = 2*ci +2 ;
                if(li<arr.length && ri<arr.length && arr[li]<arr[ri]){
                    if(arr[ci] > arr[li]){
                        swap(arr, ci , li);
                        ci = li;
                    }
                    else{
                        break;
                    }
                }
                else if(li<arr.length && ri<arr.length && arr[li]> arr[ri]){
                    if(arr[ci] > arr[ri]){
                        swap(arr, ci , ri);
                        ci = ri;
                    }
                    else{
                        break;
                    }
                }
                else if(li<arr.length  && arr[ci] > arr[li]){
                     swap(arr, ci , ri);
                    ci = ri;
                }
                else{
                    break;
                }

            }

        }
    }

    static int delete(int arr[] , int n){
        int eleDel = arr[0];
        arr[0] = arr[arr.length-n];
        int ci = 0 ;
        while(ci< arr.length){
            
            int lc= 2*ci +1 ;
            int rc=  2*ci +2; 

            if(lc < arr.length && rc < arr.length && arr[lc]< arr[rc]){
                if(arr[ci]> arr[lc]){
                    swap(arr, ci, lc);
                    ci = lc;
                }
                else{
                    break;
                }
            }
            else if(lc < arr.length && rc < arr.length && arr[rc] < arr[lc]){
                if(arr[ci]> arr[rc]){
                    swap(arr, ci, rc);
                    ci = rc;
                }
                else{
                    break;
                }
            }
            else if(lc < arr.length && rc == arr.length && arr[lc] < arr[ci]){
                swap(arr, ci, lc);
                break;
            }
            else{
                break;
            }
        }
        return eleDel;
    }
    public static void main(String[] args) {
        int heap[] = {2,5,1,8,9,12};
        convertIntoHeap(heap);
        print(heap, heap.length-1);

        System.out.println(delete(heap , 1));
        print(heap, heap.length-2);
        System.out.println(delete(heap , 2));
        print(heap, heap.length-3);
        System.out.println(delete(heap , 3));
        print(heap, heap.length-4);
        System.out.println(delete(heap , 4));
        print(heap, heap.length-5);
    }

    static void print(int arr[],  int hi){
        for(int i=0;i <= hi;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
