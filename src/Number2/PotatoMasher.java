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
		scan.close();
		
		// Speeds up game by reducing moves to do
		if (moves > people){
			moves = moves - people;
		}
		
		// Make circular list
		PotatoList<Integer> spud = new PotatoList<Integer>(people);
		
		// Game starts
		System.out.println("Start:  " + spud);
		for (int i = 0; i < people - 1; i++){
			spud.pass(moves);
			System.out.println("Turn " + i + ": " + spud);
			if (spud.currentCount == moves){
				System.out.println("Winner!: " + spud.get(0).value);
				break;
			}
		}
		
	}
	
	
	
}
