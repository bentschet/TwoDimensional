package grid.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import grid.view.GridFrame;
import java.awt.Color;
import grid.controller.GridController;
import java.awt.Dimension;

public class GridPanel extends JPanel 
{
	private GridController baseController;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JTextField columnField;
	private JTextField rowField;
	private JTextField somethingElseField;
	private JTable tableThing;
	
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
		updateButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						baseController.updateGrid(rowField.getText(), columnField.getText(), somethingElseField.getText());
						repaint;
					}
				});
	}

}
