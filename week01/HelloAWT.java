package CST8221.week01;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

/**
 * Class HelloAWT - For demo AWT
 * @author sousap
 *
 */
public class HelloAWT {
	
	/**
	 * Public constructor
	 */
	public HelloAWT() {
		;
	}
	
	/**
	 * Main method
	 * @param args Param arguments
	 */
    public static void main(String[] args) {
        Frame frame = new Frame("Hello, World!");
        Label label = new Label("Hello, World!");
        frame.add(label);
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setVisible(true);
    }
}
