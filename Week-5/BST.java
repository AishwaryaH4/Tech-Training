
// Binary Search Tree (BST)

class Node{
    int data;
    Node left,right;
    Node(int value){
        data = value;
        left = right = null;
    }
}

public class BST {
    static Node root = null;
    static Node insert(Node root, int key){
        if(root == null) return new Node(key);
        if(key<root.data) 
            root.left = insert(root.left,key);
        else if(key > root.data) 
                root.right = insert(root.right,key);

        return root;
    }
    // Searching
    static boolean search(Node root,int key){
        if(root == null) return false;
        if(root.data == key) return true;
        if(key < root.data) 
            return search(root.left,key);
        else 
            return search(root.right,key);
    }
    static Node findMin(Node root){
        while(root.left != null)
            root = root.left;
        return root;
    }

    // Deleting
    static Node delete(Node root,int key){
        if(root == null) return null;
        if(key < root.data) 
            root.left = delete(root.left,key);
        else if(key > root.data) 
            root.right = delete(root.right,key);
        
        else{
            // case 1: no child
            if(root.left == null && root.right == null)
                return null;
            // case 2: one child
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            // case 3: two child
            Node temp = findMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right,temp.data);
        }
        return root;
    }  
    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    
    public static void main(String[] args){
        int values[]={50, 30, 70, 20, 40, 60, 80};
        // Insert
        for(int val:values){
            root = insert(root,val);
        }
        System.out.print("Inorder: ");
        inorder(root);

        // Search
        int searchKey = 40;
        System.out.println("\nSearch " + searchKey + " : " + search(root, searchKey));

        // Deletion
        root = delete(root, 50);
        System.out.print("After Deletion : ");
        inorder(root);
    }
}
