package mainPicPack;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * @author Garrison
 *
 */
public class PicrossLayout extends JFrame implements ItemListener, ActionListener{

	JButton b[]=new JButton[9];  
	JButton reset; 
	Checkbox c1,c2; 
	
	
	public void showButton(){  

		int x = 10, y = 10, j = 0;
		for (int i = 0; i <= 8; i++, x += 100, j++) {
			b[i] = new JButton();
			if (j == 3) {
				j = 0;
				y += 100;
				x = 10;
			}
			b[i].setBounds(x, y, 100, 100);
			add(b[i]);
			b[i].addActionListener((ActionListener) this);
		} // eof for
		
		reset = new JButton("RESET");
		reset.setBounds(100, 350, 100, 50);
		add(reset);
		reset.addActionListener(this);
	
	}
	
    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	
    	JFrame frame = new JFrame("Picross");
        frame.setLayout(new GridLayout(6, 6)); //6x6 grid
        JButton button = new JButton();

        JPanel[][] grid = new JPanel[5][5]; //5x5 grid of cells
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = new JPanel();
                grid[i][j].setBackground(Color.lightGray);
                frame.add(grid[i][j]);
            }
        }
        
        // Add JLabels for numbers to the edges of the grid
        JPanel rowLabels = new JPanel(new GridLayout(1, 5));
        JPanel colLabels = new JPanel(new GridLayout(5, 1));
        for (int i = 0; i < 5; i++) {
            rowLabels.add(new JLabel("1\n"));
            colLabels.add(new JLabel("2"));
        }
        frame.add(rowLabels,0);
        frame.add(colLabels,5);
        frame.setSize(500, 500);
        frame.addMouseListener(null);
        frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}