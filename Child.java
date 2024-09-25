//Single Level Inheritance: Child class extends the properties of parent class

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


//Multilevel Inheritance: new class going to extends previous class

// class Company
// {
//     void name()
//     {
//         System.out.println("Name of company is CISCO ");
//     }
// }
// class Manager extends Company
// {
//     void manager()
//     {
//         System.out.println("Good boss is better than good company");
//     }
// }

// class Child extends Manager{
//     void employee()
//     {
//         System.out.println("I'm employee of the CISCO");
//     }
//     public static void main(String args[])
//     {
//         Child c=new Child();
//         c.name();
//         c.manager();
//         c.employee();
//     } 
// }


// Hierarchical Inheritance: Two or more classes extends the same parent class

class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}

class Child extends Animal
{
    void cat()
    {
        System.out.println("Cat is meowing");
    }
    public static void main(String args[])
    {
        Child c=new Child();
        c.cat();
        c.eat();
    }
}