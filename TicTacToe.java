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
	public static boolean end = false;//when end = true, the game should end

	public static void main(String[] args) throws InterruptedException{
		
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
							+"\nGet three X's or O's in a row to win the game");
		
		System.out.println("\nTo start, Enter s ");
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		if(input.equals("s"))
			System.out.println("Beginning status of Tic Tac Toe board:"
								+"\n");
		{
			
			/**A while loops that prints the board until the variable end becomes true.
			 * Each time a player makes a move during their turn, this loop will print out the status of
			 * of the board so the users can make their move
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
				
				//Getting the input of the player 1
				System.out.println("\nEnter your move player 1");
				System.out.println("\nList of moves, except for spaces already occupied "
										+"\n"
										+ "\n\t00  01  02"
										+ "\n\t10  11  12"
										+ "\n\t20  21  22");
				//Listens for the move input of the user from the console
				String move1 = scan.nextLine();
				if(move1.equals ("00") && TTTboard[0][0] == '-')
					{
							TTTboard[0][0] = 'O';
					}
				if(move1.equals ("01") && TTTboard[0][1] == '-')
				{
						TTTboard[0][1] = 'O';
				}
				if(move1.equals ("02") && TTTboard[0][2] == '-')
				{
						TTTboard[0][2] = 'O';
				}
				if(move1.equals ("10") && TTTboard[1][0] == '-')
				{
						TTTboard[1][0] = 'O';
				}
				if(move1.equals ("11") && TTTboard[1][1] == '-')
				{
						TTTboard[1][1] = 'O';
				}
				if(move1.equals ("12") && TTTboard[1][2] == '-')
				{
						TTTboard[1][2] = 'O';
				}
				if(move1.equals ("20") && TTTboard[2][0] == '-')
				{
						TTTboard[2][0] = 'O';
				}
				if(move1.equals ("21") && TTTboard[2][1] == '-')
				{
						TTTboard[2][1] = 'O';
				}
				if(move1.equals ("22") && TTTboard[2][2] == '-')
				{
						TTTboard[2][2] = 'O';
				}
				
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
					Thread.sleep(2000);
					
				//getting move of player 2
				System.out.println("\nEnter your move player 2");
				System.out.println("\nList of moves, except for spaces already occupied "
										+"\n"
										+ "\n\t00  01  02"
										+ "\n\t10  11  12"
										+ "\n\t20  21  22");
				//Listens for the move input of the user from the console
				String move2 = scan.nextLine();
				if(move2.equals ("00") && TTTboard[0][0] == '-')
					{
							TTTboard[0][0] = 'X';
					}
				if(move2.equals ("01") && TTTboard[0][1] == '-')
				{
						TTTboard[0][1] = 'X';
				}
				if(move2.equals ("02") && TTTboard[0][2] == '-')
				{
						TTTboard[0][2] = 'X';
				}
				if(move2.equals ("10") && TTTboard[1][0] == '-')
				{
						TTTboard[1][0] = 'X';
				}
				if(move2.equals ("11") && TTTboard[1][1] == '-')
				{
						TTTboard[1][1] = 'X';
				}
				if(move2.equals ("12") && TTTboard[1][2] == '-')
				{
						TTTboard[1][2] = 'X';
				}
				if(move2.equals ("20") && TTTboard[2][0] == '-')
				{
						TTTboard[2][0] = 'X';
				}
				if(move2.equals ("21") && TTTboard[2][1] == '-')
				{
						TTTboard[2][1] = 'X';
				}
				if(move2.equals ("22") && TTTboard[2][2] == '-')
				{
						TTTboard[2][2] = 'X';
						
	
				}
				
			
			}
		}
	
	}

	}
}





