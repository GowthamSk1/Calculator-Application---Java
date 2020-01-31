package calculatorprojectpkg;
import javax.swing.*;
public class TestCalculator {

	public static void main(String[] args) {
		MainFrame window = new MainFrame();	
		// try {
			 
	        // Windows LF
	      //  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	       //}  catch (Exception g) {
	                    // Let java set its default
	    //}
	 
		window.pack();
		window.setTitle("calculator");		// Set title of the JFrame frame in window 
		window.setVisible(true);				// Set visibility to true so it can display
		//window.setSize(295,545);				// Set Default size
		window.setBounds(100, 100, 300, 495);
		window.setResizable(false);			// The user can resize the window
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Exit when user closes the window

	}

}
  