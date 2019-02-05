package Number2;


import java.util.Scanner;

import Number1.MySingleLinkedList;

public class PotatoMasher {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many players?:");
		int people = scan.nextInt();
		System.out.println("How many moves?:");
		int moves = scan.nextInt();
		PotatoList spud = new PotatoList<Integer>(people, moves);
		spud.printList();
	}
	
	
	
}
