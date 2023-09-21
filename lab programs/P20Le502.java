class thread1 extends Thread{
     synchronized public void run(){
         try{
             while(true){
                 sleep(1000);
                 System.out.println("good morning");
             }
         }
         catch(Exception e){ }
    }
}
class thread2 extends Thread{
      synchronized public void run(){
          try{
              while(true){
                  sleep(2000);
                  System.out.println("hello");
              }
          }
          catch(Exception e){ }
      }
}
class thread3 extends Thread{
     synchronized public void run(){
         try{
             while(true){
                 sleep(3000);
                 System.out.println("welcome");
             }
         }
         catch(Exception e){ }
     }
}
class P20Le502{
    public static void main(String args[]){
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        thread3 t3=new thread3();
        t1.start();
        t2.start();
        t3.start();
    }
}
