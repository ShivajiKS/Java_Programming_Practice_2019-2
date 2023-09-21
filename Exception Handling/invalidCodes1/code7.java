class code7{
    public static void main(String[] args) {
        try
            System.out.println(10/0);
       catch(Exception e) {
            System.out.println("exception");
        }
    }
}/* code7.java:3: error: '{' expected
        try
           ^
code7.java:5: error: 'catch' without 'try'
       catch(Exception e) {
       ^
code7.java:3: error: 'try' without 'catch', 'finally' or resource declarations
        try
        ^
code7.java:9: error: reached end of file while parsing
}
 ^
4 errors*/
