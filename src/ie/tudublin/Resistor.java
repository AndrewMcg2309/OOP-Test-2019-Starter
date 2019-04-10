package ie.tudublin;


import processing.data.TableRow;

public class Resistor
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    Resistor(TableRow rows)
    {
        value = rows.getInt(0);
        //ones = rows.getInt(1);
        //tens = row1.getInt(2);
        //hundreds = row1.getInt(3);
    }

    public Resistor(int value, int ones, int tens, int hundreds)
    {
        this.value = value;
        this.ones = ones;
        this.tens = tens;
        this.hundreds = hundreds;
    }

    public void render()
    {
        
    }
}