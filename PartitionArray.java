import java.util.*;

public class PartitionArray {
    static int[] partitionArray(int[] arr){
        int left=0,right=0;
        while (right<arr.length){
            if (arr[right]>0){
                right++;
            } else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right=left;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={-1,2,4,-3,-6,4,-2};
        System.out.println(Arrays.toString(partitionArray(arr)));
    }
}
