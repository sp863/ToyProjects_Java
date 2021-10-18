package utils;

import static utils.Constant.*;

import chess.ChessGame;
import chess.Unit;

public class OutputView {
	
	public static void showMainMenu() {
		System.out.println(MAIN_MENU_HEADER);
		System.out.println(MAIN_MENU_PLAYGAME);
		System.out.println(MAIN_MENU_LOADGAME);
		System.out.println(MAIN_MENU_EXIT);
		System.out.println(MAIN_MENU_SEPARATOR);
	}
	
	public static void showGameSeparator() {
		System.out.println(GAME_MENU_SEPARATOR);
	}
	
	public static void showExitMessage() {
		System.out.println(MAIN_MENU_EXIT_MESSAGE);
	}
	
	public static void showChessBoardPlayer1() {
		for (int i = 0; i < BOARD_LENGTH; i++) {
			for (int j = 0; j < BOARD_LENGTH; j++) {
				Unit unit = ChessGame.chessBoard[i][j];
				if (unit != null) {
					if (unit.getUnitColor().equals(PLAYER_COLOR_WHITE)) {
						System.out.print("(W)");
					} else if (unit.getUnitColor().equals(PLAYER_COLOR_BLACK)) {
						System.out.print("(B)");
					}
					System.out.print(unit.getUnitCode()+"\t");
				} else {
					System.out.print("  .\t");
				}
			}
			System.out.print("[" + (BOARD_LENGTH-i) + "]");
			System.out.println();
			System.out.println();
			System.out.println();
		}
		showBoardIndexPlayer1();
	}
	public static void showChessBoardPlayer2() {
		for (int i = BOARD_LENGTH-1; i >= 0; i--) {
			for (int j = BOARD_LENGTH-1; j >= 0; j--) {
				Unit unit = ChessGame.chessBoard[i][j];
				if (unit != null) {
					if (unit.getUnitColor().equals(PLAYER_COLOR_WHITE)) {
						System.out.print("(W)");
					} else if (unit.getUnitColor().equals(PLAYER_COLOR_BLACK)) {
						System.out.print("(B)");
					}
					System.out.print(unit.getUnitCode()+"\t");
				} else {
					System.out.print("  .\t");
				}
			}
			System.out.print("[" + (BOARD_LENGTH-i) + "]");
			System.out.println();
			System.out.println();
			System.out.println();
		}
		showBoardIndexPlayer2();
	}
	
	public static void showBoardIndexPlayer1() {
		char index = 'a';
		for (int i = 0; i< BOARD_LENGTH; i++) {
			System.out.printf(" [%c]\t",(index+i));
		}
		System.out.println();
	}
	
	public static void showBoardIndexPlayer2() {
		char index = 'h';
		for (int i = 0; i< BOARD_LENGTH; i++) {
			System.out.printf("[%c]\t",(index-i));
		}
		System.out.println();
	}
	public static void showVictoryMessage(String message) {
		System.out.println(message);
	}
	public static void showChooseUnitMessage() {
		System.out.println(CHOOSE_UNIT_MESSAGE);
	}
	public static void showChooseLocationMessage() {
		System.out.println(CHOOSE_LOCATION_MESSAGE);
	}
}
