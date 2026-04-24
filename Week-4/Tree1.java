
// Binary Tree Traversals

class Node1{
    int data;
    Node1 left;
    Node1 right;
    Node1(int data){
        this.data=data;
        left=right=null;
    }
}

public class Tree1 {
    static void inorder(Node1 root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void preorder(Node1 root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node1 root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args){
        Node1 root=new Node1(1);
        root.left=new Node1(2);
        root.right=new Node1(3);
        root.left.left=new Node1(4);
        root.left.right=new Node1(5);
        root.right.left=new Node1(6);
        root.right.right=new Node1(7);

        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
}
