class code5{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("EXCEPTION");
        }
        System.out.println("statement 1");  // it is a independent statement
        finally{
            System.out.println("finally block");
        }
    }
}
/* code5.java:10: error: 'finally' without 'try'
        finally{
        ^
1 error*/
