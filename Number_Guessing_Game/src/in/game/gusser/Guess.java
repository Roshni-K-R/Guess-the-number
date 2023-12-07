package in.game.gusser;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Guess implements Game {

	@Override
	public int Guesser() {
		int guess=new Random().nextInt(100);
		 System.out.println("[This is a guess number which will be hidden "+guess+"]--> made visible only for demo \n");
	       return guess;
		
	}

	@Override
	public int Player() {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Player::Guess a number (1-100)");
	        //int number=Integer.parseInt(JOptionPane.showInputDialog(null, "Player Guess a number"));
	        int player1=sc.nextInt();
	        return player1;
	       // return number;
		}

}
