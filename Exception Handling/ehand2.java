class ehand2{
    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.out.println(10/0);//exception raised
            System.out.println("statement-2"); //statement 2 not executed
        }
        catch(Exception e1){
            System.out.println("ERROR");
        }
        finally{
            System.out.println("finally block code will be executed");
        }
    }
}
