class Node {

    int data;

    Node next;
 
    // constructor to initialize a new node with data

    Node(int new_data) {

        this.data = new_data;

        this.next = null;

    }

}
 
public class Main {

    public static void main(String[] args) {
 
        // Create the first node (head of the list)

        Node head = new Node(2);
 
        // Link the second node

        head.next = new Node(3);
 
        // Link the third node

        head.next.next = new Node(5);
 
        // Link the fourth node

        head.next.next.next = new Node(6);
 
 
        int a = 1;

        head = insertInStart(head, a);
 
        int b = 7;

        head = insertInEnd(head, b);
 
        int c = 4;

        int position = 4;

        head = insertInMiddle(head, c, position);
 
 
 
        // printing linked list

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null)

                System.out.print(" -> ");
 
            temp = temp.next;

        }

    }
 
    static Node insertInStart(Node head, int a) {

        Node newNode = new Node(a);

        newNode.next = head;
 
        return newNode;

    }
 
    static Node insertInEnd(Node head, int b) {

        Node temp = head;

        Node newNode = new Node(b);
 
        if (head == null) {

            return newNode;

        }
 
        while (temp.next != null) {

            temp = temp.next;

        }
 
        temp.next = newNode;
 
        return head; // ✅ return original head

    }
 
    static Node insertInMiddle(Node head, int c, int position) {
 
        if (position < 1) {

            return head;

        }

        if (position ==1){

            Node newNode = new Node(c);

            newNode.next = head;

            return newNode;

        }

        Node current = head;

        for(int i = 1; i < position - 1 && current != null ; i++){

            current = current.next;

        }


        if(current == null)

          return head;

        Node NewNode = new Node(c);


        NewNode.next = current.next;

        current.next = NewNode;

        return head;
 
        
 
 
    }

}
 