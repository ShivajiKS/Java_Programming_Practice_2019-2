class Rethrow{
    public static void main(String[] args) {
	       try{
	            System.out.println(10/0);
	          }
  	       catch(Exception e){
			throw new NullPointerException();
           }

    }
}
