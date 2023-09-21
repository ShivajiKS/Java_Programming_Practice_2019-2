class code8{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }

       catch(Exception e){
           System.out.println("exception");
       }
       finally
           System.out.println("error");

    }
}/* code9.java:10: error: '{' expected
       finally
              ^
code9.java:14: error: reached end of file while parsing
}/* code8.java:7: error: '{' expected
 ^
2 errors*/
