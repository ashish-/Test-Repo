package com.dsa.graph;

public class Insert_LinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	Node newNode(int d){
		Node node = new Node(d);
		return node;
	}
	
	public void sortedInsert(Node new_node){
		
		Node current;
		if(head==null || new_node.data <= head.data){
			new_node.next = head;
			head = new_node;
		}
		else{
			current =head;
			while(current.next !=null && current.next.data < new_node.data){
				current = current.next;
			}
			new_node.next = current.next;
			current.next = new_node;
			
		}
		
	}
	
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ ", ");
			temp =temp.next;
		}
	}
	
	
	public static void main(String args[]){
		
		Insert_LinkedList list = new Insert_LinkedList();
		
		Node new_node;
		
		new_node =list.newNode(5);
		
		list.sortedInsert(new_node);
		
		new_node =list.newNode(10);
		
		list.sortedInsert(new_node);
		
		new_node =list.newNode(7);
		
		list.sortedInsert(new_node);
		
		new_node =list.newNode(3);
		
		list.sortedInsert(new_node);
		 
		list.printList();
	}

}
