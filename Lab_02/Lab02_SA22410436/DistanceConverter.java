class DistanceConverter 
{
    int miles;
    int yards ;
    double kilometers;

    public DistanceConverter (int txtmiles,int txtyards)
    {
        miles = txtmiles;
        yards = txtyards;
    }
    public void Conversition ()
    {
        kilometers = (miles * 1.609 + yards / 1760.0 * 1.609);
    }
    public static void main(String[] args) 
    {
        DistanceConverter obj01 = new DistanceConverter(26 , 385);
        obj01.Conversition();
        System.out.println("The Distnce is : " + obj01.kilometers + " km");

    }
}
    
