/*
Definition for Node
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
        return checkBalanced(root) !=-1;
    }
    
    static int checkBalanced(Node root){
        if(root == null) return 0;
        
        int leftHeight = checkBalanced(root.left);
        if(leftHeight==-1) return -1;
        
        int rightHeight = checkBalanced(root.right);
        if(rightHeight==-1) return -1;
        
        if(Math.abs(leftHeight-rightHeight)>1) return -1;
        
        return Math.max(leftHeight,rightHeight)+1;
        
    }
    
}