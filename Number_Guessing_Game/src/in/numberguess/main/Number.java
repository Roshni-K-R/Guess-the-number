package in.numberguess.main;

import java.util.Scanner;

import javax.swing.JOptionPane;
import in.game.gusser.Guess;

public class Number {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		//guess.class object creation
		Guess g=new Guess();
		
		String ch1 ="y";
		int count=0;
		int score=0;
		
		//Displays dialog box
		JOptionPane.showInternalMessageDialog(null, "WELCOME TO NUMBER GUESSING GAME");
		JOptionPane.showInternalMessageDialog(null, "You will have 3 Trials");
		
		
		System.out.println("WELCOME TO NUMBER GUESSING GAME");
		System.out.println("................................");
		System.out.println("You will have 3 Trials");
		System.out.println("................................");
		
		int guessNum = -1;
		int playNum = -1;
		
		//function call using guess.class object
		guessNum=g.Guesser();
		
		do {
				
			if(ch1.charAt(0)==('y')||ch1.charAt(0)=='Y')
			{
			playNum=g.Player();
			
				if(guessNum==playNum)
				{
				count++;
				JOptionPane.showInternalMessageDialog(null, "You WON! On try "+count);
				System.out.println("You own on try "+count);
				score++;
				guessNum=g.Guesser();
				}
				else
				{
					if(playNum>guessNum)
					System.out.println("Entered number is greater than the Guess Number");
					
					else
					System.out.println("Entered number is lesser than the Guess Number");
					
					
					JOptionPane.showInternalMessageDialog(null, "You LOSE!");
					System.out.println("You Lose");
					count++;
				}
			
			
				System.out.println("-----------------------------");
				System.out.println("Do you wish to continue....[Y/N]");
				System.out.println("-----------------------------");
				ch1=sc.next();
				}
			else {
					break;
			}
			
		}while(count<3);
	
		
		if(count==3) {
			System.out.println("You have used up all trials \n");
			JOptionPane.showInternalMessageDialog(null, "You have used up all trials");
		}
		
		System.out.println("You Scored:"+score+"/3");
		JOptionPane.showInternalMessageDialog(null, "GAME END");
		
		System.out.println("---------------------------------");
		System.out.println("GAME END");
		System.out.println("----------------------------------");
		System.exit(0);
	}
}
