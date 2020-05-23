package pacman;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import pacman.Window;

public class Minesweeper extends JFrame {
	
	//INSTANCE VARIABLES
	private Window _w = new Window();
	private JPanel statusbar;
	
	//CONSTRUCTOR
	public Minesweeper() {
		initUI();
	}
	
	/*
	 * This method will create the JPanel that will encapsule the board
	 */
	private void initUI() {
		statusbar = new JPanel();
		add(statusbar, BorderLayout.NORTH);

		add(new Board(statusbar));

		setResizable(false);
		pack();

		setTitle("Crimesweeper");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/*
	 * This is the run method for the entire program
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {

			Minesweeper ex = new Minesweeper();
			ex.setVisible(true);
		});
	}
}
