/* Structure of a Tree Node
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
    public Node delNode(Node root, int x) {
        // code here
        if(root==null) return null;
        
        if(x<root.data){
            root.left = delNode(root.left,x);
        }else if(x>root.data){
            root.right = delNode(root.right,x);
        }else{
            
            if(root.left==null && root.right==null) return null;
            
            if(root.left==null) return root.right;
            
            if(root.right==null) return root.left;
            
            Node successor = findMin(root.right);
            
            root.data = successor.data;
            
            root.right = delNode(root.right,successor.data);
        }
        
         return root;
        
    }
    
    Node findMin(Node root){
            Node temp = root;
            while(temp.left!=null){
                temp = temp.left;
            }
            return temp;
        }
    
}
















