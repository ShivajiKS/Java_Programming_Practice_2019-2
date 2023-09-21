class Throw1{
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("Arithmetic Exception");
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        finally{
            System.out.println("LOGOUT !.....");
        }
    }
}
