class code11{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("DIVISION BY ZERO ERROR");
        }
        catch(ArithmeticException e1){
            System.out.println("DIVISION BY ZERO ERROR");
        }
    }
}
/*code11.java:9: error: exception ArithmeticException has already been caught
        catch(ArithmeticException e1){
        ^
1 error*/
