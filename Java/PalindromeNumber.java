public class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        s = s.replaceAll("\\s", "");
        boolean res = true;
        
        char[] original = new char[s.length()];
        char[] reversa = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            original[i] = s.charAt(i);
            reversa[i] = s.charAt(s.length()-1-i);
        }
        
        for(int i = 0; i < original.length; i++){
            if(original[i] != reversa[i]){
                res = false;
            }
        }
        
        return res;
    }
}
