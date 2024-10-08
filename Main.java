//Encapsulation is achieved by making all the data members private

class Person{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age =age;
    }
}

//Driver class 
public class Main {

    public static void main(String args[])  //Main method
    {
        Person p=new Person();
        p.setName("Raj");
        p.setAge(24);

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
    
}
