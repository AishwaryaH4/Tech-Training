
// InsertAtBeginning in Double Linked List

public class LinkList7 {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }

    Node head, tail;
    LinkList7() {
        head = tail = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkList7 l = new LinkList7();
        l.insertAtBeginning(40);
        l.insertAtBeginning(30);
        l.insertAtBeginning(20);
        l.insertAtBeginning(10);
        l.display();
    }
    
}
