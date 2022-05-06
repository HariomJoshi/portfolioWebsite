package collegePracticals;

import java.util.ArrayList;

public class queuesLLandArrays {
    public static void main(String[] args) {

        // Queue queue = new Queue(5);
        // queue.enqueue(23);
        // queue.enqueue(2);
        // queue.enqueue(3);
        // System.out.println(queue.dequeue());
        // queue.display();

        // applying functions in QueueLL

        QueueLL queue = new QueueLL();
        queue.enqueue(23);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(17);
        queue.enqueue(9);
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
        System.out.println("Dequeue -> " + queue.dequeue());
        queue.display();
        
    }
}

class Queue{
    private int s = -1;
    private int e = -1;
    private int[] arr;
    public Queue(int size){
        arr = new int[size];
    }

    public void enqueue(int number){
        if(isFull()){
            System.out.print("Queue is full! ");
            return;
        }
        e++;
        arr[e] = number;
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty! ");
            return -1;
        }
        s++;
        int num = arr[s];
        arr[s] = 0;
        return num;
    }

    public boolean isFull(){
        if(s == 0 && e == arr.length-1) return true;
        else return false;
    }

    public boolean isEmpty(){
        if(s == e) return true;
        else return false;
    }

    public int peek(){
        if(!isEmpty()) return arr[s];
        else return -1;
    }

    public void display(){
        for( int i = 0; i< arr.length; i++) System.out.print(arr[i] + " ");
    }
}

class QueueLL{
    private int e = 0;
    private ArrayList<Integer> list = new ArrayList<>();


    public void enqueue(int number){
        e++;
        list.add(number);
    }
    
    public int dequeue(){
        if(list.size() == 0){
            System.out.println("List is Empty!");
            return -1;
        }
        e--;
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    // public boolean isFull(){
    //     if(s == 0 && e == list.size()-1) return true;
    //     else return false;
    // }

    public boolean isEmpty(){
        if(list.size() == 0) return true;
        else return false;
    }

    public int peek(){
        if(!isEmpty()) return list.get(0);
        else return -1;
    }

    public void display(){
        for( int i = 0; i< list.size(); i++) System.out.print(list.get(i) + " ");
    }
}
