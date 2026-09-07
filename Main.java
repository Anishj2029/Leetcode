
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }
    
    void add(int data){
        
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        
        Node current = head;
        
        while(current.next != null){
            current = current.next;
        }
        
        current.next = newNode;
    }
    
    void remove(int data){
        if (head == null) {
            return;
        }
        Node current = head;
        
        while(current != null && current.data != data){
            current = current.next;
        }
        if(current == null) {
            return;
        }
        if(current == head){
            head = current.next;
            current.next = null;
            return;
        }
        Node prop = head;
        while(prop.next != current){
            prop = prop.next;
        }
        prop.next = current.next;
    }
    
    void update(int data, int updated){
         if (head == null) {
            return;
        }

        Node current = head;

        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current != null) {
            current.data = updated;
        }
        else {
            System.out.println("data not existed");
        }
         
    }
    
    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

    System.out.println("null");
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    LinkedList list = new LinkedList();
	    
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.display();
	    list.update(10,1000);
	    list.update(20,1000);
	    list.display();
	    
	    double result = (int) Math.ceil(7 / 2);
	    System.out.print(result);
	  
	}
}
