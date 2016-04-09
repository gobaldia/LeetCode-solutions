public class Solution {
    public static boolean isPowerOfTwo(int n) {
        boolean res = false;
        float aux = n;
        float i = 0;
        
        while(aux <= n){
            if(Math.pow(2,i) == n){
                res = true;
            }
            aux = (float) Math.pow(2,i);
            i++;
        }
        
        return res;
    }
}
