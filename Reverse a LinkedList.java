class Node{

    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}


public class ReverseLL {
    public Node head;
    public void Insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public Node reverse(Node head){
        if(head==null){
            return null;
        }
        Node previous =null;
        Node current =head;
        while(current!=null){
            Node temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
        }
        return previous;
    }
    public void print(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node currNode =head;
        while(currNode != null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
        //System.out.println("Null");
    }

    public static void main(String[] args) {
        ReverseLL obj = new ReverseLL();
        obj.Insert(10);
        obj.Insert(30);
        obj.Insert(40);
        obj.print();
        Node raj=obj.reverse(obj.head);
        while(raj!=null){
            System.out.print(raj.data+"->");
            raj=raj.next;
        }
        System.out.print("null");
    }


}
