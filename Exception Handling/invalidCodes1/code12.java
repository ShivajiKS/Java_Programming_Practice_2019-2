class code12{
    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }
        finally{
            System.out.println("FINALLY BLOCK");
        }
        catch(Exception e){
            System.out.println("division by zero not possible");
        }
    }
}
/* code12.java:9: error: 'catch' without 'try'
        catch(Exception e){
        ^
1 error
*/
