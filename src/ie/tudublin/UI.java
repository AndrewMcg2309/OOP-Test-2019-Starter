package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{
	// Array list 1
	ArrayList<Colour> colours = new ArrayList<Colour>();
	Table table1;

	//Array List 2
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	Table table2;
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		loadTable();
		printTable();
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void loadTable()
	{
		table1 = loadTable("colours.csv", "header");

		for(TableRow row : table1.rows())
		{
			colours.add(new Colour(row));
		}


		// For 2nd array list
		table2 = loadTable("resistors.csv", "header");

		for(TableRow row1 : table2.rows())
		{
				resistors.add(new Resistor(row1));		
		}
	}

	public void printTable()
	{
		for(int i = 0 ; i < colours.size() ; i ++)
		{
			System.out.println(colours);
		}

		for(int i = 0 ; i < resistors.size() ; i ++)
		{
			System.out.println(resistors);
		}
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
		// Drawing numbers on right;

		stroke(0);
		int yDis = 150;
		int con = 100;

		for(int k = 0 ; k < resistors.size() ; k ++)
		{
			text(resistors(k), 300, yDis);
			yDis = yDis + con;
		}


		// Resistors
		Resistor R1 = new Resistor(100, 200, 5, 50);
		R1.render();

		Resistor R2 = new Resistor(100, 350, 5, 50);
		R2.render();

		Resistor R3 = new Resistor(100, 500, 5, 50);
		R3.render();
		
		Resistor R4 = new Resistor(10, 650, 5, 50);
		R4.render();


	}

	private String resistors(int k) {
		return null;
	}

	/*public Colour findColour(int value)
	{
		Colour result;


		return result;
	}*/
}
