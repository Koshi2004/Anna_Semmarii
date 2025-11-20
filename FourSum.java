import java.util.*;

public class FourSum {
    static List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> arr=new ArrayList<>();
        int len=nums.length;
        for (int i=0;i<len-3;i++){
            for (int j=i+1;j<len-2;j++){
                int left=j+1,right=len-1;
                while (left<right){
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum==target){
                        arr.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if (sum>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={-2,-1,0,0,1,2};
        int target=0;
        System.out.println(fourSum(arr,target));
    }
}
