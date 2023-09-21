class string4{
    public static void main(String[] args) {
        String s1 = new String("spring");
        s1.concat("fall");
        String s2 =s1.concat("winter");
        s2.concat("summer");
        System.out.println(s1);
        System.out.println(s2);
        /*
            heap                                scp
    -----------------------------------------------------------
            spring                              spring
            springfail                          fail
            springwinter                        winter
            springwintersummer                  summer
OUTPUT-----
    spring
   springwinter
        */
    }
}
