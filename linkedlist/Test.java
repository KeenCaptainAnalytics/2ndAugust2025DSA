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
    }
    public static void main(String[] args) {
        // insert in front
        Node head =null;
        head = insert(head, 10);
        head= insert(head, 20);
        insert(head, 30);
        insert(head, 40);
        insert(head, 50);
        insert(head, 60);

        print(head);
        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c=  new Node(30);
        // Node d = new Node(40);

        // a.next = b;
        // b.next =c ;
        // c.next = d;

    }
    
}
