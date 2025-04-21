 
class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class reverse_ll {

    public static void main(String[] args) {

        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(50);
        node n5 = new node(66);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        traversal(n1);

        System.out.println("after traversal .");

        int ll = len(n1);
        System.out.println("the length is " + ll);

        n1 = rev(n1);

        traversal(n1);

    }

    private static node rev(node head) {

        node cur = head;
        node nxt = head;

        node pr = null;

        while (cur != null) {
            nxt = nxt.next;
            cur.next = pr;
            pr = cur;
            cur = nxt;

        }
        return pr;


        // 10 20 30 40 50
        // p c n
    }

    private static void traversal(node head) {
        node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    private static int len(node head) {
        int c = 0;
        node temp = head;

        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;

    }

}
