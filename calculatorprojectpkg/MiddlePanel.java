package calculatorprojectpkg;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MiddlePanel extends JPanel{
	JPanel topButtonPanel, bottomButtonPanel;     		// Panel for each  
	JButton converterBtn, sampleBtn, WORDBtn, MSBtn, MBtn; // first row buttons
	JButton LshBtn, RshBtn, OrBtn, XorBtn, NotBtn, AndBtn;  // second row buttons
	JButton binBtn;
	GridBagLayout gridbaglayout;
	Insets insets;
	GridBagConstraints n;
	public MiddlePanel()
	{
		gridbaglayout = new GridBagLayout();
		setLayout(gridbaglayout);  			// set layout of the panel to grid bag layout
		insets = new Insets(1,1,1,1);
											// Grid bag constraints
		n = new GridBagConstraints(); 
		n.anchor = GridBagConstraints.FIRST_LINE_START;
		n.fill = GridBagConstraints.BOTH;		
		n.weightx = 0.1;
		n.weighty = 0.1;
		
///////////////////////////////////////////////////CREATE TOP LAYER BUTTONS///////////////////////////////
		n.gridx = 0;
		n.gridy = 0;
		converterBtn = new JButton("converter");
		converterBtn.setMargin(insets);
		add(converterBtn,n);
		
		n.gridy = 0;
		n.gridx = 1;
		sampleBtn = new JButton("***");
		sampleBtn.setMargin(insets);
		add(sampleBtn,n);

		n.gridy = 0; 
		n.gridx =2;
		n.gridwidth = 2;
		WORDBtn = new JButton("WORD");
		WORDBtn.setMargin(insets);
		add(WORDBtn, n);
		
		n.gridy = 0;
		n.gridx = 4;
		n.gridwidth = 1;
		MSBtn = new JButton("MS");
		add(MSBtn, n);
		
		n.gridy = 0;
		n.gridx =5;
		MBtn = new JButton("M^");
		add(MBtn, n);

		///////////////////////////DONE WITH TOPBUTTONPANEL///////////////////////////////////////////////
		// Create second row buttons
		n.gridy = 1;
		n.gridx = 0;
		LshBtn = new JButton("Lsh");
		LshBtn.setMargin(insets);
		add(LshBtn,n);
		
		n.gridy = 1;
		n.gridx= 1;
		RshBtn = new JButton("Rsh");
		RshBtn.setMargin(insets);
		add(RshBtn,n);
		
		n.gridy = 1;
		n.gridx= 2;
		OrBtn = new JButton("Or");
		OrBtn.setMargin(insets);
		add(OrBtn, n);
		
		n.gridy = 1;
		n.gridx = 3;
		XorBtn = new JButton("Xor");
		XorBtn.setMargin(insets);
		add(XorBtn,n);
		
		n.gridy =1;
		n.gridx = 4;
		NotBtn = new JButton("Not");
		NotBtn.setMargin(insets);
		add(NotBtn, n);
		
		n.gridy = 1;
		n.gridx = 5;
		AndBtn = new JButton("And");
		AndBtn.setMargin(insets);
		add(AndBtn, n);
		/////////////////////////////////DONE WITH BOTTOMBUTTONPANEL////////////////////////////////////
	}
}
