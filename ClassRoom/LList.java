public class LList {
    Node head;

    public Node create(int value) {
        Node node = new Node(value);

        node.next = null;
        return node;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void display(Node h) {
        Node temp = h;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("end");

    }

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LList list = new LList();
        // Node head=list.create(2);
        // head.next=list.create(6);
        // head.next.next=list.create(8);
        // list.display(head);
        
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertFirst(8);
        list.display();
    }

}
