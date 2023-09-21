class code8{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }

       catch(Exception e)
            System.out.println("exception");
    }
}/* code8.java:7: error: '{' expected
       catch(Exception e)
                         ^
code8.java:10: error: reached end of file while parsing
}/* code7.java:3: error: '{' expected
 ^
2 errors*/
