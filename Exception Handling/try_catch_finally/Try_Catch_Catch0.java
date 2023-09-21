class Try_Catch_Catch{
    public static void main(String[] args) {
        int[] arra1={10,78,538,12,65};
        try{
        // System.out.println(10/0);
        System.out.println(arra1[9]);
        }
        catch(ArithmeticException e){
            System.out.println("division by zero is not possible ");
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("you spacified index position not there in arra1 array");
        }

    }
}
