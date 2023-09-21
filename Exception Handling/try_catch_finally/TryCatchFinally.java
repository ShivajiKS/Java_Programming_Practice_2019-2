class TryCatchFinally{
    public static void main(String[] args) {
        try{
             System.out.println(10/0);
        }
        catch(ArithmeticException e1){
            System.out.println(" / zero not possible ");

        }
        finally {
            System.out.println("finally will be executed ...");
        }
    }

}
