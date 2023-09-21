class Try_Finally{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        finally{
            System.out.println("finally block will be executed");
        }
    }
}
/** note--- finally block executed but runtime exception occured we will get where is catch block
OUTPUT ----
C:\Users\shivaji\Desktop\java\Exception Handling\try_catch_finally>java Try_Catch
finally block will be executed
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Try_Catch.main(Try_Catch.java:4)
        */
