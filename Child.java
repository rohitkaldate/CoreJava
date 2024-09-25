//Single Level Inheritance:
// class Parent
// {
//     void adult()
//     {
//         System.out.println("You are adult");
//     }
// }
// class Child extends Parent{
//     void young()
//     {
//         System.out.println("You are younger");
//     }
//     public static void main(String args[])
//     {
//         Child c=new Child();
//         c.young();
//         c.adult();
//     }
// }

//Multilevel Inheritance:

class Company
{
    void name()
    {
        System.out.println("Name of company is CISCO ");
    }
}
class Manager extends Company
{
    void manager()
    {
        System.out.println("Good boss is better than good company");
    }
}

class Child extends Manager{
    void employee()
    {
        System.out.println("I'm employee of the CISCO");
    }
    public static void main(String args[])
    {
        Child c=new Child();
        c.name();
        c.manager();
        c.employee();
    } 
}