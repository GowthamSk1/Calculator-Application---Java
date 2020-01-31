package calculatorprojectpkg;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BottomPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	JButton upBtn, ModBtn, CEBtn, CBtn, backspaceBtn, divBtn;
	JButton aBtn, bBtn, Btn7, Btn8, Btn9,multBtn;
	JButton cBtn, dBtn, Btn4, Btn5, Btn6, subBtn;
	JButton eBtn, fBtn, Btn1, Btn2, Btn3, addBtn;
	JButton openPBtn, closedPBtn, plusMinusBtn, Btn0, decimalBtn, equalsBtn;
	public BottomPanel()
	{
		Dimension dim = getPreferredSize();
		
		dim.height = 200;
		setPreferredSize(dim);
		//setBackground(new Color(230,230,230));
		Insets insets = new Insets(2,2,2,2); // THIS fixes the problem where the text inside the button shows up as ...

		GridBagLayout gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);
		
		GridBagConstraints c = new GridBagConstraints(); 
		//// SET UP GRIDBAG CONSTRAINTS
		c.gridheight = 1;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.LAST_LINE_START;
		c.weightx = 1.0;
		c.weighty = 0.5;
		c.fill = GridBagConstraints.BOTH;		

		
		//////////////////////////////ADD BUTTONS ONE BY ONE IN THE GRID AND SPECIFY STUFF///////////////////
		///////////////////First ROW BUTTONS////////////////////////////////////////////////////////

		upBtn = new JButton("\u2191");
		//upBtn.setFont(upBtn.getFont().deriveFont(30f));
		c.gridx = 0;
		c.gridy = 0;
		upBtn.setMargin(insets);
		add(upBtn, c);
		
	
		ModBtn = new JButton("MOD");
		c.gridx = 1;
		c.gridy = 0;
		//ModBtn.setMargin(insets);
		add(ModBtn,c);
		
		
		CEBtn = new JButton("CE");
		c.gridx = 2;
		c.gridy = 0;
		//CEBtn.setMargin(insets);
		add(CEBtn, c);

	
		CBtn = new JButton("C");
		c.gridx = 3;
		c.gridy = 0;
		//CBtn.setMargin(insets);
		add(CBtn, c);
		
	
		backspaceBtn = new JButton("\u232B");
		c.gridx = 4;
		c.gridy = 0;
		//backspaceBtn.setMargin(insets);
		add(backspaceBtn,c);
		
		
		divBtn = new JButton("\u00F7");
		c.gridx = 5;
		c.gridy = 0;
		//divBtn.setMargin(insets);
		add(divBtn, c);
		
		
		
		///////////////////SECOND ROW BUTTONS////////////////////////////////////////////////////////
		c.gridx = 0;
		c.gridy = 1;
		aBtn = new JButton("A");
		aBtn.setMargin(insets);
		add(aBtn, c);
		
		c.gridx = 1;
		c.gridy = 1;
		bBtn = new JButton("B");
		bBtn.setMargin(insets);
		add(bBtn, c);
		
		c.gridx = 2;
		c.gridy =1;
		Btn7 = new JButton("7");
		Btn7.setMargin(insets);
		add(Btn7,c);
		
		c.gridx = 3;
		c.gridy = 1;
		Btn8 = new JButton("8");
		add(Btn8,c);
		
		c.gridx = 4;
		c.gridy = 1;
		Btn9 = new JButton("9");
		add(Btn9, c);
		
		c.gridx = 5;
		c.gridy = 1;
		multBtn = new JButton("\u00D7");
		add(multBtn,c);
////////////////////////////////////////////THIRD ROW BUTTONS//////////////////////////////////////////
		c.gridx = 0;
		c.gridy = 2;
		cBtn = new JButton("C");
		cBtn.setMargin(insets);

		add(cBtn, c);
		
		c.gridx = 1;
		c.gridy = 2;
		dBtn = new JButton("D");
		add(dBtn, c);
		
		c.gridx = 2;
		c.gridy = 2;
		Btn4 = new JButton("4");
		add(Btn4, c);
		
		c.gridx = 3;
		c.gridy = 2;
		Btn5 = new JButton("5");
		add(Btn5, c);
		
		c.gridx = 4;
		c.gridy = 2;
		Btn6 = new JButton("6");
		add(Btn6, c);
		
		c.gridx = 5;
		c.gridy = 2;
		subBtn = new JButton("-");
		add(subBtn, c);
////////////////////////////////////////////4th ROW BUTTONS//////////////////////////////////////////	
		c.gridx = 0;
		c.gridy = 3;
		eBtn = new JButton("E");
		eBtn.setMargin(insets);

		add(eBtn, c);
		
		c.gridx = 1;
		c.gridy = 3;
		fBtn = new JButton("F");
		add(fBtn, c);
		
		c.gridx = 2;
		c.gridy = 3;
		Btn1 = new JButton("1");
		add(Btn1, c);
		
		c.gridx = 3;
		c.gridy = 3;
		Btn2 = new JButton("2");
		add(Btn2, c);
		
		c.gridx = 4;
		c.gridy = 3;
		Btn3 = new JButton("3");
		add(Btn3, c);
		
		c.gridx = 5;
		c.gridy = 3;
		addBtn = new JButton("+");
		add(addBtn, c);
////////////////////////////////////////////5th ROW BUTTONS//////////////////////////////////////////	
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 4;
		openPBtn = new JButton("(");
		add(openPBtn, c);
		
		c.gridx = 1;
		c.gridy = 4;
		closedPBtn = new JButton(")");
		add(closedPBtn, c);
		
		c.gridx = 2;
		c.gridy = 4;
		plusMinusBtn = new JButton("\u002D");
		add(plusMinusBtn, c);
		
		c.gridx = 3;
		c.gridy = 4;
		Btn0 = new JButton("0");

		add(Btn0, c);
	
		c.gridx = 4;
		c.gridy = 4;
		decimalBtn = new JButton(".");
		add(decimalBtn, c);
		
		c.gridx = 5;
		c.gridy = 4;
		equalsBtn = new JButton("=");
		add(equalsBtn, c);	
		
////////////////////////////////////////LAST ROW////////////////////////////////////////
		JLabel filler = new JLabel();
		
		c.gridx = 0;
		c.gridy = 5;
		add(filler, c);
		JLabel filler1 = new JLabel();
		c.gridx = 1;
		c.gridy = 5;
		add(filler1, c);
		JLabel filler2 = new JLabel();
		c.gridx = 2;
		c.gridy = 5;
		add(filler2, c);
		JLabel filler3 = new JLabel();
		c.gridx = 3;
		c.gridy = 5;
		add(filler3, c);
		JLabel filler4 = new JLabel();
		c.gridx = 4;
		c.gridy = 5;
		add(filler4, c);
		JLabel filler5 = new JLabel();
		c.gridx = 5;
		c.gridy = 5;
		add(filler5, c);

	}
}
