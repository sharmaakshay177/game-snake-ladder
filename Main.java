package snakeLadd;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Board b1 = new Board();
	b1.startGame();
	}

}//main class containing main method

class Board{
  final	static int winPoint = 100;
		
	
    HashMap<Integer, Integer>ladder = new HashMap<Integer,Integer>();
	HashMap<Integer, Integer>snake = new HashMap<Integer,Integer>();
	{
		ladder.put(1, 38);
		ladder.put(4, 14);
		ladder.put(9, 31);
		ladder.put(21, 42);
		ladder.put(28, 84);
		ladder.put(51, 67);
		ladder.put(72, 91);
		ladder.put(80, 99);//ladder final
		
		snake.put(17,7);
		snake.put(62,19);
		snake.put(54,34);
		snake.put(87,36);
		snake.put(93,73);
		snake.put(95,75);
		snake.put(98,79);
		snake.put(64,60);//snake final
		
	}
   
	static int getdice()
	{
		Random rg = new Random();
		int randomInt = rg.nextInt(6);
	    return randomInt;	
	}
	
	public int calculateplayervalue(int player,int diceroll)
	{
		player  = player + diceroll;
		
		if(player > winPoint)
	    {
	        player = player - diceroll;
	        return player;
	    }
	      
	    if(null!=snake.get(player))
	    {
	        System.out.println("swallowed by snake");
	        player= snake.get(player);
	    }
	      
	    if(null!=ladder.get(player))
	    {
	        System.out.println("climb up the ladder");
	        player= ladder.get(player);
	    }
	    return player;
		
	
	}//calculate player value
	
	public boolean isWin(int player)
	{
		return winPoint == player;
	} //ending of iswin
	
	public void startGame()
	{
	   int player1 =0 , player2 = 0;
	   int curPlay =-1;
	   Scanner in = new Scanner(System.in);
	   String str = "";
	   int diceVal =0;
	   
	   do {
		   System.out.println(curPlay == -1 ?"\nFirst player Turn":"\n Second Player Turn");
		   System.out.println("Press r to Roll dice");
		   str = in.next();
		   diceVal = getdice();
		   if(curPlay == -1)
		   {
			   player1 = calculateplayervalue(player1,diceVal);
	            System.out.println("First Player :: " + player1);
	            System.out.println("Second Player :: " + player2);
	            System.out.println("------------------");
	            if(isWin(player1))
	            {
	                System.out.println("First player wins");
	                return;
	            } 
	            else
	            {
	                player2 = calculateplayervalue(player2,diceVal);
	                System.out.println("First Player :: " + player1);
	                System.out.println("Second Player :: " + player2);
	                System.out.println("------------------");
	                if(isWin(player2))
	                {
	                    System.out.println("Second player wins");
	                    return;
	                }
	            }
	              
	            curPlay= -curPlay;
			   
		   }
		   
		   
	   }while("r".equals(str));
		
		
	}//ending of start game function
	
	
	
	
	
			
}//ending of board class