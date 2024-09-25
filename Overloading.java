//Method Overloading: It has same method name but different parametrers / arguments
public class Overloading{
    // int add(int a, int b)
    // {
    //     return (a+b);
    // }
    // int add(int a, int b,int c)
    // {
    //     return(a+b+c);
    // }
    // public static void main(String args[])
    // {
    //     Overloading a1=new Overloading();
    //     System.out.println(a1.add(10,20));
    //     System.out.println(a1.add(10,20,30));

    // }


//Method Overloading: By changing datatypes of the parameters

    int sub(int a, int b)
    {
        return(a-b);
    }
    double sub(double a, double b)
    {
        return(a-b);
    }
    public static void main(String args[])
    {
        Overloading a2= new Overloading();
        System.out.println(a2.sub(20, 10));
        System.out.println(a2.sub(20.1,10.2));
    }
}

