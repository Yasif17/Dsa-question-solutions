/*
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    
    int postIndex;
    
    Node buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length-1;
        
        return postIn(inorder,postorder,0,inorder.length-1);
        
    }
    
    Node postIn(int[] inorder,int[] postorder, int start,int end){
        if(start>end) return null;
        
        int rootVal = postorder[postIndex--];
        
        Node root = new Node(rootVal);
        
        int mid = 0;
        
        for(int i=start;i<=end;i++){
            if(inorder[i]==rootVal){
                mid = i;
                break;
            }
        }
        
        root.right = postIn(inorder,postorder,mid+1,end);
        root.left = postIn(inorder,postorder,start,mid-1);
        
        return root;
        
        
    }
    
}














