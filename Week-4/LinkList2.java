
// Insert at beginning in singly linked list

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

public class LinkList2 {
    Node head;
    LinkList2(){
        head=null;
    }
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        LinkList2 l=new LinkList2();
        l.insertAtBeginning(10);
        l.insertAtBeginning(20);
        l.insertAtBeginning(30);
        l.insertAtBeginning(40);
        l.display();
    }
}
