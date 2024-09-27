//This is example of abstract class and abstract method


abstract class Bike{
    abstract void run();
}

class Abstraction extends Bike{
    @Override
    void run() {
        System.out.println("Running");
    }
    public static void main(String args[])
    {
        Bike b=new Abstraction();
        b.run();
    }
}
