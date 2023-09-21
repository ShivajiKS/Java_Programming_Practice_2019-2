class nestedTry3{
    public static void main(String[] args) {
        try{
            try{
                System.out.println(10/0);
            }
            catch(ArithmeticException E1){
                    System.out.println("division by zero not possible");
            }
            finally{
                System.out.println("inside finally block ");
            }
            System.out.println("inside try and outside nested try-catch-finally.. ");
        }
        catch(Exception e){
            System.out.println("ERROR SOMETHING GOES WRONG....");
        }
        finally{
            System.out.println("program finished");
        }
    }
}
/* OUTPUT---
C:\Users\shivaji\Desktop\java\Exception Handling\try_catch_finally>javac nestedTry3.java

C:\Users\shivaji\Desktop\java\Exception Handling\try_catch_finally>java nestedTry3
division by zero not possible
inside finally block
inside try and outside nested try-catch-finally..
program finished*/
