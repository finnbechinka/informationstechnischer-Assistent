package tictactoe;

import java.util.Random;

public class Game {
	private int gameCount = 1;
	private int turns = 0;
	private boolean twoPlayer = true;
	private boolean gameEnded = false;
	private boolean turnx = true;
	private String field[] = { null, null, null, null, null, null, null, null,
			null };
	private WGame window;

	public Game(WGame w) {
		this.window = w;
		updateLabel();
	}

	public void updateLabel() {
		if (turnx) {
			window.setLabel("Game: " + gameCount + "     Turn: X");
		} else {
			window.setLabel("Game: " + gameCount + "     Turn: O");
		}
	}

	public void restartGame() {
		gameCount++;
		turns = 0;
		gameEnded = false;
		turnx = true;
		field = new String[] { null, null, null, null, null, null, null, null,
				null };
		updateLabel();
	}

	public void makeMove(int f, boolean getOut) {
		if (!gameEnded && field[f - 1] == null) {
			if (turnx) {
				field[f - 1] = "X";
				window.updateField("X", f - 1);
				turnx = false;
			} else if (!turnx) {
				field[f - 1] = "O";
				window.updateField("O", f - 1);
				turnx = true;
			}
			for (int i = 0; i < field.length; i++) {
				System.out.print(field[i] + ", ");
			}
			System.out.print("\n");
			turns++;
			checkForWinner();
			updateLabel();
			if (!twoPlayer && !gameEnded && !getOut) {
				Random r = new Random();
				int tmp;
				do {
					tmp = r.nextInt(9);
				} while (field[tmp] != null);
				System.out.println(tmp);
				makeMove(tmp + 1, true);
			}
		}
	}

	public void setTwoPlayer(boolean tp) {
		this.twoPlayer = tp;
	}

	private void checkForWinner() {
		for (int i = 0; i < field.length; i++) {
			if (field[i] == null) {
				continue;
			} else if (i == 0 || i == 3 || i == 6) {
				if (i + 2 < field.length && field[i] == field[i + 1]
						&& field[i] == field[i + 2]) {
					System.out.println("- Winner: " + field[i]);
					gameEnded = true;
					window.markWinner(i, i + 1, i + 2);
				} else if (i + 6 < field.length && field[i] == field[i + 3]
						&& field[i] == field[i + 6]) {
					System.out.println("| Winner: " + field[i]);
					gameEnded = true;
					window.markWinner(i, i + 3, i + 6);
				} else if (i == 0 && i + 8 < field.length
						&& field[i] == field[i + 4] && field[i] == field[i + 8]) {
					System.out.println("\\ Winner: " + field[i]);
					gameEnded = true;
					window.markWinner(i, i + 4, i + 8);
				}
			} else if (i == 1 || i == 2) {
				if (i + 6 < field.length && field[i] == field[i + 3]
						&& field[i] == field[i + 6]) {
					System.out.println("| Winner: " + field[i]);
					gameEnded = true;
					window.markWinner(i, i + 3, i + 6);
				} else if (i == 2 && i + 4 < field.length
						&& field[i] == field[i + 2] && field[i] == field[i + 4]) {
					System.out.println("/ Winner: " + field[i]);
					gameEnded = true;
					window.markWinner(i, i + 2, i + 4);
				}
			} else if (turns == 9) {
				System.out.println("Tie");
				gameEnded = true;
				break;
			}
		}
	}

	public boolean isTurnx() {
		return turnx;
	}
}
