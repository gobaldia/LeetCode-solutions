public class Solution {
    public void rotate(int[] nums, int k) {
        if(k > nums.length){
        k=k%nums.length;
        }
        int[] res = new int[nums.length];
        int r = nums.length-k;
        int s = 0;
        
        for (int j = 0; j < k; j++){
            res[j] = nums[r];
            r++;
        }
        
        for (int i = k; i < nums.length; i++){
            res[i] = nums[s];
            s++;
        }
        
        //System.arraycopy( res, 0, nums, 0, nums.length );
        
        for (int i = 0; i < nums.length; i++){
            nums[i] = res[i];
        }
    }
}
