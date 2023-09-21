final class demo{
  void method(){
        System.out.println(" HELLO I AM FROM PARENT CLASS METHOD");
    }
}


class overriding1 extends demo{
        void method(){
        System.out.println(" HELLO I AM FROM CHILD CLASS METHOD");
    }
    public static void main(String[] args) {
        /*demo d1 =new demo();
        d1.method();*/
        overriding1 obj = new overriding1();
        obj.method();     //it calls child classs mehod only because

    }
}
