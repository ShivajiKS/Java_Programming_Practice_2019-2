class fcode2{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("Division by zero is Not Possible...");
            System.out.println(e);
        }
        finally{
            System.out.println("finally Block..");

        }
    }
}
