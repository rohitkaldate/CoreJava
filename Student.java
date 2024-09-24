class Student
{
    int id;
    String name;

    void insertInfo(int i,String n)
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
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        s1.insertInfo(1,"Rohit");
        s2.insertInfo(2, "Raj");
        s3.insertInfo(3, "Ravi");

        s1.dispaly();
        s2.dispaly();
        s3.dispaly();
    }
}