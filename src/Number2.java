

import java.util.Scanner;

import Number1.MySingleLinkedList;

public class Number2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many players?:");
		int people = scan.nextInt();
		System.out.println("How many moves?:");
		int moves = scan.nextInt();
		Number2 spud = new Number2(people, moves);
	}

	Number2(int people, int moves){
		PotatoList<Integer> playerList = new PotatoList<Integer>();
		for (int i = 0; i < people; i++) {
			playerList.add(i);
		}
		playerList.linkLast(); // Sets last.next to the first
		
		while(playerList.get(playerList.currentCount).next != null) {
			playerList.pass(moves);
		}
		playerList.printList();
	}
	
	
	
}
