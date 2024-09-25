//Reffer to class instance variable using this keyword

public class ThisEx {
    int id;
    String name;
    float fees;
    ThisEx(int id, String name, float fees)
    {
        this.id=id;
        this.name=name;
        this.fees=fees;
    }
    void dispaly()
    {
        System.out.println(id+" "+name+" "+fees);
    }

    public static void main (String args[])
    {
        ThisEx t=new ThisEx(1, "Rushi", 45761);
        ThisEx t1=new ThisEx(123,"Raj" ,58767);
        t.dispaly();
        t1.dispaly();
    }

}
