package LinkedList;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		LinkedList list=new LinkedList();
		int ch;
		
		do {
			System.out.println("1. Insert at the end of the list ");
			System.out.println("2. Insert at the beginning of the list ");
			System.out.println("3. Delete from the beginning of the list ");
			System.out.println("4. Delete from the end of the list ");
			System.out.println("5. Search and delete an item");
			System.out.println("6. Display the list");
			System.out.println("0. EXIT ");
			System.out.println();
			System.out.println("Enter your choice : ");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				list.insertAtEndOfList();;
				break;
				
			case 2:
				list.insertAtBeginningOfList();	
				break;
				
			case 3:
				list.deleteFromBeginningOfList();
				break;
				
			case 4:
				list.deleteFromEndOfList();
				break;
				
			case 5:
				list.searchAndDelete();
				break;
				
			case 6:
				list.display();
				break;
				
			case 0:
				System.out.println("Thank You");
				break;
			
			default:
				System.out.println("Invalid Choice");
			}
		}
		while(ch!=0);
		sc.close();
	}

}
