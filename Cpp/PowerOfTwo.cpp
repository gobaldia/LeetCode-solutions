#include <cmath>

class Solution {
public:
    bool isPowerOfTwo(int n) {
        bool res = false;
        float aux = n;
        float i = 0;
        
        while(aux <= n){
            if(pow(2,i) == n){
                res = true;
            }
            aux = (float) pow(2,i);
            i++;
        }
        
        return res;
    }
    };
