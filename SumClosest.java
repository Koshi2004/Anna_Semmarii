public class SumClosest {
    static int closestSum(int[] arr,int target){
        int diff=Integer.MAX_VALUE;
        int sum=0;
        int len=arr.length;
        for (int i=0;i<len-2;i++){
            int left=i+1,right=len-1;
            while (left<right){
                int tot=arr[i]+arr[left]+arr[right];
                if (tot>target){
                    if (diff>Math.abs(target-tot)){
                        diff=Math.abs(target-tot);
                        sum=tot;
                    }
                    right--;
                } else{
                    if (diff>Math.abs(target-tot)){
                        diff=Math.abs(target-tot);
                        sum=tot;
                    }
                    left++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={-4,-1,1,2};
        int target=1;
        System.out.println(closestSum(arr,target));
    }
}
