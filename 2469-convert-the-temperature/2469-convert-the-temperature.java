class Solution
{
    public double[] convertTemperature(double celsius)
    {
        double kel= celsius+ 273.15;
        double fahr= (celsius*1.8)+32.0 ;
        double[] arr={kel,fahr};
        return arr;
    }
}