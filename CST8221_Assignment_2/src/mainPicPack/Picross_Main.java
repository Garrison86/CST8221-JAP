package mainPicPack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * @author mikea
 *
 */
public class Picross_Main extends JFrame implements ItemListener, ActionListener {
	private static final long serialVersionUID = 1L;

	boolean state, type, set;

	JButton reset;
	Checkbox c1, c2;
	
	// frame contains the panels
	JFrame mainFrame;
	// add panels 
	JPanel gamepanel;
	JPanel menuPanel;
	JPanel sidepanel;
	JPanel title;
	JPanel frame;
	

	public void gameTitle() {
		
		JPanel title = new JPanel();
		title.setBounds(5,0,700,100);
		title.setBackground(Color.GRAY);
		title.setVisible(true);
		
		
		mainFrame.add(title);
	};
	
	
	public void sidePanelGB() {
		JPanel sidepanel = new JPanel();
		sidepanel.setBounds(5, 140, 160, 540);
		sidepanel.setBackground(Color.gray);
		sidepanel.setVisible(true);
		mainFrame.add(sidepanel);
	}
	
	
	public void showButtons() {
		JPanel buttonPanel=new JPanel();
		buttonPanel.setBounds(270, 250, 400, 400);
		buttonPanel.setBackground(Color.DARK_GRAY);
		JButton b[] = new JButton[25];
		
		int x, y;
		for (int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++)
			b[i] = new JButton();
			}
			b[i].setBounds(x, y, 400, 400);
			buttonPanel.add(b[i]);
			b[i].addActionListener((ActionListener) this);
		} // eof for
		mainFrame.add(buttonPanel);
	};

	public void gameBoardPanel() {
    
		    JPanel gamePanel=new JPanel();
		    
		    JButton b1=new JButton();    
		    JButton b2=new JButton();    
		    JButton b3=new JButton();    
		    JButton b4=new JButton();    
		    JButton b5=new JButton();    
		    JButton b6=new JButton();    
		    JButton b7=new JButton();    
		    JButton b8=new JButton();    
		    JButton b9=new JButton();       
		    JButton b10=new JButton();    
		    JButton b11=new JButton();    
		    JButton b12=new JButton();    
		    JButton b13=new JButton();    
		    JButton b14=new JButton();    
		    JButton b15=new JButton();    
		    JButton b16=new JButton();    
		    JButton b17=new JButton();    
		    JButton b18=new JButton();    
		    JButton b19=new JButton();    
		    JButton b20=new JButton();    
		    JButton b21=new JButton();    
		    JButton b22=new JButton();    
		    JButton b23=new JButton();    
		    JButton b24=new JButton();    
		    JButton b25=new JButton();    
		     
		    
		    // adding buttons to the frame       
		    gamePanel.add(b1); gamePanel.add(b2); gamePanel.add(b3);  gamePanel.add(b4); gamePanel.add(b5); 
		    gamePanel.add(b6); gamePanel.add(b7); gamePanel.add(b8);  gamePanel.add(b9); gamePanel.add(b10); 
		    gamePanel.add(b11); gamePanel.add(b12); gamePanel.add(b13);  gamePanel.add(b14); gamePanel.add(b15); 
		    gamePanel.add(b16); gamePanel.add(b17); gamePanel.add(b18);  gamePanel.add(b19); gamePanel.add(b20);   
		    gamePanel.add(b21); gamePanel.add(b22); gamePanel.add(b23);  gamePanel.add(b24); gamePanel.add(b25);   
		  
		    // setting grid layout of 3 rows and 3 columns    
		    gamePanel.setLayout(new GridLayout(5,5));    
//		    gamePanel.setSize(400,400);    
		    gamePanel.setBounds(280,260,400,400);
		    gamePanel.setBackground(Color.BLACK);
		    gamePanel.setVisible(true);
		    mainFrame.add(gamePanel);
	};

	Picross_Main() {
		
		
		mainFrame = new JFrame();
		gameBoardPanel();
		gameTitle();
		sidePanelGB();
//		showButtons();
		menuPanel = new JPanel();
		menuPanel.setBackground(Color.DARK_GRAY);
		menuPanel.setBounds(5, 100, 700, 40);
		menuPanel.setVisible(true);
		mainFrame.add(menuPanel);

		String menu[] = { "option 1", "Opotion 2", "AHAHHAH help me", "Yeet" };
		String Theme[] = { "White", "Dark", "Medieval Mode" };
		String mode[] = { "Easy", "Hard" };
		String size[] = { "5x5", "10x10" };

		// Drop Down menu
		JComboBox cB1 = new JComboBox(menu);
		cB1.setBounds(50, 100, 80, 30);
		cB1.setBackground(Color.white);

		// Crop Down Theme
		JComboBox cB2 = new JComboBox(Theme);
		cB2.setBounds(50, 50, 80, 30);
		cB2.setBackground(Color.white);

		// Crop Down mode
		JComboBox cB3 = new JComboBox(mode);
		cB2.setBounds(50, 50, 80, 30);
		cB2.setBackground(Color.white);

		// Crop Down size
		JComboBox cB4 = new JComboBox(size);
		cB2.setBounds(50, 50, 80, 30);
		cB2.setBackground(Color.white);
		
		menuPanel.add(cB1);
		menuPanel.add(cB2);
		menuPanel.add(cB3);
		menuPanel.add(cB4);
		mainFrame.add(menuPanel).setVisible(true);
		
		
		mainFrame.setBounds(0, 0, 700, 700);
		mainFrame.setBackground(Color.BLACK);
		mainFrame.setLayout(null);// crucial to have
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
	};

// ==================== MAIN =========================

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Picross_Main();

	};
// ================== MAIN END =======================

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	};

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	};

}
