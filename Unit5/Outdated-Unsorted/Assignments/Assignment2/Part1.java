/*
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 1: Boxcar
 * A class which represents a single car on a freight train.
 */

public class Boxcar
{
    private String cargo = "";
    private int numUnits;
    private boolean repair;
    
    public Boxcar()
    {
        cargo = "gizmos";
        numUnits = 5;
        repair = false;
    }
    
    public Boxcar(String c, int u, boolean r)
    {
        if(c.equals("gadgets") || c.equals("widgets") || c.equals("wadgets"))
        {
            cargo = c;
        }
        else
        {
            cargo = "gizmos";
        }
        
        repair = r;
        
        if(!repair && 0 <= u && u <= 10)
        {
            numUnits = u;
        }
        else
        {
            numUnits = 0;
        }
    }
    
    public String toString()
    {
        String res = "";
        res += numUnits;
        res += " ";
        res += cargo;
        res += repair ? "\tin repair" : "\tin service";
        return res;
    }
    
    public void loadCargo() {
        if(numUnits < 10 && !repair)
        {
            numUnits++;
        }
    }
    
    public String getCargo()
    {
        return cargo;
    }
    
    public void setCargo(String c)
    {
        c = c.toLowerCase();
        if(c.equals("gadgets") || c.equals("widgets") || c.equals("wadgets"))
        {
            cargo = c;
        }
        else
        {
            cargo = "gizmos";
        }
    }
    
    public boolean isFull()
    {
        return numUnits == 10;
    }
    
    public void callForRepair()
    {
        repair = true;
        numUnits = 0;
    }
}
