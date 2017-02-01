package grid.view;

import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.*;
import grid.controller.GridController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import grid.controller.GridController;

public class GridPanel extends JPanel 
{
	private GridController baseController;
	private JTable gridTable;
	private JScrollPane gridPane;
	private SpringLayout baseLayout;
	private JtextField columnField;
	
	public GridPanel() 
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.columnField = new JTextField(5);
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one","two","three","four","five"});
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
