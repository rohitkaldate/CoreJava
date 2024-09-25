//Super Keyword: Accessing parent class instance variable

// class Bird //parent class
// {
//     String color="Black"; //instance variable
// }

// class Pigeon extends Bird //child classextends parent class
// {
//     String color="White";

//     void colour()
//     {
//         System.out.println(color);
//         System.out.println(super.color); //it is accessing parent class instance variable
//     }

// }
// class SuperEx  //Main class which contains main() method.
// {
//     public static void main(String args[])
//     {
//         Pigeon p=new Pigeon(); //Object Creation
//         p.colour();
//     }
// }


//Super Keyword: Accessing parent class method using the super keyword

// class Dad //parent class
// {
//     void fear() //parent class method
//     {
//         System.out.println("Fear of dad");
//     }
// }

// class Beta extends Dad //child class
// {
//     void fear() //child class method extending parent class method
//     {
//         System.out.println("Beta is fearless");

//     }
//     void bark() //new method
//     {
//         System.out.println("Barking");
//     }
//     void work()//method used for calling method from parent class
//     {
//         bark();
//         super.fear();//calls parent class parent method
//     }
// }
// class SuperEx
// {
//     public static void main(String args[])
//     {
//         Beta b=new Beta(); //Object creation
//         b.work();

//     }
// }


//Super Keyword: Invoking parent class constructor

class Man   //Parent class
{
   Man() //parent class constructor
   {
    System.out.println("Man is Animal");
   }
}

class Woman extends Man //Child class
{
    Woman() //child class constructor
    {
        super();
        System.out.println("Woman is also animal");
    }
}

class SuperEx //class containing main() method
{
    public static void main(String args[])
    {
        Woman w =new Woman(); //Object creation
    
    }
}