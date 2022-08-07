package com.demo.guessGame;

import java.util.Scanner;

import java.util.concurrent.TimeUnit;

class Guesser {

	int guessNum;

	public int guessNumber() {

		Scanner sc = new Scanner(System.in);
		System.out.println("GUESSER.. kindly guess the AGE : \n");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Player {

	int PguessNum;

	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" PLAYER kindly guess the AGE : \n");
		PguessNum = sc.nextInt();
		return PguessNum;
	}
}

class Umpire {

	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	// int numFromPlayer4;

	public void getNumFromGuesser() {

		Guesser guesser = new Guesser();
		numFromGuesser = guesser.guessNumber();
		while (numFromGuesser < 0 || numFromGuesser > 100) {
			System.out.println("\nGUESSER, Please Enter a age between 0 and 100 \n");
			numFromGuesser = guesser.guessNumber();
		}

	}

	public void getNumFromPlayers() {

		Player player = new Player();
		numFromPlayer1 = player.guessNumber();
		while (numFromPlayer1 < 0 || numFromPlayer1 > 100) {
			System.out.println("\nPLAYER 1, Please Enter a age between 0 and 100 \n");
			numFromPlayer1 = player.guessNumber();
		}
		numFromPlayer2 = player.guessNumber();
		while (numFromPlayer2 < 0 || numFromPlayer2 > 100) {
			System.out.println("\nPLAYER 2, Please Enter a age between 0 and 100 \n");
			numFromPlayer2 = player.guessNumber();
		}
		numFromPlayer3 = player.guessNumber();
		while (numFromPlayer3 < 0 || numFromPlayer3 > 100) {
			System.out.println("\nPLAYER 3, Please Enter a age between 0 and 100 \n");
			numFromPlayer3 = player.guessNumber();
		}
		// numFromPlayer4=player.guessNumber();
	}

	public void getNumFromPlayersInFinal(int num1, int num2) {
		if (num1 == numFromPlayer1 && num2 == numFromPlayer2) {
			Player player = new Player();
			numFromPlayer1 = player.guessNumber();
			while (numFromPlayer1 < 0 || numFromPlayer1 > 100) {
				System.out.println("\nPLAYER 1, Please Enter a age between 0 and 100 \n");
				numFromPlayer1 = player.guessNumber();
			}
			numFromPlayer2 = player.guessNumber();
			while (numFromPlayer2 < 0 || numFromPlayer2 > 100) {
				System.out.println("\nPLAYER 2, Please Enter a age between 0 and 100 \n");
				numFromPlayer2 = player.guessNumber();
			}

		} else if (num1 == numFromPlayer2 && num2 == numFromPlayer3) {
			Player player = new Player();
			numFromPlayer2 = player.guessNumber();
			while (numFromPlayer2 < 0 || numFromPlayer2 > 100) {
				System.out.println("\nPLAYER 2, Please Enter a age between 0 and 100 \n");
				numFromPlayer2 = player.guessNumber();
			}
			numFromPlayer3 = player.guessNumber();
			while (numFromPlayer3 < 0 || numFromPlayer3 > 100) {
				System.out.println("\nPLAYER 3, Please Enter a age between 0 and 100 \n");
				numFromPlayer3 = player.guessNumber();
			}
		} else if (num1 == numFromPlayer1 && num2 == numFromPlayer3) {
			Player player = new Player();
			numFromPlayer1 = player.guessNumber();
			while (numFromPlayer1 < 0 || numFromPlayer1 > 100) {
				System.out.println("\nPLAYER 1, Please Enter a age between 0 and 100 \n");
				numFromPlayer1 = player.guessNumber();
			}
			numFromPlayer3 = player.guessNumber();
			while (numFromPlayer3 < 0 || numFromPlayer3 > 100) {
				System.out.println("\nPLAYER 3, Please Enter a age between 0 and 100 \n");
				numFromPlayer3 = player.guessNumber();
			}
		}

	}

	public void compare() throws Exception {
		Scanner sc = new Scanner(System.in);

		if (numFromPlayer1 == numFromGuesser) {

			if (numFromGuesser == numFromPlayer2 && numFromPlayer3 == numFromGuesser) {
				System.out.println(
						"\n All Players guessed the AGE correctly. Congrats All..\n\n Play Again to find ultimate winner among you..\n\n");
				System.out.println("PLease Enter Y to CONTINUE / Any other key to EXIT the game\n");
				char c = sc.next().charAt(0);
				if (c == 'Y' || c == 'y') {
					this.getNumFromGuesser();
					this.getNumFromPlayers();
					this.compare();
				}
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("\n Player 1 and Player 2 guessed the AGE correctly.. we are entering into the Last round..\n");
				TimeUnit.SECONDS.sleep(2);
				this.numFromPlayer3 = -1;
				this.getNumFromGuesser();
				this.getNumFromPlayersInFinal(numFromPlayer1, numFromPlayer2);
				this.compare();

			} else if (numFromPlayer3 == numFromGuesser) {
				System.out.println("\n Player 1 and Player 3 guessed the AGE correctly.. we are entering into the Last round..\n");
				TimeUnit.SECONDS.sleep(2);
				this.numFromPlayer2 = -1;
				this.getNumFromGuesser();
				this.getNumFromPlayersInFinal(numFromPlayer1, numFromPlayer3);
				this.compare();
			} else {
				System.out.println("\n Player 1 guessed the AGE correctly and won the game.. Congrats PLAYER 1\n");
				System.out.println("PLease Enter Y to CONTINUE / Any other key to EXIT the game\n");
				char c = sc.next().charAt(0);
				if (c == 'Y' || c == 'y') {
					this.getNumFromGuesser();
					this.getNumFromPlayers();
					this.compare();
				}
			}
		}

		else if (numFromGuesser == numFromPlayer2) {

			if (numFromPlayer3 == numFromGuesser) {
				System.out.println("\n Player 3 and Player 2 guessed the AGE correctly.. we are entering into the Last round..\n");
				TimeUnit.SECONDS.sleep(2);
				this.numFromPlayer1 = -1;
				this.getNumFromGuesser();
				this.getNumFromPlayersInFinal(numFromPlayer2, numFromPlayer3);
				this.compare();
			} else {
				System.out.println("\n Player 2 guessed the AGE correctly and won the game.. Congrats PLAYER 2\n");
				System.out.println("PLease Enter Y to CONTINUE / Any other key to EXIT the game\n");
				char c = sc.next().charAt(0);
				if (c == 'Y' || c == 'y') {
					this.getNumFromGuesser();
					this.getNumFromPlayers();
					this.compare();
				}
			}

		}

		else if (numFromPlayer3 == numFromGuesser) {
			System.out.println("\n Player 3 guessed the AGE correctly and won the game.. Congrats PLAYER 3\n");
			System.out.println("PLease Enter Y to CONTINUE / Any other key to EXIT the game\n");
			char c = sc.next().charAt(0);
			if (c == 'Y' || c == 'y') {
				this.getNumFromGuesser();
				this.getNumFromPlayers();
				this.compare();
			}
		}
		
		else {
			System.out.println(
					"\n GAME LOST !!!   No one guessed the AGE correctly.. \n\n Play Again to find a winner among you...\n");
			System.out.println("Please Enter Y to CONTINUE / Any other key to EXIT the game\n");
			char c = sc.next().charAt(0);
			if (c == 'Y' || c == 'y') {
				this.getNumFromGuesser();
				this.getNumFromPlayers();
				this.compare();
			}
		}

	}

}

public class LaunchGame {

	public static void main(String[] args) throws Exception {

		System.out.println("\n===========================================================================");
		System.out.println("         --------- WELCOME TO "+ "'GUESS MY AGE'"+ " GAME ---------");
		System.out.println("===========================================================================\n");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(
				"INSTRUCTIONS : \n\n 1. There are 3 PLAYERS and one GUESSER in this game. at first guesser will guess a AGE between 0 and 100. \n    The players has to guess the AGE and those who guess the AGE correctly will be announced as the winner.\n\n "
						+ "2. If Guesser or Player enter a AGE beyond the specified limit (0-100), A message will be displayed to enter the age within limits\n\n "
						+ "3. If more than One players guessed the AGE correctly, then game will goto next Round to determine the ultimate winner \n\n "
						+ "4. If all the 3 players guesses the AGE correctly, The game can be played again to find a winner or end the game as per the input from the player\n\n    ALL THE BEST..\n");
		TimeUnit.SECONDS.sleep(8);
		System.out.println("\n\nLET'S START THE  GAME...\n\n\n");
		TimeUnit.SECONDS.sleep(3);

		Umpire umpire = new Umpire();
		umpire.getNumFromGuesser();
		umpire.getNumFromPlayers();
		umpire.compare();

		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n===================================================================");
		System.out.println("   --------- THANK YOU.. HOPE YOU ENJOYED THE GAME :D ---------");
		System.out.println("=====================================================================");

	}

}
