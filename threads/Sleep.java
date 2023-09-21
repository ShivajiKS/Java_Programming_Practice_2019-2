import java.util.Scanner;
class Sleep extends Thread{
    public static void main(String[] args){
        Sleep obj1=new Sleep();
        obj1.start();
        System.out.println("THREAD NAME IS : "+obj1.getName());

    }
    public void run(){
        Scanner sc =new Scanner(System.in);
        System.out.println("WHICH MULTIPLICATION TABLE U WANT , PLEASE ENTER ONLY INTEGERS ONLY");
        int number=sc.nextInt();
        System.out.println(number+" TABLE IS  : ");
        int i=1;
        while(i<=10){
            try{
                sleep(1000);
            }
            catch(InterruptedException e1){

            }
            System.out.println(number +" x "+i +" = "+(number*i));
            i++;
        }
    }
}
