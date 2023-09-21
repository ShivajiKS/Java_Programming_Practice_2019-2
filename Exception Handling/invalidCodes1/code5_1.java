class code5_1{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("EXCEPTION");
        }
        System.out.println("STATEMENT 1");
        catch(Exception e){
            System.out.println("EXCEPTION");
        }

    }
}
/*code5_1.java:10: error: 'catch' without 'try'
        catch(Exception e){
        ^
1 error*/
