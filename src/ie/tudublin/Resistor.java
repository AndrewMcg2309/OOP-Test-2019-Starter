package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    Resistor(TableRow row1)
    {
        value = row1.getInt("value");
        ones = row1.getInt("ones");
        tens = row1.getInt("tens");
        hundreds = row1.getInt("hundreds");
    }

}