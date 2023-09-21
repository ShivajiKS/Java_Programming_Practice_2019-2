class string2{
    public static void main(String[] args) {
        String s1 = new String("SHIVAJI");
        String s2 = new String("SHIVAJI");
        String s3 ="SHIVAJI";
        String s4 ="SHIVAJI";  // s4 and s3 variables are stored in scp
        System.out.println(s1==s2);  //  both objects are different then is false
        System.out.println(s3==s4)   // true
        /*
    heap                             scp(string constant pull)
 shivaji ----pointing to s1           SHIVAJI   -----------   copy created for future purpose..... it is handled by the  jvm
                                            ^
                                            \
 shivaji ----pointing to s2            s1 and s2 are same THEN S2 IS POINTING

 total 2 objects in heap                s2, s3,s4,   are pointing to first copy (shivaji)


   output------
   false
    true
[Finished in 1.185s]

        */
    }
}
aa
