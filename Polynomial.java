public class Polynomial
{
    public double[] co;

    public Polynomial()
    {
        co = new double[1];
    }

    public Polynomial(double[] arr)
    {
        co = arr;
    }

    public Polynomial add(Polynomial poly)
    {
        double[] arr;
        if(co.length < poly.co.length)
        {
            arr = new double[poly.co.length];
        }
        else
        {
            arr = new double[co.length];
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(i < co.length) arr[i] += co[i];
            if(i < poly.co.length) arr[i] += poly.co[i];
        }
        return new Polynomial(arr);
    }

    public double evaluate(double num)
    {
        double sum = 0;
        for(int i = 0; i < co.length; i++)
        {
            sum += co[i] * Math.pow(num, i);
        }
        return sum;
    }

    public boolean hasRoot(double num)
    {
        double sum = evaluate(num);
        return sum == 0;
    }
}