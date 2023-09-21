class Throws1{
    public static void main(String[] args) throws ArithmeticException {

        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Logout...");
        }
    }
}
