class Try_Catch_Catch_Finally{
    public static void main(String[] args) {
        int[] arra1={10,78,538,12,65};
        try{
        System.out.println(10/0);
        System.out.println(arra1[9]);
        }
        catch(ArithmeticException e){
            System.out.println("division by zero is not possible ");
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("you spacified index position is not there in arra1 array");
        }
        finally {
            System.out.println("either one statement will executed because if exception raised in 1 statement then the jvm will check corresponding catch block and then execute catch.othrewise if first statement1 not raised any exception then second statement will be executed");
        }

    }
}/* output -----
C:\Users\shivaji\Desktop\java\Exception Handling\try_catch_finally>java Try_Catch_Catch_Finally
division by zero is not possible
either one statement will executed because if exception raised in 1 statement then the jvm will check
corresponding catch block and then execute catch.othrewise if first statement1 not raised any exceptio
n then second statement will be executed*/
