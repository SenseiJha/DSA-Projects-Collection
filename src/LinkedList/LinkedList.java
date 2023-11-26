package LinkedList;

import java.util.Scanner;

public class LinkedList {
	Node start;
	
	public void insertAtEndOfList() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an item to be inserted : ");
		int item=sc.nextInt();
		
		Node p=start;
		
		Node np=new Node();
		np.data=item;
		np.link=null;
		
		if(start==null) {
			start=np;
			System.out.println(item+" inserted at the end. ");
		}
		
		else if(start.link==null) {
			start.link=np;
			System.out.println(item+" inserted at the end. ");
		}
		
		else {		
			while(p.link!=null) {
				p=p.link;
			}
			p.link=np;
			
			System.out.println(item+" inserted at the end. ");
		}
	}

	public void insertAtBeginningOfList() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the item : ");
		int item=sc.nextInt();
		
		Node np=new Node();
		np.data=item;
		np.link=null;
		np.link=start;
		start=np;
		
		System.out.println(item+" inserted at the beginning of the list. ");
	}

	public void deleteFromBeginningOfList() {
		int itemDeleted;
		
		if(start==null) {
			System.out.println("Linked List is Empty. ");
		}
		else if(start.link==null) {
			itemDeleted=start.data;
			start=null;
			System.out.println(itemDeleted+" is deleted from the list. ");
		}
		else {
			itemDeleted=start.data;
			start=start.link;
			System.out.println(itemDeleted+" is deleted from the list. ");
		}
	}

	public void deleteFromEndOfList() {
		int itemDeleted;
		
		Node prev=start,p=start.link;
		
		
		if(start==null) {
			System.out.println("Linked List is empty.");
		}
		else if(start.link==null) {
			itemDeleted=start.data;
			start=null;
			System.out.println(itemDeleted+" deleted from the end of the list.");
		}
		else {
			while(p.link!=null) {
				prev=p;
				p=p.link;
			}
			itemDeleted=p.data;
			prev.link=null;
			
			System.out.println(itemDeleted+" deleted from end of the list.");
		}
	}

	public void searchAndDelete() {
		
	}

	public void display() {
		Node p=start;
		
		if(start==null) {
			System.out.println("Linked List is empty");
		}
		
		else {
			while(p.link!=null) {
				System.out.print("|"+p.data+"|"+" -|---->");
				p=p.link;
			}
		}
		System.out.println(p.data);
	}
}
