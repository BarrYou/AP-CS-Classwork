/*Barry You
 * Daniel
 * This is a game TicTacToe,
 * PLEASE CAREFULLY FOLLOW THE INSTRUCTION.
 */
package ApcsBarry;
import java.util.Scanner;
public class TicTacToe {
	private String[][] board;
	private static final int ROWS=3;
	private static final int COLS=3;
	public TicTacToe()
	{
		board=new String[ROWS][COLS];
		for(int r=0;r<ROWS;r++)
			for(int c=0;c<COLS;c++)
				board[r][c]=" ";
		
	}
	public void makeMove(int r, int c, String symbol) {
		board[r][c]=symbol;
	}
	public String toString()
	{
		String s="";
		for(int r=0;r<ROWS;r++)
		{
			s=s+"|";
			for(int c=0;c<COLS;c++)
				s=s+board[r][c];
			s=s+"|\n";
		}
		return s;
	}
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		TicTacToe game=new TicTacToe();
		for(int i=0;i<10;i++) {
			if((i+10)%2==0) {
			System.out.println("Player 1, Please enter the position 'r(0,1,2),c(0,1,2),o(symbol)', enter '0,0,0' when there is a result.");
			int r=input.nextInt();
			int c=input.nextInt();
			String symbol=input.next();
			if(symbol.compareTo("0")==0) {
				i=i+100;
			}
			else {
				game.makeMove(r, c, symbol);
			System.out.println(game.toString());
			}
			}
			if((i+10)%2!=0) {
				System.out.println("Player 2, Please enter the position 'r,c,x', enter '0,0,0' when there is a result.");
				int r=input.nextInt();
				int c=input.nextInt();
				String symbol=input.next();
				if(symbol.compareTo("0")==0) {
					i=i+100;
				}
				else {
				game.makeMove(r, c, symbol);
				System.out.println(game.toString());
				}
			}

			
		}
		int numOfX=0;
		int numOfO=0;
		boolean gotResult=false;
		for(int a=0;a<3;a++)
        {
            for(int b=0;b<3;b++)
            {
                if(game.board[a][b]=="x")
                {
                    numOfX++;
                }
                else
                {
                    numOfO++;
                }
            }
            if(numOfX==3||numOfO==3)
            {
                gotResult=true;
                break;
            }
            else
            {
                numOfX=0;
                numOfO=0;
            }
        }
        if(!gotResult)
        {
            for(int b=0;b<3;b++)
            {
                for(int a=0;a<3;a++)
                {
                    if(game.board[a][b]=="x")
                    {
                        numOfX++;
                    }
                    else
                    {
                        numOfO++;
                    }
                }
                if(numOfX==3||numOfO==3)
                {
                    gotResult=true;
                    break;
                }
                else
                {
                    numOfX=0;
                    numOfO=0;
                }
            }
        }

        if(!gotResult)
        {
            for(int a=0;a<3;a++)
            {
                if(game.board[a][a]=="x")
                {
                    numOfX++;
                }
                else
                {
                    numOfO++;
                }
            }
            if(numOfX==3||numOfO==3)
            {
                gotResult=true;
                 
            }
            else
            {
                numOfX=0;
                numOfO=0;
            }
        }

        if(!gotResult)
        {
            for(int a=0;a<3;a++)
            {
                if(game.board[a][3-a-1]=="x")
                {
                    numOfX++;
                }
                else
                {
                    numOfO++;
                }
            }
            if(numOfX==3||numOfO==3)
            {
                gotResult=true;
            }
            else
            {
                numOfX=0;
                numOfO=0;
            }
        }

        if(gotResult)
        {
            if(numOfX==3)
            {
                System.out.println("X wins");
            }
            else if(numOfO==3)
            {
                System.out.println("O wins");
            }
        }
        else
        {
            System.out.println("NIL");
        }
		
		

		

	}
}
