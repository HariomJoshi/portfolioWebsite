package collegePracticals;

public class linkedListImplementation {
    public static void main(String[] args) {
        // SLL list = new SLL();
        // list.insertFirst(23);
        // list.insertFirst(45);
        // list.insertFirst(4);
        // list.insertFirst(5);
        // list.insertLast(90);
        // list.insertLast(111);
        // list.insert(69, 3);
        // list.deleteFirst();
        // list.deleteFirst();
        // list.deleteLast();
        // list.delete(2);
        // list.delete(0);
        // list.deleteLast();
        // list.display();

        // Doubly Linked List

        DLL list = new DLL();
        list.insertFirst(23);
        list.insertFirst(45);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(90);
        list.insertLast(111);
        list.insert(69, 3);
        list.deleteFirst();
        list.deleteFirst();
        list.deleteLast();
        list.delete(2);
        // list.delete(0);
        // list.deleteLast();
        list.display();

        CLL list2 = new CLL();
        list2.insert(23);
        list2.insert(24);
        list2.insert(7);
        list2.display();

    }
}

class SLL{
    private int size;
    private Node head;
    private Node tail;

    public SLL(){
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;
        // constructor 1
        public Node(int val){
            this.val = val;
        }
        // constructor 2
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val, head);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        if(head == null){
            head = tail;
        }
        size++;
    }

    // returns the node at a particular index
    public Node getNode(int index){
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    // inserts a node a particular index
    public void insert(int val, int index){
        Node prev = getNode(index-1);
        Node after = getNode(index);
        Node toBeInserted = new Node(val);
        prev.next = toBeInserted;
        toBeInserted.next = after;
        size++;
    }

    public void deleteFirst(){
        if(size ==1){
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(size == 1){
            head = null;
            tail = null;
            size --;
            return;
        }
        Node node = getNode(size-2);
        node.next = null;
        tail = node;
        size--;
    }

    public void delete(int index){
        if(index > size-1 || index< 0){
            System.out.println("Index out of bounds");
            return;
        }
        if(size <= 2){  // avoiding null pointer exception
            if(index == 0){
                deleteFirst();
            }else{
                deleteLast();
            }
            size--;
            return;
        }
        if(index == 0){
            deleteFirst();
        }
        Node prev = getNode(index-1);
        prev.next = prev.next.next;
        size--;
    }

    // function to display the whole linked list
    public void display(){
        Node temp = head;
        while(head != null){
            System.out.print(head.val + " ->");
            head = head.next;
        }
        System.out.println("END");
    }
}


class DLL{
    private int size;
    private Node head;
    private Node tail;
    public DLL(){
        this.size= 0;
    }

    private class Node{
        int val; 
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next  = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(size == 0){
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(size == 0){
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;

    }

    // returns the node at a particular index
    public Node getNode(int index){
        Node temp = head;
        for(int i = 0; i< index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int val, int index){
        if(size==1){
            if(index==0){
                insertFirst(val);
            }
            else{
                insertLast(val);
            }
            size++;
            return;
        }
        Node back = getNode(index-1);
        Node front = getNode(index);
        Node toBeInserted = new Node(val, front, back);
        back.next = toBeInserted;
        front.prev = toBeInserted;
        size++;
    }


    public void deleteFirst(){
        if(size == 1){
            head = null;
            tail = head;
            size--;
            return;
        }
        if(size == 0){
            System.out.println("Empty list");
            return;
        }
        head.next.prev = null;
        head = head.next;
    }

    public void deleteLast(){
        if(size == 1){
            tail = null;
            head = tail;
            size--;
            return;
        }
        if(size == 0){
            System.out.println("Empty list");
            return;
        }
        tail.prev.next = null;
        tail = tail.prev;
    }

    public void delete(int index){
        if(size<=2){
            if(index == 0){
                deleteFirst();
            }
            else{
                deleteLast();
            }
            return;
        }
        Node back = getNode(index-1);
        Node front = getNode(index+1);
        back.next = front;
        front.prev = back;

    }

    public void display(){
        Node temp = head;
        while(head != null){
            System.out.print(head.val + " <=> ");
            head = head.next;
        }
        System.out.println("END");
    }

}


class CLL{
    private Node head;
    private Node tail;
    private int size;
    public CLL(){
        this.size =0;
    }
    
    private class Node{
        int val; 
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next  = next;

        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if(size == 0){
            head = node;
            tail = node;
            head.next = tail;
            tail.next = head;
            size++;
            return;
        }
        // more than one node
        tail.next = node;
        node.next = head;
        size++;
    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        for(int i = 0; i<size; i++){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Back to " + head.val);
    }

    public void delete(int val){
        Node node = head;
        if(size == 0){
            System.out.println("List empty");
            return;
        }
        if(size ==1 && node.val == val){
            head = null;
            tail = null;
            size--;
            return;
        }
        if(size ==2){
            if(node.val == val){
                head = node.next;
                tail = node.next;
                node.next.next = node.next;
                size--;
                return;
            }else{
                node.next = node.next.next;
                size--;
                return;

            }
        }
        for(int i = 0; i< size; i++){
            if(node.next.val == val){
                node.next = node.next.next;
                size--;
                return;
            }
            node = node.next;
        }
    }
}