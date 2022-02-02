package BST;

public class InsertNode {
    //Recursive fun
    public Node insertNode(Node root,int key){
        Node new_node=new Node(key);
        if(root==null)return new_node;
     else {   if(key<root.data){
            root.left=insertNode(root.left,key);
        }
        else if(key>root.data){
            root.right=insertNode(root.right,key);
        }
     }
        return root;
    }
    //Iterative method
    static Node insertNodeIter(Node root,int key){
        Node new_node=new Node(key);
        if (root==null)return new_node;
        Node parent=root;
        Node curr=root;
        //loop to return last leaf node as parent node
        while(curr!=null){
            parent=curr;
            if(key<curr.data){
                curr=curr.left;
            }
            else if(key>curr.data){
               curr=curr.right;
            }

        }
        if(key< parent.data){
            parent.left=new_node;
        }
        else if(key> parent.data){
            parent.right=new_node;
        }


   return root;
        }
}
