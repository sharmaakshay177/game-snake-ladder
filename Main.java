package snakeLadd;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Main {

	
	
	
	
	public static void main(String[] args) {
		Board b1 = new Board();
		
	 
		//System.out.println("dice count "+(getdice()+1));
		HashMap<Integer, Integer>ladder = new HashMap<Integer,Integer>();
		ladder.p
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
	}
	
	
	
	
	
			
}//ending of board class