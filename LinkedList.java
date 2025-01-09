import java.util.*;

class Node{
    int data;
    Node next;
}

public class LinkedList{
    Node head;

    public Node createLinkedList(int[] arr){
        head = new Node();
        head.data = arr[0];
        if(arr.length==1){
            return head;
        }

        head.next = new Node();
        Node current = head.next;
        int i = 1;
        
        while(i<arr.length){
            current.data = arr[i];
            if (i!= arr.length-1){
                current.next = new Node();
                current = current.next;
            }
            i++;
        }

        return head;
    }

    public void displayLinkedList(Node start){
        System.out.print("Linked List: ");
        Node current = start;
        while(current!=null){
            if(current.next != null){
                System.out.print(current.data + "->");
            }
            else{
                System.out.print(current.data);
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {45, 23, 76, 12, 95, 31};
        System.out.println("Array: "+ Arrays.toString(arr));
        LinkedList lst = new LinkedList();
        Node start = lst.createLinkedList(arr);
        lst.displayLinkedList(start);
    }
}