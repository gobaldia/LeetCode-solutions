public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String[] parts = s.split(" ");
        String res = "";
        
        for(int i = parts.length-1; i >=0; i--){
            res += parts[i] + " ";
        }
        
        res = res.trim();
        
        return res;
        }
}
