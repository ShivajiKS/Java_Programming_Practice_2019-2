class code1{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
    }
}
/* output ----
code1.java:3: error: 'try' without 'catch', 'finally' or resource declarations
        try{
        ^
1 error
*/
