class nestedTry2{
    public static void main(String[] args) {
        try{
            try{
                System.out.println(10/0);
            }
            catch(NullPointerException e){
                System.out.println("null pointer exception....");
            }
            finally{
                System.out.println("inside finally block ");
            }
            System.out.println("INSIDE TRY block STATEMETS");
            System.out.println(" STATEMET1");
            System.out.println(" STATEMETS2");
        }
        catch(ArithmeticException E1){
                System.out.println("division by zero not possible");
        }
        finally{
            System.out.println("outside finally block  ");
        }
    }
}
/* output ------
C:\Users\shivaji\Desktop\java\Exception Handling\try_catch_finally>java nestedTry2
inside finally block
division by zero not possible
outside finally block
 */
