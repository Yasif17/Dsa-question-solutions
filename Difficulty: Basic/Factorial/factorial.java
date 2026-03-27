class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        if(n==0) return 1;
        // code here
        int fact = 1;
        for(int i=n; i>0;i--){
            fact = fact*i;
        }
        return fact;
    }
}
