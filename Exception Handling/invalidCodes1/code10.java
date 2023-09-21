class code10{
    public static void main(String[] args) {
        try
            System.out.println(10/0);
       catch(Exception e)
           System.out.println("exception");
       finally
           System.out.println("error");

    }
}/* code10.java:3: error: '{' expected
        try
           ^
code10.java:5: error: '{' expected
       catch(Exception e)
                         ^
code10.java:7: error: 'finally' without 'try'
       finally
       ^
code10.java:5: error: 'catch' without 'try'
       catch(Exception e)
       ^
code10.java:3: error: 'try' without 'catch', 'finally' or resource declarations
        try
        ^
code10.java:11: error: reached end of file while parsing
}/* code9.java:10: error: '{' expected
 ^
6 errors
*/
