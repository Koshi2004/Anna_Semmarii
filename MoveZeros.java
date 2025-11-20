import java.util.*;

public class MoveZeros {
    static int[] moveZero(int[] arr){
        int len=arr.length;
        int left=0,right=0;
        while (right<len){
            if(arr[right]==0){
                right++;
            } else {
                arr[left]=arr[right];
                arr[right]=0;
                left++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,1,2,0,0,4,0};
        System.out.println(Arrays.toString(moveZero(arr)));
    }
}

