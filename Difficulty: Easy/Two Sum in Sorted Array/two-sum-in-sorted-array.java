class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        int n = arr.length-1;
        
        int i,j;
        i = 0;
        j = n;
        
        while(i < j){
            int sum = arr[i]+arr[j];
            if(sum == target){
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(i+1);
                ans.add(j+1);
                return ans;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);
        
        return ans;
        
    }
}