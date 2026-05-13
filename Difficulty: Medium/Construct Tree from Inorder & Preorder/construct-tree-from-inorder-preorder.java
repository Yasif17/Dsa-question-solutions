/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    
     static int preIndex = 0;
    
    public static Node buildTree(int inorder[], int preorder[]) {
        preIndex = 0;
        // code here
        return preIn(inorder,preorder,0,inorder.length-1);
    }
    
    public static Node preIn(int[] inorder, int[] preorder, int start,int end){
        
        if(start>end) return null;
        int rootVal = preorder[preIndex++];
        
        Node root = new Node(rootVal);
        
        int mid = 0;
        for(int i=start; i<=end;i++){
            if(inorder[i] == rootVal){
                mid = i;
                break;
            }
        }
        
        root.left = preIn(inorder,preorder,start,mid-1);
        root.right = preIn(inorder,preorder,mid+1,end);
        return root;
    }
    
}












