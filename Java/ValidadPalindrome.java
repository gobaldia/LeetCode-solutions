public class Solution {
    public static boolean isPalindrome(String s) {
        boolean res = true;
        char[] aux = new char[s.length()];
        s = s.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
        s = s.replaceAll("\\s+","");
        
        for(int i = s.length()-1; i >= 0; i--){
            aux[i] = s.charAt(s.length()-1-i);
        }
        
        for(int i = 0; i < s.length(); i++){
            if(! (aux[i] == s.charAt(i))){
                res = false;
            }
        }
        
        return res;
    }
}
