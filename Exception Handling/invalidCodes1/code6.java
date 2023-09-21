class code6{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        System.out.println("statement 1");  // it is a independent statement
        catch(Exception e){
            System.out.println("EXCEPTION");
        }
        System.out.println("statement 1");  // it is a independent statement
        finally{
            System.out.println("finally block");
        }
    }
}
/*code6.java:3: error: 'try' without 'catch', 'finally' or resource declarations
        try{
        ^
code6.java:7: error: 'catch' without 'try'
        catch(Exception e){
        ^
code6.java:11: error: 'finally' without 'try'
        finally{
        ^
3 errors*/
