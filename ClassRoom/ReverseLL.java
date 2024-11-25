public class ReverseLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        private Node head;

        public SinglyLinkedList() {
            this.head = null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public void reverse() {
            head = reverseRecursive(head);
        }

        private Node reverseRecursive(Node node) {
            if (node == null || node.next == null) {
                return node;
            }
            Node newHead = reverseRecursive(node.next);
            node.next.next = node;
            node.next = null;
            return newHead;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(5);
        list.add(8);
        list.add(3);
        list.add(9);
        list.add(7);

        System.out.print("Original list: ");
        list.printList();

        list.reverse();

        System.out.print("Reversed list: ");
        list.printList();
    }
}
