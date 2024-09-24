//Object initialization via refrence variable:

public class College {
    int id;
    String address;
    
    public static void main(String rgs[])
    {
        College c=new College();
        c.id=11;
        c.address="Raj";

        System.out.println(c.id);
        System.out.println(c.address);

    }
}
