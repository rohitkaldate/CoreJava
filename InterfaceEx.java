// interface Table //Interface name
// {
//     void print();   //Method in interface

// }

// class InterfaceEx implements Table  //InterfaceEx is implements the interface name
// {
//     public void print() {
//        System.out.println("Hello Interface");
        
//     }
//     public static void main(String args [])
//     {
//         InterfaceEx i=new InterfaceEx();    //Object creation
//         i.print();  //Calling method
//     }
// }

//Que: Drawable interface have draw method which is implemented by Rectangle and the Circle(InterfaceEx):

// interface Drawable{
//     void draw();

// }
// class Rectangle implements Drawable //class Rectangle extracting the interface Drawable
// {
//     @Override
//     public void draw() {
//         System.out.println("Draw the rectangle");
//     }
// }

// class Circle implements Drawable    //Class Circle extracting interface
// {
//     public void draw()
//     {
//         System.out.println("Draw Circle");
//     }
// }
// public class InterfaceEx    //class containing main()
// {
//     public static void main(String[] args) {
//         Drawable d=new Circle();    //Creating obj of interface and calling method
//         d.draw();
//     }
// }


//Create the interface of bank which is explaining the interest rates of each bank using interface:

// interface Bank{
//     float interest();

// }

// class SBI implements Bank
// {
//     public float interest()
//     {
//         return 9.56f;
//     }
// }

// class Kotak implements Bank{
//     public float interest()
//     {
//         return 8.55f;
//     }
// }

// class InterfaceEx
// {
//     public static void main(String[] args) {
//         Bank b=new Kotak();
//         System.out.println("ROI oof Kotak is: "+b.interest());

//     }
// }


//Multiple inheritance in java using Interface:

interface printable
{
    void print();
}

interface showable
{
    void show();
}

class InterfaceEx implements printable,showable
{
    @Override
    public void print() {
        System.out.println("Printable");
    }
    @Override
    public void show() {
        System.out.println("Showable");
    }
    public static void main(String[] args) {
        InterfaceEx i=new InterfaceEx();
        i.print();
        i.show();
    }
}