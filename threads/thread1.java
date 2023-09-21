class threadpro1 extends Thread{
public void run(){
    System.out.print(" for loop values .....");
    for(int i = 0; i<=3; i++){
                System.out.print(i +",");
             }
            System.out.println("\nthread is stopped .....");
        }
    }

class thread1{
    public static void main(String[] args) {
        threadpro1 obj1 =new threadpro1();
        obj1.start();

    }
}
