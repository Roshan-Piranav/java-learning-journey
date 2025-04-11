 
class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class linked {

    public static void main(String[] args) {

        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        traversal(n1);

        int ll = len(n1);
        System.out.println("the length is " + ll);

        // update(n1, 50, 20);
        // upps(n1, 2, 345);
        // 10-20-30-null

        // insert(n1, 9, 35);

        mid_fast(n1);

        // traversal(n1);
        // mid(n1);

    }

    private static void mid_fast(node head) {
        // 10 20 30 50 60

        node fast = head;
        node slow = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next;
            fast = fast.next;
            slow = slow.next;

        }
        System.out.println("the mid = " + slow.data);

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

    private static void update(node head, int nv, int ov) {
        node temp = head;

        while (temp != null) {
            if (temp.data == ov) {
                temp.data = nv;
                return;
            }
            temp = temp.next;
        }

    }

    private static void upps(node head, int pos, int nval) {

        int cur = 0;
        node temp = head;

        while (temp != null) {
            if (cur == pos - 1) {
                temp.data = nval;
                break;
            }
            // System.out.println(temp.data);
            temp = temp.next;
            cur++;
        }

    }

    private static void insert(node head, int pos, int nval) {

        int cur = 0;
        node temp = head;
        node nn = new node(nval);

        if (pos == 1) {
            nn.next = head;
            head = nn;
            return;

        }
        node pr = new node(-1);
        while (cur != pos - 1 && temp != null) {
            cur++;
            pr = temp;
            temp = temp.next;

        }
        if (temp == null) {
            System.out.println("no match ");
            return;
        }
        pr.next = nn;
        nn.next = temp;

        int l1 = len(head);
        if (l1 == pos - 1) {

            while (temp.next != null) {
                // System.out.println(temp.data);
                temp = temp.next;
            }
            temp.next = nn;
        }

    }

    public static void mid(node head) {
        node temp = head;

        int m = len(head);
        if (m % 2 == 0) {
            m = m / 2;
        } else {
            m = (m + 1) / 2;
        }

        indexing(head, m);

    }

    public static void indexing(node head, int index) {
        node temp = head;
        // 10 20 30 40 50
        while (temp != null && index != 1) {
            index--;
            temp = temp.next;

        }
        node midNode = temp;
        System.out.println("the mid element is " + midNode.data);

    }

}
