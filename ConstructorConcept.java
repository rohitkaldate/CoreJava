public class ConstructorConcept {       //Class name
    // ConstructorConcept()
    // {
    //     System.out.println("This is Defaukt constructor");
    // }
    // public static void main(String args[])
    // {
    //     ConstructorConcept c=new ConstructorConcept();//This is Default Constructor which is automatically created when object is created

    // }

    // int id;
    // String name;
    // ConstructorConcept(int i,String n)  //Parameterized constructor
    // {
    //     id=i;
    //     name=n;
    // }
    // void dispaly()
    // {
    //     System.out.println(id+" "+name);
    // }
    // public static void main(String args[])
    // {
    //     ConstructorConcept c1= new ConstructorConcept(11, "Rohit");//Assigning values to parameters
    //     ConstructorConcept c2=new ConstructorConcept(12,"Rahi");//Assigning values to parameters
    //     c1.dispaly();
    //     c2.dispaly();
    // }

    //Constructor Overloading

    int id;
    String name;
    int mob;

    ConstructorConcept(int i,String n)
    {
        id=i;
        name=n;
    }
    ConstructorConcept(int i, String n, int m)
    {
        id=i;
        name=n;
        mob=m;

    }

    void dispaly()
    {
        System.out.println(id+" "+name+" "+mob);
    }
    public static void main(String args[])
    {
        ConstructorConcept c1=new ConstructorConcept(12,"Rohit");
        ConstructorConcept c2= new ConstructorConcept(12,"Hem",764567567);
        c1.dispaly();
        c2.dispaly();
    }


}
