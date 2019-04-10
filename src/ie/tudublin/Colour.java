package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    public float r;
    public float g;
    public float b;
    public float value;
    private String colour;

    Colour(TableRow row)
    {
        colour = row.getString("colour");
        r = row.getFloat("r");
        g = row.getFloat("g");
        b = row.getFloat("b");
        value = row.getFloat("value");
    }

    // Colour
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public String getColour()
    {
        return colour;
    }


    // Letters
    public void setR(float r)
    {
        this.r = r;
    }
    public float getR()
    {   
        return r;
    }

    public void setG(float g)
    {
        this.g = g;
    }
    public float getG()
    {   
        return g;
    }

    public void setB(float b)
    {
        this.b = b;
    }
    public float getB()
    {   
        return b;
    }


    // Value
    public void setValue(float value)
    {
        this.value = value;
    }
    public float getValue()
    {
        return value;
    }


    // To String
    public String toString()
    {
        return colour + " \t " + " \t " + r + " \t "  + g +" \t " + b + " \t "  + value;
    }
}