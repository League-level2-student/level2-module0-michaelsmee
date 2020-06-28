/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;    
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[]nums = new JButton[5];
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String i=JOptionPane.showInputDialog("number plz");
		
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		
		//11. set the JFrame to visible.
		
		//12. Give the user the instructions for the game.
		
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		
		//14. Set the text of the JButton located at hiddenButton to  "ME"

		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		
		//18. else tell them to try again
	}
}
/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	JButton button;
	String x;
	int y;
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] nums = new JButton[y];
	
	//2 create an int variable called hiddenButton
	int hiddenButton;
	
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		x=JOptionPane.showInputDialog("please enter a possitive integer");
		int y = Integer.parseInt(x);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		
		//5. Make a for loop to iterate through the JButton array
		for(int i=0; i<y; i++) {
			nums[i]=new JButton();
		//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			nums[i].addActionListener(this);
			//8. add each JButton to the panel
			panel.add(nums[i]);
		}
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
	window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "you have to try and find a hidden button. Hint, no google.");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random rand = new Random(); 
		int hiddenButton = rand.nextInt(y);
		//14. Set the text of the JButton located at hiddenButton to  "ME"
		nums[hiddenButton].setText("me");
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		nums[hiddenButton].setText(" ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
	
	
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(nums[hiddenButton]) {
			System.out.println("u did it");
		
		//18. else tell them to try again
			else {
				System.out.println("try again");
			}
}
	}
}

