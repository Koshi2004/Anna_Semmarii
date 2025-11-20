import java.util.*;

public class ReverseArray {
    static int[] reverseArray(int[] arr){
        int len=arr.length;
        int right=len-1,left=0;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
