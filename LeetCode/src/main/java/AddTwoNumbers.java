import setup.ListNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(0, 2);
        ll.add(1, 3);
        ll.add(2,4);

        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        ll2.add(0, 7);
        ll2.add(1, 8);
        ll2.add(2,9);

        for( int i = 0; i < ll.size(); i++){
            ListNode node = new ListNode();
            ListNode node2 = new ListNode();
            node.setVal(ll.get(i));
            node2.setVal(ll2.get(i));
            addTwoNumbers(node, node2);
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int carry = 0;

        while (l1 != null || l1 != null) {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

           int currentSum = l1_val + l2_val + carry;
           carry = currentSum / 10;
           int remainder = currentSum % 10;

           ListNode newNode = new ListNode(remainder);
           l3.next = newNode;

           if (l1 != null) l1 = l1.next;
           if (l2 != null) l2 = l2.next;
           l3 = l3.next;
        }

        if (carry > 0){
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;
            l3 = l3.next;
        }
        return dummy.next;
    }
}
