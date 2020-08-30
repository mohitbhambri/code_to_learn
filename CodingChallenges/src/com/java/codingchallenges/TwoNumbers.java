package com.java.codingchallenges;

public class TwoNumbers {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
	ListNode head1, head2, result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoNumbers list = new TwoNumbers();
		list.push(2, 1);
		list.push(4, 1);
		list.push(3, 1);
		list.push(5, 2);
		list.push(6, 2);
		list.push(4, 2);
		list.printList(list.head1);
		list.printList(list.head2);
		list.printList(list.addTwoNumbers(list.head1, list.head2));
	}
	
	void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println("");
    }
	void push(int val, int list){
		ListNode newNode = new ListNode(val);
		if(list==1){
			newNode.next=head1;
			head1 = newNode;
		}else if(list==2){
			newNode.next=head2;
			head2=newNode;
		}else{
			newNode.next=result;
			result=newNode;
		}
		
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode p=l1, q=l2, current = temp;
        int sum, carry=0;
        while(p!=null || q!=null) {
        	int x = (p!=null)?p.val:0;
        	int y = (q!=null)?q.val:0;
        	sum = x+y+carry;
        	carry = sum/10;
        	current.next= new ListNode(sum%10);
        	current =current.next;
        	if(p!=null) p=p.next;
        	if(q!=null) q=q.next;
        }
        if(carry>0) {
        	current.next=new ListNode(carry);
        }
		return temp.next;
    }

}
