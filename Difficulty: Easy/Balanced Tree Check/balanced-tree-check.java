/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return checkBal(root)!=-1;
    }
    
    public int checkBal(Node root){
        if(root == null) return 0;
        
        int left = checkBal(root.left);
        int right = checkBal(root.right);
        
        if(left == -1 || right == -1) return -1;
        
        if(Math.abs(left-right)>1) return -1;
        
        return Math.max(left,right)+1;
        
    }
}