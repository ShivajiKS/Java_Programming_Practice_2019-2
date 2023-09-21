class t1{
    public static void main(String[] args) {
        t2 obj1 =new t2();
        obj1.start();
    }
}
class t2 extends Thread{
    public void  run(){
        System.out.println("COUNT DOWN STARTS 30 TO 0 :: ");
        int i =30;
        while(i>=0){
            try{
                sleep(500);
            }
            catch(Exception e1){
                System.out.println("error");
            }

            System.out.print(i + "\t\t\t\t\t\t\t\t");
            i--;
        }
        System.out.println("\n BLAST OFF");
    }
}
/*
C:\Users\shivaji\Desktop\java\threads>java t1
COUNT DOWN STARTS 30 TO 0 ::
30                                                              29
                        28                                                              27
                                                26
        25                                                              24
                                23                                                              22
                                                        21
                20                                                              19
                                        18
17                                                              16
                        15                                                              14
                                                13
        12                                                              11
                                10                                                              9
                                                        8
                7                                                               6
                                        5
4                                                               3
                        2                                                               1
                                                0

 BLAST OFF
*/
