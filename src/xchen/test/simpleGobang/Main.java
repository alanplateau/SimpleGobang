package xchen.test.simpleGobang;

import java.awt.Container;
import javax.swing.JFrame;

import xchen.test.simpleGobang.DrawChessBoard;

public class Main extends JFrame{
	private DrawChessBoard drawChessBoard;
	public Main() {		
		drawChessBoard = new DrawChessBoard();
		
		//Frame标题
		setTitle("单机五子棋");
		
		Container containerPane =getContentPane();
		containerPane.add(drawChessBoard);		
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.setSize(800, 800);
		m.setVisible(true);
	}
}
