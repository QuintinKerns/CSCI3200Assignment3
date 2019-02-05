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
		new PotatoMasher(people, moves);
	}

	PotatoMasher(int people, int moves){
		PotatoList<Integer> playerList = new PotatoList<Integer>();
		for (int i = 0; i < people; i++) {
			playerList.add(i);
		}
		playerList.linkLast(); // Sets last.next to the first
		
		int testCtr = 0;
		while(playerList.get(1) != null) {
			testCtr++;
			System.out.println("Ctr: " + testCtr);
			playerList.pass(moves);
		}
		System.out.println("List: ");
		playerList.printList();
	}
	
	
	
}
