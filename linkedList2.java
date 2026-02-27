class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}

class GfG {

    static Node deleteAtFirst(Node head){
        
        if (head == null)
          return null;
        
        Node newNode = head.next;
        

        return newNode;
        
    }
    
    static Node deleteAtLast(Node head){
        
        if (head == null)
          return null;
          
        if(head.next == null)
          return null;
          
        Node last = head;
        
        while(last.next.next != null){
            last = last.next;
        }
        
        last.next = null;
        
        return head;

    }
    
    static Node deleteAtPosition(Node head, int position){
        
        Node newNode = head;
        
        if(position == 1){
            head = head.next;
            return head;
        }
        
        Node previous = null;
        
        for (int i=1;i < position ;i++ ){
            previous = newNode;
            newNode= newNode.next;
        } 
        
        previous.next = newNode.next;
        
        return head;
          
        
    }
    
    static boolean searchElement (Node head, int element){
        
        if(head.val == element)
          return true;
           
        head = head.next; 
        
        while(head.next != null){
            if(head.val == element)
              return true;
              
            head = head.next;
        }
        
        return false;
        
        
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        // Creating the list 1->2->4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = deleteAtFirst(head);
        head = deleteAtLast(head);
        int position = 2;
        head = deleteAtPosition(head, position);
        
        int element = 2;
        System.out.println(searchElement(head, element));
        
        printList(head);
    }
}