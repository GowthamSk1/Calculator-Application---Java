package calculatorprojectpkg;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
public class TopPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	JPanel labelPanel, displayPanel, conPanel;
	JLabel nameLabel;
	JLabel switchtoList;
	JButton HEXBtn, DECBtn, OCTBtn, BINBtn;
	JLabel HEXLbl, DECLbl, OCTLbl, BINLbl;
	JTextField input,input1;
	public TopPanel()
	{
		setLayout(new BorderLayout(2,2));	
		FlowLayout flowLabel = new FlowLayout(FlowLayout.LEFT, 5,5);
		labelPanel = new JPanel(flowLabel);
		//labelPanel.setBorder(BorderFactory.createTitledBorder("dddddddddddddd"));
		switchtoList = new JLabel("=="); 
		nameLabel = new JLabel("PROGRAMMER"); 
		labelPanel.add(switchtoList);
		labelPanel.add(nameLabel);
		//labelPanel.setBackground(new Color(230,230,230));
		add(labelPanel, BorderLayout.NORTH); 	
		///////////////////////////////////////////////field to display what the user enters//////////////
		displayPanel = new JPanel();
		//displayPanel.setBorder(BorderFactory.createTitledBorder("eeeeeeeeeeeeeeee"));
		BorderLayout displayScreen = new BorderLayout();
		//displayPanel.setBounds(new Rectangle(295, displayPanel.getHeight()));
		displayPanel.setLayout(displayScreen);
		input = new JTextField(12);
		input1 = new JTextField(12);
		input.setHorizontalAlignment(JTextField.RIGHT);
		input1.setBackground(new Color(230,230,230));
		input1.setHorizontalAlignment(JTextField.RIGHT);
		displayPanel.add(input1, BorderLayout.NORTH);
		displayPanel.add(input, BorderLayout.CENTER);
		add(displayPanel, BorderLayout.CENTER); 	// add displaypanel to the toppanel	
		///////////////////////////////////////////////////////////////////////////////////
		conPanel = new JPanel(new GridLayout(4, 7));
	   	HEXBtn = new JButton("HEX");
		conPanel.add(HEXBtn);
		HEXLbl = new JLabel("");
		conPanel.add(HEXLbl);
		JLabel fllr = new JLabel("");
		conPanel.add(fllr);
		JLabel fllr3 = new JLabel("");
		conPanel.add(fllr3);
		///////////////////////////////////////////////////////////////////////////////////////////
		DECBtn = new JButton("DEC");
		conPanel.add(DECBtn);
		DECLbl = new JLabel("");
		conPanel.add(DECLbl);
		JLabel fllr4 = new JLabel("");
		conPanel.add(fllr4);
		JLabel fllr1 = new JLabel("");
		conPanel.add(fllr1);
		///////////////////////////////////////////////////////////////////////////////////////////
		OCTBtn = new JButton("OCT");
		conPanel.add(OCTBtn);
		OCTLbl = new JLabel("");
		conPanel.add(OCTLbl);
		JLabel fllr5 = new JLabel("");
		conPanel.add(fllr5);
		JLabel fllr2 = new JLabel("");
		conPanel.add(fllr2);
		///////////////////////////////////////////////////////////////////////////////////////////////
		BINBtn = new JButton("BIN");
		conPanel.add(BINBtn);
		BINLbl = new JLabel("");
		conPanel.add(BINLbl);
		HEXBtn.setEnabled(false);
		DECBtn.setEnabled(false);
		OCTBtn.setEnabled(false);
		BINBtn.setEnabled(false);
		HEXLbl.setEnabled(false);
		DECLbl.setEnabled(false);
		OCTLbl.setEnabled(false);
		BINLbl.setEnabled(false);
		/////////////////////////////////////ADD THE LABELS NEXT TO THE BUTTONS//////////////////////////
		add(conPanel, BorderLayout.SOUTH); // add labelpanel to the TOP PANEL
	}
}
