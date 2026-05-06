/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfG {
    boolean isCompleteBT(Node root) {
        // add code here.
        if(root == null) return true;
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        boolean end = false;
        
        while (!q.isEmpty()){
            Node curr = q.poll();
            
            if(curr.left!=null){
                if(end) return false;
                q.offer(curr.left);
            }else{
                end = true;
            }
            
            if(curr.right!=null){
                if(end) return false;
                q.offer(curr.right);
            }else {
                end = true;
            }
        }
        return true;
    }
}