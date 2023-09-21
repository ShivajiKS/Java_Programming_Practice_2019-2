class Try_Catch{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e1){
            System.out.println("/ ZERO EXCEPTION WILL BE RAISED");
        }
    }
}
/* output-----
C:\Users\shivaji\Desktop\java\Exception Handling\try_catch_finally>java Try_Catch
/ ZERO EXCEPTION WILL BE RAISED*/
