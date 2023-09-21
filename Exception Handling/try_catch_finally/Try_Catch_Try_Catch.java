class Try_Catch_Try_Catch{
   public static void main(String[] args) {
       int[] arra1= {10,78,64,98,0};
       try{
           System.out.println(10/0);
       }
       catch(ArithmeticException e1){
           System.out.println("division by zero not possible ..... ");
       }
       try{
           System.out.println(arra1[10]);
       }
       catch(ArrayIndexOutOfBoundsException e2){
           System.out.println("ARRAY INDEX BOUNDS EXCEPTION .... ");
       }

   }
}
