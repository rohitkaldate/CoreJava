//Example of exception handling 
public class Exception {
    public static void main(String[] args) {
        try{
            int a = 100/0;  // ArithmeticException
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);  // printing the arithmetic exception 
        }
        System.out.println("Runs the rest of code"); //Printing the rest of code out of the exception.
    }
}
