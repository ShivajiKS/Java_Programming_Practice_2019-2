class P17Le502{
    public static void main(String[] args) {
        int x[]={11,22,33};
        int r1=0,r2=0;
        try{
            r1=x[5];
            r2=x[2]/0;
        }
        catch(ArithmeticException e1){
            System.out.println("Division By Zero is not Possible..");
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Array index not correct..");
        }
        catch(Exception e3){
            System.out.println("Error Occured..");
        }
        finally{
            System.out.println("End..");
        }
        System.out.println("R1 = "+r1);
        System.out.println("R2 = "+r2);
    }
}
