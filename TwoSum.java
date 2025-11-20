public class TwoSum {
    static void printPairs(int[] arr,int target){
        int len=arr.length;
        int right=len-1,left=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if (sum==target){
                System.out.println("("+arr[left]+","+arr[right]+")");
                left++;
                right--;
            } 
            else if (sum>target){
                right--;
            }
            else if (sum<target){
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 5, 7, 10};
        int target=9;
        printPairs(arr,target);   
    }
}
