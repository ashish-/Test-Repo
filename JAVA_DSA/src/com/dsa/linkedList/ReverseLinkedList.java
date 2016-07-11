package com.dsa.linkedList;

public class ReverseLinkedList {

	class Node{
		char data;
		Node next;
		Node(char data){
			this.data=data;
			next=null;
		}
	}
	Node head;
	
	void push(char data){
		
		Node node = new Node(data);
		
		node.next = head;
		
		head = node;
		
	}
	
	Boolean isPalindrom(Node head){
		
		Node slow = head;
		Node fast= head;
		Node prev_slow = head;
		Node middle = null;
		Node second_list_head =null;
		
		Boolean res =true;
		
		if(head!=null && head.next !=null){
			while(fast!=null && fast.next!=null){
				prev_slow =slow;
				slow = slow.next;
				fast=fast.next.next;
			}
			if(fast!=null){
				middle = slow;
				slow= slow.next;
			}
			prev_slow.next = null;
			second_list_head = slow;
			Node second_list_reverse = reverseLinkedList(second_list_head);
			
			res = compare(head, second_list_reverse);
			
			second_list_head = reverseLinkedList(second_list_reverse);
			
			if(middle!=null){
				prev_slow.next = middle;
				middle.next = second_list_head;
			}
			else
				prev_slow.next = second_list_head;
			
			
		}
		
		return res;
	}
	
	Boolean compare(Node head1, Node head2){
		
		Node temp1 = head1;
		Node temp2 = head2;
		
		while(temp1!=null || temp2!=null){
			if(temp1.data != temp2.data){
				return false;
			}
			else{
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
		}
		if(temp1 !=null || temp2!=null)
				return false;
		return true;
	}
	
	
	void printList(Node head){
		Node node = head;
		while(node !=null){
			System.out.print(node.data+" ");
			node =node.next;
		}
		System.out.println();
	}
	
	public Node reverseLinkedList(Node head){
		if(head==null || head.next==null){
			return head;			
		}
		
		Node current = head;
		Node prev =null;
		Node next=null;
		while(current!=null){
			next= current.next;
			current.next =prev;
			prev = current;
			current =next;
		}
		return prev;
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		ReverseLinkedList  rvl = new ReverseLinkedList();
		String str = "abacaba";
		
		Node head = null;
		
		for(int i=0;i<str.length();i++){
			rvl.push(str.charAt(i));
			head = rvl.head;
			rvl.printList(head);
			if(rvl.isPalindrom(head)==true)
				System.out.println("Palindrom");
			else
				System.out.println("Not");
		}
		
		
		
		
		//Node rv_head = rvl.reverseLinkedList(head);
		//rvl.printList(rv_head);
		
		
	}
}
