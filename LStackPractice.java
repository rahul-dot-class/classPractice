class LStackPractice {
    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        int z = stack.pop();
        System.err.println("z pop " + z);
        stack.print();
    }

}

class stack {
    Node head;

    void push(int v) {
        if (head == null) {
            head = new Node(v);
        } else {
            head = new Node(v, head);
        }

    }

    int pop() {
        Node temp = head;
        head = head.getNext();
        return temp.getV();

    }

    void print() {
        System.err.println("Printting ");
        Node temp = head;
        while (temp != null) {
            System.err.println(temp.getV());
            temp = temp.getNext();
        }

    }

}

class Node {

    private int v;

    private Node next;

    public Node(int v, Node next) {
        this.v = v;
        this.next = next;
    }

    public Node(int v) {
        this.v = v;
        next = null;
    }

    int getV() {
        return v;
    }

    Node getNext() {
        return next;
    }

    void print() {
        System.err.println("v= " + v);
        System.err.println("next= " + next);
    }

}
