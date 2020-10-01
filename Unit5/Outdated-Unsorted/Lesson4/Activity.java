class Vehicle
{
    private int location;
    
    public Vehicle()
    {
        location = 0;
    }
    
    public Vehicle(int loc)
    {
        location = loc;
        if(loc < -20)
        {
            location = -20;
        }
        else if(loc > 20)
        {
            location = 20;
        }
    }
    
    public void forward()
    {
        if(location < 20) location++;
    }
    
    public void backward()
    {
        if(location > -20) location--;
    }
    
    public int getLocation()
    {
        return location;
    }
    
    public String toString()
    {
        int spaces = location + 20;
        String res = "";
        for(int i = 0; i < spaces; i++)
        {
            res += ' ';
        }
        res += '@';
        return res;
    }
}
