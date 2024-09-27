// //This is example of abstract class and abstract method


// abstract class Bike{
//     abstract void run();
// }

// class Abstraction extends Bike{
//     @Override
//     void run() {
//         System.out.println("Running");
//     }
//     public static void main(String args[])
//     {Running
//         Bike b=new Abstraction();
//         b.run();
//     }
// }


//An abstract class has an both abstract and non abstract methods:


abstract class Bike  //Abstract class
{
    Bike()  //Constructor of class
    {
        System.out.println("Bike running");
    }

    abstract void run();    //Abstract Method

    void changeGear()   //Method 
    {
        System.out.println("Gear changed");
    }
}

class Abstraction extends Bike      //Child class extends parent one
{
    void run() 
    {
        System.out.println("Bike Stopped");
    }
    public static void main(String args[])
    {
        Bike b=new Abstraction();   //Object creation
        b.changeGear();
        b.run();
    }

}