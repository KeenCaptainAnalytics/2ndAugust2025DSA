public class Test {


    static Node insert(Node head , int data){
        Node temp = new Node(data);
        if(head == null){
            return temp;
        }
        else{
            Node cn = head;
            while(cn.next !=null){
                cn = cn.next;
            }
            cn.next = temp;
        }
        return head;

    }
    static void print(Node head){
        // null 
        while(head !=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println();
    }
    static Node insertAtfront(Node head , int val){
        Node temp = new Node(val);
        if(head ==null){
            return temp;
        }
        temp.next = head;
        return temp;
    }

    static Node reverse(Node head, Node reverseHead){
        if(head.next == null){
            reverseHead.next = head;
            return head;
        }
        else{
            Node temp = reverse(head.next, reverseHead);
            temp.next = head;
            head.next = null;
            return head;

        }
    }
    public static void main(String[] args) {
        // insert in front
        Node head =null;
        head =insertAtfront(head ,10 );
        head =insertAtfront(head ,20 );
        head =insertAtfront(head ,30 );
        head =insertAtfront(head ,40 );
        head =insertAtfront(head ,50 );
        head =insertAtfront(head ,60 );

        print(head);
        Node reverseHead = new Node(0);// dummy node
        reverse(head, reverseHead);
        head= reverseHead.next;
        print(head);
        // head = insert(head, 10);
        // head= insert(head, 20);
        // insert(head, 30);
        // insert(head, 40);
        // insert(head, 50);
        // insert(head, 60);

        // print(head);
        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c=  new Node(30);
        // Node d = new Node(40);

        // a.next = b;
        // b.next =c ;
        // c.next = d;

    }
    
}
