import java.util.*;

class Node{
    int data;
    Node next;
    public Node(){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    public void addElements(int[] arr, int x){
        Node pivot = null;
        Node current = new Node();
        current.data = arr[0];
        Node newnode = new Node();
        current.next = newnode;
        head = current;
        current = current.next;

        for (int i=1; i<arr.length; i++){
            current.data = arr[i];
            if (i<arr.length-1){
                Node newn = new Node();
                current.next = newn;
                if (i==x){
                    pivot = current;
                }
                current = current.next;
            }
        }
        current.next = pivot;
        System.out.println("Data added successfully");
        System.out.println();
    }

    public void display(){
        Node current = head;
        System.out.print("Display Circular Linked List:\n");
        for (int i=0; i<15; i++){
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

    public boolean checkExistence(){
        HashSet<Node> hash = new HashSet<>();
        Node current = head;
        Node slow = current;
        Node fast = current;

        while(fast != null){
            if (hash.contains(fast)){
                return true;
            }
            hash.add(slow);
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

}

public class CyclickLinkedList{
    public static void main(String[] args){
        int[] arr = {2,6,9,1,12,41,16};
        LinkedList ll = new LinkedList();

        ll.addElements(arr, 3);
        ll.display();
        if (ll.checkExistence() == true){
            System.out.println("\nThe Linked List contains cycle");
        }
        else{
            System.out.println("\nThe Linked List does not contains cycle");
        }
    }
}   