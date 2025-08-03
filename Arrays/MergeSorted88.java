public class MergeSorted88 {

    static void utiliy(int nums1[], int m , int nums2[] , int n){
        int i = m-1;
        int j = n-1;

        int k = nums1.length-1;

        while(true){
            if(i==-1){
                while (k>=0) {
                    nums1[k] = nums2[j];
                    k--;
                    j--;
                }
                break;
            }
            if(j==-1){
                break;
            }
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else if(nums1[i]<= nums2[j]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
         int m = 3;
         int nums2[] = {2,5,6};
         int n = 3;

         utiliy(nums1, m , nums2, n);

         for(int i=0;i<nums1.length ;i++){
            System.out.print(nums1[i] + " ");
         }
    }
}
