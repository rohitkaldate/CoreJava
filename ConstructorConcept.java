public class ConstructorConcept {       //Class name
    // ConstructorConcept()
    // {
    //     System.out.println("This is Defaukt constructor");
    // }
    // public static void main(String args[])
    // {
    //     ConstructorConcept c=new ConstructorConcept();//This is Default Constructor which is automatically created when object is created

    // }

    int id;
    String name;
    ConstructorConcept(int i,String n)  //Parameterized constructor
    {
        id=i;
        name=n;
    }
    void dispaly()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        ConstructorConcept c1= new ConstructorConcept(11, "Rohit");//Assigning values to parameters
        ConstructorConcept c2=new ConstructorConcept(12,"Rahi");//Assigning values to parameters
        c1.dispaly();
        c2.dispaly();
    }
}
