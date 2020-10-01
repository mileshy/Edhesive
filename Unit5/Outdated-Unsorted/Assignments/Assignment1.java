public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction()
    {
        this(1, 1);
    }
    
    public Fraction(int n, int d)
    {
        numerator = Math.max(n, 1);
        denominator = Math.max(d, 1);
    }
    
    public String toString()
    {
        return "" + numerator + "/" + denominator;
    }
    
    public String mixedNumber()
    {
        int whole = numerator / denominator;
        int remainder = numerator % denominator;
        String res = "";
        
        if(whole != 0)
        {
            res += whole;
        }
        if(remainder != 0)
        {
            if(whole != 0) res += " ";
            res += remainder + "/" + denominator;
        }
        return res;
    }
    
    public void add(int n, int d)
    {
        if(n > 0 && d > 0)
        {
            numerator = numerator * d + n * denominator;
            denominator *= d;
        }
    }
}
