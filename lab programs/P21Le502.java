class thread1 implements Runnable{
     synchronized public void run(){
         try{
             while(true){
                 Thread.sleep(1000);
                 System.out.println("good morning");
             }
         }
         catch(Exception e){ }
    }
}
class thread2 implements Runnable{
      synchronized public void run(){
          try{
              while(true){
                  Thread.sleep(2000);
                  System.out.println("hello");
              }
          }
          catch(Exception e){ }
      }
}
class thread3 implements Runnable{
     synchronized public void run(){
         try{
             while(true){
                 Thread.sleep(3000);
                 System.out.println("welcome");
             }
         }
         catch(Exception e){ }
     }
}
class P21Le502{
    public static void main(String args[]){
        thread1 obj1=new thread1();
        Thread t1 =new Thread(obj1);
        thread2 obj2=new thread2();
        Thread t2 =new Thread(obj2);
        thread3 obj3=new thread3();
        Thread t3 =new Thread(obj3);
        t1.start();
        t2.start();
        t3.start();
    }
}
