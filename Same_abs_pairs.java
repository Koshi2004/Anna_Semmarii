public class Same_abs_pairs {
    static int countPairs(int[] arr,int k){
        int len=arr.length;
        int left=0,right=len-1,count=0;
        while (left<right){
            int diff=Math.abs(arr[right]-arr[left]);
            if (diff>k){
                right--;
            } 
            else if (diff==k){
                count++;
                left++;
                right=len-1;
            } 
            else{
                left++;
                right=len-1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        System.out.println(countPairs(arr,k));
    }
}
