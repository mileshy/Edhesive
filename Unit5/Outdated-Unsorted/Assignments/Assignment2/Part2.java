/*
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 2: FreightTrain
 * A class which represents a freight train with multiple boxcars.
 */

import java.util.ArrayList;

public class FreightTrain
{
    private ArrayList<Boxcar> train = new ArrayList<Boxcar>();
    
    public FreightTrain()
    {
        train = new ArrayList<Boxcar>();
        train.add(new Boxcar("gizmos", 5, false));
    }
    
    public FreightTrain(int n)
    {
        if(n <= 0)
        {
            train = new ArrayList<Boxcar>();
            train.add(new Boxcar("gizmos", 5, false));
        }
        else
        {
            train = new ArrayList<Boxcar>();
            for(int i = 0; i < n; i++)
            {
                train.add(new Boxcar("gizmos", 5, false));
            }
        }
    }
    
    public String toString()
    {
        String res = "";
        for(int i = 0; i < train.size(); i++)
        {
            res += train.get(i).toString() + '\n';
        }
        return res;
    }
    
    public void setCargo(String c)
    {
        for(Boxcar b : train)
        {
            b.setCargo(c);
        }
    }
    
    public void setMultiCargo()
    {
        String[] cargo = {"gizmos", "gadgets", "widgets", "wadgets"};
        for(int i = 0; i < train.size(); i++)
        {
            train.get(i).setCargo(cargo[i % cargo.length]);
        }
    }
    
    public void fillTrain()
    {
        for(Boxcar b : train)
        {
            for(int i = 0; i < 10; i++)
            {
                b.loadCargo();
            }
        }
    }
    
    public void callForRepair(int i)
    {
        train.get(i).callForRepair();
    }
}
