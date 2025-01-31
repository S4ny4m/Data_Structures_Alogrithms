// Stack - LIFO (Last In First Out)
class Stack {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    Node top = null;
    public void display(){
        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }
        Node p = top;
        while(p!= null){
            System.out.println(p.data);
            p = p.next;
        }
        return;
    }
    public void push(int data){
        Node tmp = new Node(data);
        if(top != null){
            tmp.next = top;
        }
        else{
            tmp.next = null;
        }
        top = tmp;
        return;
    }
    public int pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = top.data;
        top = top.next;
        return x;
    }
    public int peek(){
        if(top == null){
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }
    
}
public class Main{
    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.display();
        
    }
}
