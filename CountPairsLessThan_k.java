class CountPairsLessThan_k {
    static int countPairs(int[] arr,int k){
        int len=arr.length;
        int left=0,right=len-1,count=0;
        while(left<right){
            if ((arr[left]+arr[right])<k){
                count+=(right-left);
                left++;
                right=len-1;
            } else{
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=8;
        System.out.println(countPairs(arr,k));
    }
}
