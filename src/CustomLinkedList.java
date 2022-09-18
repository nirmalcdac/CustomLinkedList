public class CustomLinkedList {
    Node head;

    public void insert(String data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.previous = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}