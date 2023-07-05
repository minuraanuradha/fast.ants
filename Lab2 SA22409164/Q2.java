class Q2
{
      
    public static void main(String[] args)
    {
        final int miles = 26;
        final int yards = 385;
        double kilometers = (miles * 1.609) + ((yards / 1760.0) * 1.609);
        System.out.println("Miles and Yards in Kilometers = "+kilometers);
    
    }
}