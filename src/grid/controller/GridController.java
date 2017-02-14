package grid.controller;

import javax.swing.JOptionPane;

import grid.model.Grid;
import grid.view.GridFrame;

public class GridController 
{
	private GridFrame appFrame;
	private Grid [][] grid;

	public void start() 
	{
		JOptionPane.showMessageDialog(appFrame, "Hey look, it's my 2D creation");
	}

	public Object[][] getGrid() 
	{
		
		return grid;
	}
	
	private void fillGrid()
	{
		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[0].length; col++)
			{
				grid[row][col] = new Grid();
			}
		}
	}
	
	public void updateGrid()
	{
		
	}
	
	private boolean isValid(String temp)
	{
		try
		{
			Integer.parseInt(temp);
			return true;
		}
		catch(NumberFormatException Error)
		{
			JOptionPane.showMessageDialog(gridFrame,  "Use an int, please");
		}
	}

}
