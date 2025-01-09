

class Node{
    int data;
    Node next;
}

public class Cyclic{
    Node head;
    public Node createCyclicLinkedList(){
        head = new Node();
        head.data = 18;
        head.next = new Node();
        
        
        Node current = head.next;
        current.data = 32;
        current.next = new Node();
        Node store = current;
        
        current = current.next;
        current.data = 54;
        current.next = new Node();

        current = current.next;
        current.data = 63;
        current.next = new Node();

        current = current.next;
        current.data = 73;
        current.next = store;
        
        return head;
    }

    public boolean checkCyclicLinkedList(Node start){
        Node slow = start.next;
        Node fast = start.next.next;

        while (fast!=null && fast.next!=null) { 
            if (slow == fast){
                slow = start;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                System.out.println("\nThe point of intersection is "+ slow.data);
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public void displayCyclicLinkedList(Node start){
        Node current = start;

        int i = 0;

        System.out.print("Linked List: ");
        while(i<30){
            System.out.print(current.data + "->");
            current = current.next;
            i++;
        }
    }

    public static void main(String[] args) {
        Cyclic cl = new Cyclic();
        Node start = cl.createCyclicLinkedList();
        cl.displayCyclicLinkedList(start);
        boolean isCylic = cl.checkCyclicLinkedList(start);

        if (isCylic == true){
            System.out.println("The linked list is cyclic");
        }
        else{
            System.out.println("The linked list is not cyclic");
        }
    }
}