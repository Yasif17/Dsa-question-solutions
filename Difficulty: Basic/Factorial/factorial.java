class Solution {
    int factorial(int n) {
        // code here
        
        if(n==0) return 1;
        
        int result =1;
        
        for(int i=1; i<=n; i++){
            result = result*i;
        }
        
        return result;
    }
}
