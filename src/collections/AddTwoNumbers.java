package collections;

//You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself
/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class AddTwoNumbers {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        ListNode listNode = addTwoNumbers(l1, l2);

        while (listNode != null) {
            System.out.println("a = " + listNode.val);
            listNode = listNode.next;
        }


    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode first = l1, second = l2, current = head;
        int div = 0;

        while (first != null || second != null) {
            int num1 = (first != null) ? first.val : 0;
            int num2 = (second != null) ? second.val : 0;

            int sum = num1 + num2 + div;

            current.next = new ListNode(sum % 10);
            current = current.next;
            div = sum / 10;

            if (first != null) first = first.next;
            if (second != null) second = second.next;
        }

        if (div > 0)
            current.next = new ListNode(div);

        return head.next;
    }

}
