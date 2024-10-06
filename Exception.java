//Example of exception handling 
// public class Exception {
//     public static void main(String[] args) {
//         try{
//             int a = 100/0;  // ArithmeticException
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(e);  // printing the arithmetic exception 
//         }
//         System.out.println("Runs the rest of code"); //Printing the rest of code out of the exception.
//     }
//}

//Handle exception using the parent class exception

class Exception{
    public static void main(String[] args) {
        try{
            int i=20/0;
            System.out.println("Run code");
        }
        catch(ArithmeticException e)
        {
            System.out.println("can't divide by 0 ");
        }
      
    }
}
