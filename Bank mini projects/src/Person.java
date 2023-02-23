public class Person
{
    private int account_no;
    private static int saccno=1000;
    private String name;
    private String city;
    private double bal;

    public Person(String name,String city, double bal)
    {
        this.name=name;
        this.city=city;
        this.bal=bal;
        this.account_no=saccno++;
    }

    public int getAccount_no()
    {
        return account_no;
    }

    public void setAccount_no(int account_no)
    {
        this.account_no = account_no;
    }

    public static int getSaccno()
    {
        return saccno;
    }

    public static void setSaccno(int saccno)
    {
        Person.saccno = saccno;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public double getBal()
    {
        return bal;
    }

    public void setBal(double bal)
    {
        this.bal = bal;
    }

    @Override
    public String toString()
    {
        return "[account_no=" + account_no + ", name=" + name + ", city=" + city + ", bal=" + bal + "]";
    }

}