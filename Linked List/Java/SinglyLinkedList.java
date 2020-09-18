class Node{
    int data;
    Node next;
}
class LinkedList{
        Node head;
        public void insert(int data){
            Node p = new Node();
            p.data = data;
            p.next = null;
            if(head == null){
                head = p;
            }
            else{
                Node n = head;
                while(n.next != null){
                    n = n.next;
                }
                n.next = p;
            }
        }
        
        public void print(){
            Node p = head;
            while(p!= null){
                System.out.println(p.data+" ");
                p = p.next;
            }
        }
        public void insertStart(int data){
            Node p = new Node();
            p.data= data;
            p.next = head;
            head = p;
            
        }
        public void insertPos(int pos,int data){
            Node p = new Node();
            Node tmp = new Node();
            int count = 0;
            p = head;
            if(pos == 0){
                tmp.data = data;
                tmp.next = head;
                head = tmp;
                return;
            }
            while(p!= null){
                if(count == pos-1){
                    tmp.data = data;
                    tmp.next = p.next;
                    p.next = tmp;
                    return;
                }
                p = p.next;
                count++;
            }
        }
}


public class Main{
    public static void main(String args[]){
        LinkedList linkedlist = new LinkedList();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insertStart(3);
        linkedlist.insertPos(2,9);
        linkedlist.print();
    }
}
