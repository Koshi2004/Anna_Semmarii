public class LongestSubString {
    static String longestSubstring(String s){
        int len=s.length();
        int left=0,right=left;
        String str="",temp="";
        while (right<len){
            if (!temp.contains(""+s.charAt(right))){
                temp+=s.charAt(right);
                if(temp.length()>str.length()) str=temp;
                right++;
            } else{
                left++;
                right=left;
                temp="";
            }
        }
        return str;
    }
    public static void main(String[] args){
        String s="semmariii";
        System.out.println(longestSubstring(s));
    }
}

