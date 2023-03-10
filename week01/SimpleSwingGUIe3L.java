package CST8221.week01;

/* CST8221-JAP: LAB 01, Example 3L
File name: SimpleSwingGUIe3L.java
This example shows how to use lambda expressions - a new addition to Java 8.
You need Java 1.8.XX to compile and run this example.
*/
//using specific imports
import java.awt.EventQueue;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Simple Java GUI Example. This class is a modification of example 3. It uses
 * the newly (Java 8) introduced lambda expressions. Lambda expression syntax is
 * used instead of anonymous inner class syntax.
 * 
 * @author Svillen Ranev, Daniel Cormier
 * @version 1.19.1
 * @since Java 8
 */
public class SimpleSwingGUIe3L extends JPanel {
	// default serial version ID - Swing components implement the Serializable
	// interface

	/**
	 * Basic serial version
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Button 1
	 */
	private final JButton button_01;

	/**
	 * Basic pane
	 */
	private final JPanel pane;

	/**
	 * Label 1
	 */
	private final JLabel label_01;

	/**
	 * Label 2
	 */
	private final JLabel label_02;

	/**
	 * Basic counter
	 */
	private int clickCounter;

	/**
	 * Look and feel property
	 */
	private transient final UIManager.LookAndFeelInfo[] installedLF;

	/**
	 * Left counter
	 */
	private int lfCounter;

	/**
	 * Max counter
	 */
	private final int lfMaxNumber;

	/**
	 * Frame title
	 */
	private final static String FRAME_TITLE = "Simple Swing GUI - E3L";

	/**
	 * Label text
	 */
	private final String LABEL_TEXT = "Number of happy button clicks: ";

	/**
	 * Default constructor. Sets the GUI.
	 */
	public SimpleSwingGUIe3L() {
		// get available Look and Feels
		installedLF = UIManager.getInstalledLookAndFeels();
		lfMaxNumber = installedLF.length - 1;
		// Create and set up containers and components.
		button_01 = createButton("A Happy New Semester JButton");
		label_01 = new JLabel("Current Look and Feel: " + installedLF[0].getName());
		label_02 = new JLabel(LABEL_TEXT + "0");
		pane = new JPanel();
		// set a border around the JPanel
		pane.setBorder(BorderFactory.createEmptyBorder(25, 25, 10, 25));
		// change the default Layout Manager
		// use GridLayout with 3 rows and 1 column
		pane.setLayout(new GridLayout(3, 1));
		// Add components to JPanel container.
		pane.add(label_01);
		pane.add(button_01);
		pane.add(label_02);
		// Install JPanel as the content pane
		add(pane);
	}

	/**
	 * Creates a button and registers (adds) an ActionListener to process the events
	 * generated by the button.
	 * 
	 * @param buttonName the button label.
	 * @return returns a created button.
	 */
	private JButton createButton(String buttonName) {
		// Create a button
		JButton button = new JButton(buttonName);
		// Change the font size of the default font
		button.setFont(new Font(button.getFont().getName(), button.getFont().getStyle(), 20));// resize the font to size
																								// 20
		// Set a specific font
		// button.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
		// set the initial size of the component
		// in most cases it is better to leave to the UI Manager to determine the
		// preferred size
		button.setPreferredSize(new Dimension(button.getText().length() * 15, 40));
		// Create a keyboard shortcut: Pressing ALT-B will act as a mouse click on the
		// button
		button.setMnemonic('b');
		// Create a Tool Tip. Will show up when the mouse hovers over the button
		button.setToolTipText("Please Click Me");

		// Handle the button clicks.
		// Lambda expression syntax is used instead of anonymous inner class syntax.
		// No need to check for the event source anymore.
		// Now each individual button will be responsible to handle its own events.
		button.addActionListener((ActionEvent ae) -> {
			++clickCounter;
			label_01.setText("Current Look and Feel: " + installedLF[++lfCounter].getName());
			label_02.setText(LABEL_TEXT + clickCounter);
			// now perform another button action: switch to the new look and feel
			try {
				// set new look and feel
				UIManager.setLookAndFeel(installedLF[lfCounter].getClassName());
				// force all components to update their look and feel
				SwingUtilities.updateComponentTreeUI(SimpleSwingGUIe3L.this);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
				// printStackTrace() is used only for debugging purposes.
				// Normally an error dialog should be displayed here or the error must be
				// logged.
				e.printStackTrace();
			}
			if (lfCounter == lfMaxNumber)
				lfCounter = -1;
		});
		return button;
	}

	/**
	 * The main method.The GUI will start with the default Look and Feel - Metal
	 * Look and Feel Runs the application GUI as a thread in the event queue.
	 * Anonymous class is used to create a runnable object.
	 */
	public void execute() {
		// Make all components to configured by the event dispatch thread.
		// This is the thread that passes user provoked events such as mouse clicks to
		// the GUI components which have registered listeners for the events.
		// The following code fragment forces the statements in the run() method to be
		// executed in the
		// event dispatch thread.
		// Lambda expression syntax is used instead of anonymous inner class syntax.
		EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame(FRAME_TITLE);
			JPanel pane1 = new SimpleSwingGUIe3L();
			frame.add(pane1);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		});
	}
}
