package bingoboard;

public class BingoTester{
	   public static void main(String[] args){
	      Bingo b = new Bingo();
	      
	      b.makeCalls();
	      
	      b.shuffle();
	      
	      b.printCalls();
	      
	    System.out.println();
	    System.out.println();
	    
	      b.makeCard();
	      
	      b.printCard();
	      
	      b.play();
	   }
	}
