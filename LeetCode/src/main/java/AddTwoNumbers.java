import setup.ListNode;

import java.util.LinkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(0, 2);
        ll.add(1, 4);
        ll.add(2, 3);

        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        ll2.add(0, 5);
        ll2.add(1, 6);
        ll2.add(2, 4);

        ListNode node = new ListNode(243);
        ListNode node2 = new ListNode(564);

//        for( int i = 0; i < ll.size(); i++){
//            node.setNext(ll.get(i));
//            node.setVal(ll.get(i));
//            node2.setVal(ll2.get(i));
//        }

        addTwoNumbers(node, node2);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        LinkedList<Integer> reversedFirstList = new LinkedList<>();
        LinkedList<Integer> reversedSecondList = new LinkedList<>();

        while (l1 != null || l2 != null || (l1.val > 10 || l2.val > 10)) {

            double decimal1 = (double) l1.val / 10;
            int rounded1 = (int) Math.floor(decimal1);
            double decimal2 = (double) l2.val / 10;
            int rounded2 = (int) Math.floor(decimal2);

            int remainderOfFirstList = l1.val % 10;
            int remainderOfSecondList = l2.val % 10;



            reversedFirstList.add(remainderOfFirstList);
            reversedSecondList.add(remainderOfSecondList);

            l1.val = rounded1;
            l2.val = rounded2;

        }

        if (l1.val < 10){
            reversedFirstList.add(l1.val);
        }
        if ( l2.val < 10){
            reversedSecondList.add(l2.val);
        }



//           ListNode newNode = new ListNode(remainder);
//           l3.next = newNode;
//
//           if (l1 != null) l1 = l1.next;
//           if (l2 != null) l2 = l2.next;
//           l3 = l3.next;

//        if (carry > 0){
//            ListNode newNode = new ListNode(carry);
//            l3.next = newNode;
//            l3 = l3.next;
//        }

        //System.out.println(dummy.next.val);
        return null;
    }
}
