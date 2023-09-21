class nestedTry{
    public static void main(String[] args) {
        try{
            try{
                System.out.println(10/0);
            }
            catch(ArithmeticException E1){
                    System.out.println("division by zero not possible");
            }
            System.out.println("INSIDE TRY block STATEMETS");
            System.out.println(" STATEMET1");
            System.out.println(" STATEMETS2");
        }
        catch(NullPointerException e){
            System.out.println("null pointer exception....");
        }
    }
}
/* output ------
C:\Users\shivaji\Desktop\java\Exception Handling\try_catch_finally>java nestedTry
division by zero not possible
INSIDE TRY block STATEMETS
 STATEMET1
 STATEMETS2
 */
