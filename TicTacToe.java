import java.util.Random;
import java.util.Scanner;

/**
 * @author Maciej Sudol
 * CSIT357-02 Artificial Intelligence
 * Dr.Aparna Varde
 * Implementation of Game Theory
 */
public class TicTacToe {
	
	
	public static char TTTboard[][] = new char[3][3];
	public static int computerMoveCounter = 1;
	public static String compFirstMove;
	public static boolean end = false;

	public static void main(String[] args) throws InterruptedException {
		
		//creates the 3 x 3 Tic Tac Toe board for the user to see
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{ 
				TTTboard[i][j] = '-';
			}
		}
		
		System.out.println("A Game of Tic Tac Toe"
							+"\n"
							+ "\nAt the beginning, the Tic Tac Toe board looks like this:"
							+ "\n\t---"
							+ "\n\t---"
							+ "\n\t---"
							+"\nGet three O's in a row to win the game\"");
		
		System.out.println("\nTo start, Enter s ");
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		if(input.equals("s"))
		{
			System.out.println("\nComputer will be going first");
			compMove();
			
			/**A while loops that prints the board until the variable end becomes true.
			 * Each time the computer moves during their turn, this loop will print out the status of
			 * the status of the board so the user can make their move
			 */
			
			while(!end)
			{
				for(int i = 0; i < 3; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						System.out.print(TTTboard[i][j]+ " ");
					}
					System.out.println();
				}
				Thread.sleep(2000);//to stop it from printing the board over and over.
								  //also delays the printing so the user can think of their next move
				
				//Getting the input of the human
				System.out.println("\nEnter your next move");
				System.out.println("\nList of moves, except for spaces already occupied "
										+"\n"
										+ "\n\t00  01  02"
										+ "\n\t10  11  12"
										+ "\n\t20  21  22");
				//Listens for the move input of the user from the console
				String move = scan.nextLine();
				if(move.equals ("00") && TTTboard[0][0] == '-')
					{
							TTTboard[0][0] = 'O';
					}
				if(move.equals ("01") && TTTboard[0][1] == '-')
				{
						TTTboard[0][1] = 'O';
				}
				if(move.equals ("02") && TTTboard[0][2] == '-')
				{
						TTTboard[0][2] = 'O';
				}
				if(move.equals ("10") && TTTboard[1][0] == '-')
				{
						TTTboard[1][0] = 'O';
				}
				if(move.equals ("11") && TTTboard[1][1] == '-')
				{
						TTTboard[1][1] = 'O';
				}
				if(move.equals ("12") && TTTboard[1][2] == '-')
				{
						TTTboard[1][2] = 'O';
				}
				if(move.equals ("20") && TTTboard[2][0] == '-')
				{
						TTTboard[2][0] = 'O';
				}
				if(move.equals ("21") && TTTboard[2][1] == '-')
				{
						TTTboard[2][1] = 'O';
				}
				if(move.equals ("22") && TTTboard[2][2] == '-')
				{
						TTTboard[2][2] = 'O';
				}
				
				//Getting the computer's input
				compMove();
			}
		}
	
	}
	public static void compMove()
	{
		Random random = new Random();
		int h = random.nextInt(4) + 1;
		//computer first move
		if(computerMoveCounter == 1)
		{
			if(h == 1)
			{
				TTTboard[0][0] = 'X';
				compFirstMove ="00";
			}
			else if(h == 2)
			{
				TTTboard[0][2] = 'X';
				compFirstMove = "02";
			}
			else if(h == 3)
			{
				TTTboard[2][0] = 'X';
				compFirstMove = "20";
			}
			else if(h == 4)
			{
				TTTboard[2][2] = 'X';
				compFirstMove = "22";
			}
		}
		computerMoveCounter++;
	}

}


