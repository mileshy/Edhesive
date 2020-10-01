/* Term 2 Assignment 4 - Fraction Comparable */

public class Fraction implements Comparable
{
    private int numerator;
    private int denominator;

    public Fraction()
    {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d)
    {
        this();
        if(n > 0)
        {
            numerator = n;
        }
        if(d > 0)
        {
            denominator = d;
        }
        simplify();
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }

    public String mixedNumber()
    {
        if(numerator < denominator)
        {
            return toString();
        }

        if (numerator % denominator == 0)
        {
            return "" + numerator/denominator;
        }

        return numerator/denominator + " " + numerator % denominator + "/" + denominator;
    }

    public void add(int n, int d)
    {
        if(n > 0 && d > 0)
        {
            numerator = numerator * d + n * denominator;
            denominator *= d;
        }
        simplify();
    }
    
    static int gcd(int a, int b)
    {
        while(b != 0)
        {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    
    public void simplify()
    {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
    
    public int compareTo(Object obj)
    {
        Fraction other = (Fraction)obj;
        int oDen = other.denominator;
        int den = denominator;
        other.numerator *= den;
        other.denominator *= den;
        numerator *= oDen;
        denominator *= oDen;
        int ret = 0;
        if(numerator < other.numerator)
        {
            ret = -1;
        }
        else if(numerator > other.numerator)
        {
            ret = 1;
        }
        
        other.simplify();
        simplify();
        return ret;
    }
}
