package collegePracticals;

import java.util.ArrayList;

public class stacksLLandArray {
    public static void main(String[] args) {
        // Stack stack = new Stack(5);
        // System.out.println(stack.isNull());
        // stack.push(89);
        // stack.push(43);
        // stack.push(9);
        // stack.push(3);
        // stack.display();
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // stack.push(3544);
        // stack.push(3544);
        // stack.push(3544);
        // stack.push(3544);
        // System.out.println("-----------------");
        // stack.display();

        // stack LL

        StackLL stack = new StackLL();
        System.out.println(stack.isNull());
        stack.push(89);
        stack.push(43);
        stack.push(9);
        stack.push(3);
        stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(3544);
        stack.push(3544);
        stack.push(3544);
        stack.push(3544);
        System.out.println("-----------------");
        stack.display();
        
    }
    
}

class Stack{
    private int[] arr;
    private int n = -1;
    public Stack(int size){
        arr = new int[size];
    }

    public void push(int number){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        n++;
        arr[n] = number;
    }

    public int pop(){
        if(isNull()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int last = arr[n];
        arr[n] = 0;
        n--;
        return last;

    }

    public boolean isFull(){
        if(n == arr.length-1) return true;
        else return false;
    }

    public boolean isNull(){
        if(n == -1) return true;
        else return false;
    }

    public void display(){
        for(int i = arr.length-1; i>=0; i--) System.out.println(arr[i]);
    }
    
    public int peek(){
        return arr[n];
    }


}

// there must not be any stackOverflow in these kinda stacks
class StackLL{
    private int n = -1;
    private ArrayList<Integer> list = new ArrayList<>();

    public void push(int number){
        // if(isFull()){
        //     System.out.println("Stack Overflow");
        //     return;
        // }
        n++;
        list.add(number);
    }

    public int pop(){
        if(isNull()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int last = list.get(n);
        list.remove(n);
        n--;
        return last;

    }

    // public boolean isFull(){
    //     if(n == list.size()-1) return true;
    //     else return false;
    // }

    public boolean isNull(){
        if(n == -1) return true;
        else return false;
    }

    public void display(){
        for(int i = list.size()-1; i>=0; i--) System.out.println(list.get(i));
    }
    
    public int peek(){
        return list.get(n);
    }
}