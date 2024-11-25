public class DLL {
    Node head;
    Node tail;
    int length;

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        if(head!=null){
        }
        head =node;
        if(tail== null){
            tail=head;
        }
        length++;
    }
    public void insert(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        node.next=null;
        tail=node;
        length++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" <=> ");
            temp=temp.next;
        }
        System.out.println("End");
        System.out.println("Length of DLL: "+ length);
    }

    private class Node{
        int val ;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        DLL list=new DLL();
        list.insert(7);
        list.insert(4);
        list.insert(2);
        list.insert(9);
        list.insert(6);
        list.insert(8);
        list.display();
    }
}