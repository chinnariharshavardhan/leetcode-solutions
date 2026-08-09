class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        Node node = head;
        int i = 0;

        while(node != null && i < index) {
            node = node.next;
            i++;
        }

        if(node == null) {
            return -1;
        }

        return node.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);

        if(head == null) {
            head = node;
            return;
        }

        Node n = head;

        while(n.next != null) {
            n = n.next;
        }

        n.next = node;
    }

    public void addAtIndex(int index, int val) {

        if(index == 0) {
            addAtHead(val);
            return;
        }

        Node n = head;
        int i = 0;

        while(n != null && i < index - 1) {
            n = n.next;
            i++;
        }

        if(n == null) {
            return;
        }

        Node node = new Node(val);

        node.next = n.next;
        n.next = node;
    }

    public void deleteAtIndex(int index) {

        if(head == null) {
            return;
        }

        if(index == 0) {
            head = head.next;
            return;
        }

        Node n = head;
        int i = 0;

        while(n != null && i < index - 1) {
            n = n.next;
            i++;
        }

        if(n == null || n.next == null) {
            return;
        }

        n.next = n.next.next;
    }
}