public class RemoveDuplicate {
    static void removeDuplicate(int[] arr){
        int len=arr.length;
        int left=0,right=1;
        while (right<len && left<right){
            if (arr[left]!=arr[right]){
                arr[left+1]=arr[right];
                left++;
                right++;
            } else{
                right++;
            }
        }
        for (int i=0;i<=left;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4,4};
        removeDuplicate(arr);
    }
}
