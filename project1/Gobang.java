package ApcsBarry;
/*This is a gobang game.
  Barry
  S3C8 
 */
import java.util.Scanner;

public class Gobang {
	private String board[][];
	private static int SIZE = 17;
	private static String roles = "A player";

	
	public void initBoard() {
		board = new String[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (i == 0 && j<10) {
					String str = "";
					str += j + "  ";
					board[i][j] = str;
				} else if (i == 0 && j>=10) {
						String str = "";
						str += (j-10) + "  ";
						board[i][j] = str;
				} else if (i != 0 && i<10 && j == 0) {
					String str = "";
					str += i + "  ";
					board[i][j] = str;
				} else if (i != 0 && i>=10 && j == 0) {
					String str = "";
					str += (i-10) + "  ";
					board[i][j] = str;
				} else {
					board[i][j] = "©ï";
				}
			}
		}
	}

	public void printBoard() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	public boolean isOk(int x, int y) {
		boolean isRight = true;
		if (x >= 16 || x < 1 || y >= 16 | y < 1) {
			System.out.println("Wrong position");
			isRight = false;
		}
		if (board[x][y].equals("x") || board[x][y].equals("o")) {
			isRight = false;
		}
		return isRight;
	}

	public void whoWin(Gobang wz) {

		int xlabel;
		int ylabel;

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (board[i][j].equals("o")) {
					xlabel = i;
					ylabel = j;

					String heng = "";
					if (i + 5 < SIZE && j + 5 < SIZE) {
						for (int k = j; k < j + 5; k++) {
							heng += board[i][k];
						}
						if (heng.equals("ooooo")) {
							System.out.println(roles + "wins! You lose.");
							System.exit(0);
						}

						String xia = "";
						for (int l = j; l < i + 5; l++) {
							xia += board[l][j];

						}
						if (xia.equals("ooooo")) {
							System.out.println(roles + "wins! You lose.");
							System.exit(0);
						}

						String youxia = "";
						for (int a = 1; a <= 5; a++) {
							youxia += board[xlabel++][ylabel++];
						}
						if (youxia.equals("ooooo")) {
							System.out.println(roles + "wins! You lose.");
							System.exit(0);
						}
					}
				}
			}
		}

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (board[i][j].equals("x")) {
					xlabel = i;
					ylabel = j;

					String heng = "";
					if (j + 5 < SIZE && i + 5 < SIZE) {
						for (int k = j; k < j + 5; k++) {
							heng += board[i][k];
						}
						if (heng.equals("xxxxx")) {
							System.out.println(roles + "wins! You lose.");
							System.exit(0);
						}

						String xia = "";
						for (int l = i; l < i + 5; l++) {
							xia += board[l][ylabel];

						}
						if (xia.equals("xxxxx")) {
							System.out.println(roles + "wins! You lose.");
							System.exit(0);
						}

						String youxia = "";
						for (int a = 1; a <= 5; a++) {
							youxia += board[xlabel++][ylabel++];
						}
						if (youxia.equals("xxxxx")) {
							System.out.println(roles + "wins! You lose.");
							System.exit(0);
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Gobang wz = new Gobang();
		Scanner sc = new Scanner(System.in);
		wz.initBoard();
		wz.printBoard();
		while (true) {
			System.out.print(roles + " enter x,y coordinates£¬(0-15)£¬ex.'13 12',enter '16 16' to close.");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == SIZE && y == SIZE) {
				System.out.println("Ended");
				System.exit(0);
			}
			if (x > SIZE || x < 0 || y > SIZE | y < 0) {
				System.out.println("Please enter again.");
				continue;
			}
			
			if (wz.board[x][y].equals("©ï") && roles.equals("A player")) {
				wz.board[x][y] = "o";
				wz.printBoard();
				
				wz.whoWin(wz);
			} else if (wz.board[x][y].equals("©ï") && roles.equals("B player")) {
				wz.board[x][y] = "x";
				wz.printBoard();
				
				wz.whoWin(wz);
			} else {
				System.out.println("Position occupied, please enter again.");
				continue;
			}
			if (roles.equals("A player")) {
				roles = "B player";
			} else if (roles.equals("B player")) {
				roles = "A player";
			}
		}	
	}
}
