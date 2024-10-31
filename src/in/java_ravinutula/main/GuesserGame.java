package in.java_ravinutula.main;
import java.util.*;

class Guesser
{
	int gNum;
	
	int guessNum()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Guesser - plz guess a numbe:");
		gNum = sc.nextInt();
		return gNum;
	}
	
}

class Player
{
	int guessNum;
	
	int gsNum() 
	{
	Scanner kbr= new Scanner(System.in);
	System.out.println("Player - plz submit your guess:");
	guessNum=kbr.nextInt();
	return guessNum;
	}
}

class Umpire
{
	int numGuesser;
	int numPlyr1;
	int numPlyr2;
	int numPlyr3;
	
	void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numGuesser= g.guessNum();
		
	}
	void collectNumFromPlayers(Player P)
	{
		Player pl = P;
		numPlyr1= pl.gsNum();
		
	}
	int compare(int g, int p)
	{
		int win=0;
		if(g==p)
		{
			//System.out.println("He is a winner:");
			win++;
		
		}
		return win;
			
		//Guesser g = new Guesser();
		//numGuesser= g.guessNum();
		
	}
}
public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gNum,p1Num,p2Num,p3Num,score=0,winner=0,res1,res2,res3;
		
		Guesser g= new Guesser();
		gNum=g.guessNum();
		
		Umpire u=new Umpire();
		
		Player p1= new Player();
		p1Num=p1.gsNum();
		
		Player p2= new Player();
		p2Num=p2.gsNum();
		
		Player p3= new Player();
		p3Num=p3.gsNum();
		
		//u.collectNumFromGuesser();
		//u.collectNumFromPlayers(null);
		res1= u.compare(gNum, p1Num);
		if(res1==1) {score += 3;}
		else score=0;
			
		winner=winner+res1+score;
		res2 = u.compare(gNum, p2Num);
		if(res2==1) {score += 10;}
		else score=0;
		//score=+10;
		winner=winner+res2+score;
		res3 = u.compare(gNum, p3Num);
		if(res3==1) {score += 15;}
		else score=0;
		//score+=15;
		winner=winner+res3+score;
		
		switch(winner) 
		{
		case 0: System.out.println("There were no winners in this game.");
		break;
		
		case 4: System.out.println("we have one winner, and the winner is Player 1!!");
		break;
		
		case 11: System.out.println("we have one winner, and the winner is Player 2!!");
		break;
		
		case 16: System.out.println("we have one winner, and the winner is Player 3!!");
		break;
		
		case 18: System.out.println("we have two winners, and they are Player 1 & Player2!!");
		break;
		
		case 20: System.out.println("we have two winners, and they are Player 1 & Palyer3!!");
		break;
		
		case 37: System.out.println("We have two winners, and they are Player 2 & Palyer 3!!!");
		break;
		
		case 47: System.out.println("All three gusssed it right. They all won!!!");
		break;
		
		}
			
//		if(winner==0) {
//			System.out.println("No Player won");
//		}
//		else if(winner==1) {
//			System.out.println("we have one winner");
//		}
//		else if(winner==2) {
//			System.out.println("we have one winner");
//		}
//		else if(winner==3) {
//			System.out.println("All three players won");
//		}
			
		
		
		
		

	}

}
