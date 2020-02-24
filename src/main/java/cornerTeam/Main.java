//This class is the main class of CornerTeams search engine program.

package cornerTeam;

import java.awt.*;
import javax.swing.*;

public class Main
{

	public static void main(String[]args)
	{
    	JFrame search = new JFrame();
    	JFrame admin = new JFrame();
    	JPanel searchPanel = new JPanel();
    	JPanel adminPanel = new JPanel();
    	
    	searchPanel = setupSearchPanel(searchPanel);
    	search.getContentPane().add(searchPanel);
    	search.setVisible(true);
    	search.pack();
    	search.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    	
    	adminPanel = setupAdminPanel(adminPanel);
    	admin.getContentPane().add(adminPanel);
    	admin.setVisible(true);
    	admin.pack();
    	admin.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
  
	public static JPanel setupAdminPanel(JPanel panel) 
	{
		Integer intIndexCount = 0;
  		JLabel inMaint;				// "Search Engine - Index Maintenance View" Label
  		JLabel lblIndexCount;		// "Number of filed indexed: " Label
  		JLabel lblVersionNum;		// "Search Engine version 1.1" Label
    	JButton btnAddFile;			// "Add File" Button
    	JButton btnRebuild;			// "Rebuild Out-of-Date" Button
    	JButton btnRemove;			// "Remove Selected Files" Button
    	JButton btnResetWin;		// "Reset Windows" Button
    	JTable adminTable;			// Variable name for Index table
  		
    	String[] colNames = {"File Name","Status"};
    	Object[][] data = {};
  		
    	lblIndexCount = new JLabel ("Number of files indexed: " + intIndexCount);
    	inMaint = new JLabel ("Search Engine - Index Maintenance View");
    	lblVersionNum = new JLabel ("Search Engine version 1.1");
    	btnAddFile = new JButton("Add File");
    	btnRebuild = new JButton("Rebuild Out-of-Date");
    	btnRemove = new JButton("Remove Selected Files");
    	btnResetWin = new JButton("Reset Windows");
    	adminTable = new JTable(data, colNames);
  		
    	inMaint.setFont(new Font("", Font.BOLD, 17));
    	JScrollPane scrollPane = new JScrollPane(adminTable);
    	adminTable.setFillsViewportHeight(true);
  		
       	panel.setPreferredSize (new Dimension (565, 320));
       	panel.setLayout (null);
  		
       	panel.add(lblIndexCount);
       	panel.add(inMaint);
       	panel.add(lblVersionNum);
       	panel.add(btnAddFile);
       	panel.add(btnRebuild);
       	panel.add(btnRemove);
       	panel.add(btnResetWin);
       	panel.add(scrollPane);
  		
       	lblIndexCount.setBounds (7, 293, 180, 30);
       	inMaint.setBounds (25, 0, 500, 27);
       	lblVersionNum.setBounds (380, 293, 180, 30);
       	btnAddFile.setBounds(380, 52, 87, 23);
       	btnRebuild.setBounds(380, 210, 180, 23);
       	btnRemove.setBounds(380, 235, 180, 23);
       	btnResetWin.setBounds(380, 271, 125, 23);
       	scrollPane.setBounds (7, 30, 370, 265);
  		
       	return panel;
	}
	
	public static JPanel setupSearchPanel(JPanel panel) 
	{
		// Declaration of all variables and their types
		JLabel lblsearch;				// "Search" Label
    	JTextField txtSearchBar;		// The search bar for user entries
    	JCheckBox chkbxAnd;				// "All of the Search Terms" Checkbox
    	JCheckBox chkbxOr;				// "Any of the Search Terms" Checkbox
    	JCheckBox chkbxExactPhrase;		// "Exact Phrase" Checkbox
    	JButton btnSearch;				// "Search" Button
    	JList listSearch;				// Name of the area displaying indexed items
    	JButton btnExit;				// "Exit" Button
    	JButton btnAbout;				// "About" Button
    	JButton btnAdmin;				// "Admin" Button
	    
    	//construct preComponents
       	String[] listSearchItems = {};

       	//construct components
       	lblsearch = new JLabel ("Search: ");
       	txtSearchBar = new JTextField (1);
       	chkbxAnd = new JCheckBox ("All Key Words");
       	chkbxOr = new JCheckBox ("Any Key Words");
       	chkbxExactPhrase = new JCheckBox ("Exact Phrase");
       	btnSearch = new JButton ("Search");
       	listSearch = new JList (listSearchItems);
       	btnExit = new JButton ("Exit");
       	btnAbout = new JButton ("About");
       	btnAdmin = new JButton ("Admin...");

       	//set components properties
       	listSearch.setEnabled (false);

       	//adjust size and set layout
       	panel.setPreferredSize (new Dimension (667, 366));
       	panel.setLayout (null);

       	//add components
       	panel.add (lblsearch);
       	panel.add (txtSearchBar);
       	panel.add (chkbxAnd);
       	panel.add (chkbxOr);
       	panel.add (chkbxExactPhrase);
       	panel.add (btnSearch);
       	panel.add (listSearch);
       	panel.add (btnExit);
       	panel.add (btnAbout);
       	panel.add (btnAdmin);

       	//set component bounds (only needed by Absolute Positioning)
       	lblsearch.setBounds (25, 5, 100, 25);
       	txtSearchBar.setBounds (100, 10, 430, 20);
       	chkbxAnd.setBounds (110, 40, 110, 25);
       	chkbxOr.setBounds (270, 40, 120, 25);
       	chkbxExactPhrase.setBounds (425, 40, 115, 25);
       	btnSearch.setBounds (560, 5, 100, 28);
       	listSearch.setBounds (20, 65, 525, 295);
       	btnExit.setBounds (560, 65, 100, 25);
       	btnAbout.setBounds (555, 330, 100, 25);
       	btnAdmin.setBounds (555, 275, 100, 25);
       	
       	return panel;
	}
}