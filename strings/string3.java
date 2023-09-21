class string3{
    public static void main(String[] args) {
        String s1=new String("SHIVAJI");
        s1.concat("kondeti");
        s1=s1.concat(" Y.V.P");
        System.out.println(s1);

        /*
            heap                           scp
           -----------------         -------------------
            SHIVAJI                         shivaji
            SHIVAJIkondeti                  kondeti
        s1----> shivajiyvp                   y.v.p

        output---
        SHIVAJI  Y.V.P
        */
    }
}
