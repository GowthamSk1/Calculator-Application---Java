package calculatorprojectpkg;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private TopPanel topPanel; 			 // create Top panel to hold display and components 
	private MiddlePanel middlePanel;	// create Middle panel to hold display and components 	
	private BottomPanel bottomPanel;	// create Bottom panel to hold display and components 
	private BorderLayout mainBorderLayout;
	Font font, font1;
	Stack<Character> stack;
	String temp;
	double answerTotal;
	int calculate, answer;
	boolean convert;
	public MainFrame()
	{
		setLayout(null);
		mainBorderLayout = new BorderLayout(1,1);  // create new border layout with 1hgap and 1vgap 
		setLayout(mainBorderLayout);				// set the layout of the  frame
		setBounds(6, 55, 359, 65);					// set the bounds of the frame
		// set the Color of the frame
		//setBackground(Color.CYAN);
		// create all panels
		topPanel = new TopPanel();
		middlePanel = new MiddlePanel();
		bottomPanel = new BottomPanel();
		// Add all the panels
		add(topPanel, mainBorderLayout.NORTH);
		add(middlePanel, mainBorderLayout.CENTER);
		add(bottomPanel, mainBorderLayout.PAGE_END);
		// stack 
		stack = new Stack<>();
		// Create the font of the inputs and the display field
		font = new Font("Segoe UI", Font.BOLD, 30);
		font1 = new Font("Segoe", Font.BOLD, 15);
		// Set the font of the inputs
		topPanel.input.setFont(font);
		topPanel.input1.setFont(font1);
		// Set the font for the list and the Programmer string
		topPanel.switchtoList.setFont(font1);
		topPanel.switchtoList.setFont(font1);
		// Initialize the display with empty string
		topPanel.input.setText("");  
		topPanel.input1.setText("");
///////////////////////////////////////////////// ACTION LISTENERS/////////////////////////////////////////////////		
		bottomPanel.Btn9.addActionListener(this);
		bottomPanel.Btn8.addActionListener(this);
		bottomPanel.Btn7.addActionListener(this);
		bottomPanel.Btn6.addActionListener(this);
		bottomPanel.Btn5.addActionListener(this);
		bottomPanel.Btn4.addActionListener(this);
		bottomPanel.Btn3.addActionListener(this);
		bottomPanel.Btn2.addActionListener(this);
		bottomPanel.Btn1.addActionListener(this);
		bottomPanel.Btn0.addActionListener(this);
		bottomPanel.CBtn.addActionListener(this);
		bottomPanel.backspaceBtn.addActionListener(this);
		bottomPanel.CEBtn.addActionListener(this);
		middlePanel.WORDBtn.addActionListener(this);
/////////////////////////////////////////////NOW FOR ARITMETIC OPERATIONS/////////////////////////////////////////////////////
		bottomPanel.divBtn.addActionListener(this);
		bottomPanel.multBtn.addActionListener(this);
		bottomPanel.subBtn.addActionListener(this);
		bottomPanel.addBtn.addActionListener(this);
		bottomPanel.ModBtn.addActionListener(this);
		bottomPanel.equalsBtn.addActionListener(this);
		bottomPanel.plusMinusBtn.addActionListener(this);
		bottomPanel.decimalBtn.addActionListener(this);
		bottomPanel.closedPBtn.addActionListener(this);
		bottomPanel.openPBtn.addActionListener(this);
/////////////////////////////////////////////////CONVERSIONS////////////////////////////////////////////////////////////////////
		topPanel.HEXBtn.addActionListener(this);
		topPanel.DECBtn.addActionListener(this);
		topPanel.OCTBtn.addActionListener(this);
		topPanel.BINBtn.addActionListener(this);
///////////////////////////////////////////////////////ALPHABETS/////////////////////////////////////////////
		bottomPanel.bBtn.addActionListener(this);
		bottomPanel.cBtn.addActionListener(this);
		bottomPanel.dBtn.addActionListener(this);
		bottomPanel.eBtn.addActionListener(this);
		bottomPanel.fBtn.addActionListener(this);
		bottomPanel.aBtn.addActionListener(this);
	}
	// This method computes the arithmetic operations of 2 numbers with 2 operands  one number is in the tiny (input1) textfield and the other number is in the bigger (input) textfield
	void compute()
	{
		switch(calculate)
		{
			case 1: // addition of 2 numbers
				answerTotal = answerTotal + Double.parseDouble(topPanel.input.getText());
				if(!stack.isEmpty()) stack.pop();
				break;
			case 2:	// subtraction of 2 numbers
				answerTotal = answerTotal - Double.parseDouble(topPanel.input.getText());
				if(!stack.isEmpty()) stack.pop();
				break;
			case 3: // multiplication of 2 numbers
				answerTotal = answerTotal * Double.parseDouble(topPanel.input.getText());
				if(!stack.isEmpty()) stack.pop();
				break;
			case 4: // division of 2 numbers  
				answerTotal = answerTotal / Double.parseDouble(topPanel.input.getText());
				if(!stack.isEmpty()) stack.pop();
				break;
			case 5: // Modulus operation
				answerTotal = answerTotal%Double.parseDouble(topPanel.input.getText());
				if(!stack.isEmpty()) stack.pop();
				break;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == middlePanel.WORDBtn)
		{
			convert = true;
			topPanel.HEXBtn.setEnabled(true);
			topPanel.DECBtn.setEnabled(true);
			topPanel.OCTBtn.setEnabled(true);
			topPanel.BINBtn.setEnabled(true);
		
		}
		if(convert && e.getSource() == topPanel.HEXBtn)
		{
			topPanel.HEXLbl.setEnabled(true);
		}
		if(convert && e.getSource() == topPanel.DECBtn)
		{
			topPanel.DECLbl.setEnabled(true);
		}
		if(convert && e.getSource() == topPanel.OCTBtn)
		{
			topPanel.OCTLbl.setEnabled(true);
		}
		if(convert && e.getSource() == topPanel.BINBtn)
		{
			topPanel.BINLbl.setEnabled(true);
			bottomPanel.Btn2.setEnabled(false);
			bottomPanel.Btn3.setEnabled(false);
			bottomPanel.Btn4.setEnabled(false);
			bottomPanel.Btn5.setEnabled(false);
			bottomPanel.Btn6.setEnabled(false);
			bottomPanel.Btn7.setEnabled(false);
			bottomPanel.Btn8.setEnabled(false);
			bottomPanel.Btn9.setEnabled(false);
			bottomPanel.aBtn.setEnabled(false);
			bottomPanel.bBtn.setEnabled(false);
			bottomPanel.cBtn.setEnabled(false);
			bottomPanel.dBtn.setEnabled(false);
			bottomPanel.eBtn.setEnabled(false);
			bottomPanel.fBtn.setEnabled(false);
			bottomPanel.openPBtn.setEnabled(false);
			bottomPanel.closedPBtn.setEnabled(false);
			

		}
		if(e.getSource() == bottomPanel.CBtn)
		{		// If user clicks C button then Delete everything
			answerTotal = 0;
			answer = 0;
			calculate = 0;
			bottomPanel.Btn2.setEnabled(true);
			bottomPanel.Btn3.setEnabled(true);
			bottomPanel.Btn4.setEnabled(true);
			bottomPanel.Btn5.setEnabled(true);
			bottomPanel.Btn6.setEnabled(true);
			bottomPanel.Btn7.setEnabled(true);
			bottomPanel.Btn8.setEnabled(true);
			bottomPanel.Btn9.setEnabled(true);
			bottomPanel.aBtn.setEnabled(true);
			bottomPanel.bBtn.setEnabled(true);
			bottomPanel.cBtn.setEnabled(true);
			bottomPanel.dBtn.setEnabled(true);
			bottomPanel.eBtn.setEnabled(true);
			bottomPanel.fBtn.setEnabled(true);
			bottomPanel.openPBtn.setEnabled(true);
			bottomPanel.closedPBtn.setEnabled(true);
			topPanel.HEXLbl.setText("");
			topPanel.DECLbl.setText("");
			topPanel.OCTLbl.setText("");
			topPanel.BINLbl.setText("");
			topPanel.input.setText("");  
			topPanel.input1.setText("");
		
		}
		if(e.getSource() == bottomPanel.CEBtn)
		{	// If user clicks CE button then Delete only the input display

			topPanel.input.setText("");  
		}
		if(e.getSource() == bottomPanel.plusMinusBtn)
		{	// If user clicks minus button then check if there is already a minus then add it 
			if(!(topPanel.input.getText().contains("-"))) topPanel.input.setText( "-" + topPanel.input.getText());
		}
		if(e.getSource() == bottomPanel.backspaceBtn)
		{ 	// If user clicks backspace button then backspace the inputs
			int length = topPanel.input.getText().length();   				 // create length and last digit variable 
			int lastDigit = topPanel.input.getText().length()-1;
			String newDigits = "";									// new digit string to store the new digits
			if(length == 1)    										// set text to nothing
			{
				topPanel.input.setText(""); 						
			}
			else if(length > 0)  // if length is greater than 0 then backspace
			{
				StringBuilder backSpace = new StringBuilder(topPanel.input.getText());  // internal functionality
				backSpace.deleteCharAt(lastDigit);
				newDigits = backSpace.toString();
				topPanel.input.setText(newDigits);
			}
		}
		if(e.getSource() == bottomPanel.Btn0)
		{ 	// If user clicks 0 button then add 0 
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("0");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() + "0");
		}
		if(e.getSource() == bottomPanel.Btn9)
		{ // If user clicks 9 button then add 9
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("9");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"9");
		}
		if(e.getSource() == bottomPanel.Btn8)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("8");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"8");
		}
		if(e.getSource() == bottomPanel.Btn7)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("7");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"7");
		}
		if(e.getSource() == bottomPanel.Btn6)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("6");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"6");
		}
		if(e.getSource() == bottomPanel.Btn5)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("5");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"5");
		}
		if(e.getSource() == bottomPanel.Btn4)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("4");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"4");
		}
		if(e.getSource() == bottomPanel.Btn3)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("3");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
				}
				else topPanel.input.setText(topPanel.input.getText() +"3");
		}
		if(e.getSource() == bottomPanel.Btn2)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("2");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"2");
		}
		if(e.getSource() == bottomPanel.Btn1)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("1");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"1");
		}
		if(e.getSource() == bottomPanel.decimalBtn)
		{
			if(!(topPanel.input.getText().contains("."))) topPanel.input.setText(topPanel.input.getText() + ".");
		}
		if(e.getSource() == bottomPanel.openPBtn)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("(");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"(");
		}
		if(e.getSource() == bottomPanel.closedPBtn)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText(")");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +")");
		}
		if(e.getSource() == bottomPanel.aBtn)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("A");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"A");
		}
		if(e.getSource() == bottomPanel.bBtn)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("B");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"B");
		}
		if(e.getSource() == bottomPanel.cBtn)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("C");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"C");
		}
		if(e.getSource() == bottomPanel.dBtn)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("D");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"D");
		}
		if(e.getSource() == bottomPanel.eBtn)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("E");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"E");
		}
		if(e.getSource() == bottomPanel.fBtn)
		{
			if(!stack.isEmpty()) 
			{
				topPanel.input.setText("F");
				stack.pop();
				System.out.println("stack is " + stack.isEmpty());
			}
			else topPanel.input.setText(topPanel.input.getText() +"F");
		}
//////////////////////////////////////////////////////OPERATIONS/////////////////////////////////////////////////////////////////////////////////
		// temp variable to evaulate an arithmetic expression
		temp = "";
		if(e.getSource() == bottomPanel.addBtn)
		{// If user clicks ADD button then display the operand before the button into the recent display screen/textfield
			if(stack.isEmpty())
			{	// check if stack is empty so you can add new number mainly for edge case
				if(!topPanel.input.getText().isEmpty() && !topPanel.input.getText().contains("("))  
				{  // this if statement is to make sure the user does not add an empty string aka add a number with nothing 
					topPanel.input1.setText(topPanel.input1.getText() + topPanel.input.getText() + "+");   		// adds the number and operations to the smaller text field/tiny recent display screen
					if(topPanel.input1.getText().length() >1 ) temp = topPanel.input1.getText().substring(0, topPanel.input1.getText().length()-1);     // THIS IS IMPORTANT -- it creates a substring which is passed to a method in another class that evaluates the expressed after the user clicks any of the arthicmetic operations buttons
					stack.push('+');								// this is kind of unnecessary but it just pushes onto a stack
					answerTotal = Solve.evaluateExpression(temp);  // This function calculates the expression from which we created a substring that was extracted from the tiny input textfield/ display screen
					calculate = 1;		// this is needed for the compute method that computes the cumulative operations from the evaluateExpression
					topPanel.input.setText(Double.toString(answerTotal));  // simply displays the answer in the bigger display pane
				}
				else if(topPanel.input.getText().contains(")"))
				{
					topPanel.input1.setText(topPanel.input1.getText() + topPanel.input.getText() + "+");   		// adds the number and operations to the smaller text field/tiny recent display screen
					if(topPanel.input1.getText().length() >1 ) temp = topPanel.input1.getText().substring(0, topPanel.input1.getText().length()-1);     // THIS IS IMPORTANT -- it creates a substring which is passed to a method in another class that evaluates the expressed after the user clicks any of the arthicmetic operations buttons
					stack.push('+');								// this is kind of unnecessary but it just pushes onto a stack
					System.out.println(temp);
					answerTotal = Solve.evaluateExpression(temp);  // This function calculates the expression from which we created a substring that was extracted from the tiny input textfield/ display screen
					calculate = 1;		// this is needed for the compute method that computes the cumulative operations from the evaluateExpression
					topPanel.input.setText(Double.toString(answerTotal));  // simply displays the answer in the bigger display pane
				}
				else
				{
					topPanel.input.setText(topPanel.input.getText() + "+");   		// adds the number and operations to the smaller text field/tiny recent display screen
   		
				}
			}
		} // THE comments are going to be the same since it does the same functionality except for the operations * / and - mod
		if(e.getSource() == bottomPanel.subBtn)
		{
			if(stack.isEmpty())
			{
				if(!topPanel.input.getText().isEmpty() && !topPanel.input.getText().contains("("))
				{
					stack.push('-');
					topPanel.input1.setText(topPanel.input1.getText() + topPanel.input.getText() + "-");
					if(topPanel.input1.getText().length() >1 ) temp = topPanel.input1.getText().substring(0, topPanel.input1.getText().length()-1);
					System.out.println("temp is" + temp);
					answerTotal = Solve.evaluateExpression(temp);
					calculate = 2;
					topPanel.input.setText(Double.toString(answerTotal));
				}
				else if(topPanel.input.getText().contains(")"))
				{
					stack.push('-');
					topPanel.input1.setText(topPanel.input1.getText() + topPanel.input.getText() + "-");
					if(topPanel.input1.getText().length() >1 ) temp = topPanel.input1.getText().substring(0, topPanel.input1.getText().length()-1);
					System.out.println("temp is" + temp);
					answerTotal = Solve.evaluateExpression(temp);
					calculate = 2;
					topPanel.input.setText(Double.toString(answerTotal));
				}
				else
				{
					topPanel.input.setText(topPanel.input.getText() + "-");   		// adds the number and operations to the smaller text field/tiny recent display screen
   		
				}
			}
		}
		if(e.getSource() == bottomPanel.multBtn)
		{
			if(stack.isEmpty())
			{
				if(!topPanel.input.getText().isEmpty() && !topPanel.input.getText().contains("("))
				{
					stack.push('*');
					topPanel.input1.setText(topPanel.input1.getText() + topPanel.input.getText() + "*");
					if(topPanel.input1.getText().length() >1 ) temp = topPanel.input1.getText().substring(0, topPanel.input1.getText().length()-1);
					answerTotal = Solve.evaluateExpression(temp);
					calculate = 3;
					topPanel.input.setText(Double.toString(answerTotal));
				}
				else if(topPanel.input.getText().contains(")"))
				{
					stack.push('*');
					topPanel.input1.setText(topPanel.input1.getText() + topPanel.input.getText() + "*");
					if(topPanel.input1.getText().length() >1 ) temp = topPanel.input1.getText().substring(0, topPanel.input1.getText().length()-1);
					answerTotal = Solve.evaluateExpression(temp);
					calculate = 3;
					topPanel.input.setText(Double.toString(answerTotal));
				}
				else
				{
					topPanel.input.setText(topPanel.input.getText() + "*");   		// adds the number and operations to the smaller text field/tiny recent display screen
   		
				}
			}
		}
		if(e.getSource() == bottomPanel.divBtn)
		{
			if(stack.isEmpty())
			{
				if(!topPanel.input.getText().isEmpty() && !topPanel.input.getText().contains("("))
				{
					stack.push('/');
					topPanel.input1.setText(topPanel.input1.getText() + topPanel.input.getText() + "/");
					if(topPanel.input1.getText().length() >1 ) temp = topPanel.input1.getText().substring(0, topPanel.input1.getText().length()-1);
					answerTotal = Solve.evaluateExpression(temp);
					calculate = 4;
					topPanel.input.setText(Double.toString(answerTotal));
				}
				else if(topPanel.input.getText().contains(")"))
				{
					stack.push('/');
					topPanel.input1.setText(topPanel.input1.getText() + topPanel.input.getText() + "/");
					if(topPanel.input1.getText().length() >1 ) temp = topPanel.input1.getText().substring(0, topPanel.input1.getText().length()-1);
					answerTotal = Solve.evaluateExpression(temp);
					calculate = 4;
					topPanel.input.setText(Double.toString(answerTotal));
				}
				else
				{
					topPanel.input.setText(topPanel.input.getText() + "/");   	
				}
			}
		}
		if(e.getSource() == bottomPanel.ModBtn)
		{
			if(stack.isEmpty())
			{
				if(!topPanel.input.getText().isEmpty())
				{
					stack.push('%');
					topPanel.input1.setText(topPanel.input1.getText() + topPanel.input.getText() + "Mod");
					answerTotal = Double.parseDouble(topPanel.input.getText().trim());
					System.out.println("temp is" + temp);
					calculate = 5;
					topPanel.input.setText(Double.toString(answerTotal));
				}
			}
		}
		if(e.getSource() == bottomPanel.equalsBtn)
		{
			if(topPanel.input1.getText().isEmpty() && !topPanel.input.getText().isEmpty())
			{
				answerTotal = Solve.evaluateExpression(topPanel.input.getText());
				topPanel.input.setText(Double.toString(answerTotal));
				topPanel.input1.setText("");
				answerTotal = 0;
			}
			else if(!topPanel.input1.getText().isEmpty() && topPanel.input.getText().contains(")"))
			{
				//System.out.println(answerTotal);
				topPanel.input.setText(Double.toString(Solve.evaluateExpression(topPanel.input.getText())));
				compute();
				topPanel.input.setText(Double.toString(answerTotal));
				topPanel.input1.setText("");
				answerTotal = 0;
			}
			else
			{
				compute();
				answer = (int)answerTotal;
				topPanel.input1.setText("");
				topPanel.input.setText(Double.toString(answerTotal));
				answerTotal = 0;
			}
			
			if(convert)
			{
				int maxInteger = 127;
				int minInteger = -128;
				if((int)answer <= maxInteger && (int)answer >= minInteger)
				{
					if(topPanel.HEXLbl.isEnabled()) topPanel.HEXLbl.setText(Integer.toHexString((int)answer));   // convert denary to hexadecimal and display
					if(topPanel.DECLbl.isEnabled()) topPanel.DECLbl.setText((Integer.toString((int)answer))); // convert denary to decimal and display
					if(topPanel.OCTLbl.isEnabled()) topPanel.OCTLbl.setText(Integer.toOctalString((int)answer));
					if(topPanel.BINLbl.isEnabled()) topPanel.BINLbl.setText(Integer.toBinaryString((int)answer));
				}
				else 
				{
					if(topPanel.HEXLbl.isEnabled()) topPanel.HEXLbl.setText("Out of range for word");   // convert denary to hexadecimal and display
					if(topPanel.BINLbl.isEnabled()) topPanel.DECLbl.setText("Out of range for word"); // convert denary to decimal and display
					if(topPanel.OCTLbl.isEnabled()) topPanel.OCTLbl.setText("Out of range for word");
					if(topPanel.BINLbl.isEnabled()) topPanel.BINLbl.setText("Out of range for word");
				}
			}
		}
	}
}

/*  Comments for debugging
 * 	System.out.println("temp is" + temp);
 * topPanel.setBorder(BorderFactory.createTitledBorder("gqwerasdfasdfasdf"));
 * 
 * 	middlePanel.setBorder(BorderFactory.createTitledBorder("aaaaaaaaaaaaa"));
 * 	bottomPanel.setBorder(BorderFactory.createTitledBorder("bbbbbbbbbbbb"));
 * 
 * 
 */		

	
