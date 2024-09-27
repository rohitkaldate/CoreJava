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

interface Drawable{
    void draw();

}
class Rectangle implements Drawable //class Rectangle extracting the interface Drawable
{
    @Override
    public void draw() {
        System.out.println("Draw the rectangle");
    }
}

class Circle implements Drawable    //Class Circle extracting interface
{
    public void draw()
    {
        System.out.println("Draw Circle");
    }
}
public class InterfaceEx    //class containing main()
{
    public static void main(String[] args) {
        Drawable d=new Circle();    //Creating obj of interface and calling method
        d.draw();
    }
}