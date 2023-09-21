class threadinterface{
    public static void main(String[] args) {
         t1 obj1=new t1();
        // obj1.start();
        t2 obj2=new t2();
        obj2.start();
    }
}
class t1 implements Runnable{
    public void run(){
        System.out.println("-----------THREAD CREATION USING RUNNABLE INTERFACE ---------");
        for (int i =5;i>0; i--){
            System.out.println(i);
        }
    }
}
class t2 extends Thread{
    public void run(){
        System.out.println("-----------THREAD CREATION USING RUNNABLE INTERFACE ---------");
        for (int i =10;i<=15; i++){
            System.out.println(i);
        }
    }
}
