class thread2{
    public static void main(String[] args) {
        t1 obj1=new t1();
        obj1.start();
        t2 obj2=new t2();
        obj2.start();
        t3 obj3=new t3();
        obj3.start();

        }
}
class t1 extends Thread{
    public void run(){
        System.out.println("...........THREAD T1 IS STARTED........");
        for(int i=1; i<=5;i++){
            System.out.println("THREAD T1 IS EXECUTED"+ " "+i +" TIME");
        }
        System.out.println("\t\t\t\tTHREAD T1 IS STOPPED........");
    }
}

class t2 extends Thread{
    public void run(){
        System.out.println("...........THREAD T2 IS STARTED........");
        for(int i=1; i<=5;i++){
            System.out.println("THREAD T2 IS EXECUTED"+ " "+i +" TIME");
        }
        System.out.println("\t\t\t\tTHREAD T2 IS STOPPED........");
    }
}

class t3 extends Thread{
    public void run(){
        System.out.println("...........THREAD T3 IS STARTED........");
        for(int i=1; i<=5;i++){
            System.out.println("THREAD T3 IS EXECUTED"+ " "+i +" TIME");
        }
        System.out.println("\t\t\t\tTHREAD T3 IS STOPPED........");
    }
}
/*
C:\Users\shivaji\Desktop\java\threads>java thread2
...........THREAD T1 IS STARTED........
THREAD T1 IS EXECUTED 1 TIME
...........THREAD T2 IS STARTED........
THREAD T1 IS EXECUTED 2 TIME
...........THREAD T3 IS STARTED........
THREAD T2 IS EXECUTED 1 TIME
THREAD T3 IS EXECUTED 1 TIME
THREAD T1 IS EXECUTED 3 TIME
THREAD T3 IS EXECUTED 2 TIME
THREAD T2 IS EXECUTED 2 TIME
THREAD T3 IS EXECUTED 3 TIME
THREAD T1 IS EXECUTED 4 TIME
THREAD T3 IS EXECUTED 4 TIME
THREAD T3 IS EXECUTED 5 TIME
THREAD T2 IS EXECUTED 3 TIME
                                THREAD T3 IS STOPPED........
THREAD T1 IS EXECUTED 5 TIME
THREAD T2 IS EXECUTED 4 TIME
                                THREAD T1 IS STOPPED........
THREAD T2 IS EXECUTED 5 TIME
                                THREAD T2 IS STOPPED........

C:\Users\shivaji\Desktop\java\threads>java thread2
...........THREAD T1 IS STARTED........
THREAD T1 IS EXECUTED 1 TIME
...........THREAD T2 IS STARTED........
THREAD T1 IS EXECUTED 2 TIME
THREAD T2 IS EXECUTED 1 TIME
THREAD T1 IS EXECUTED 3 TIME
THREAD T2 IS EXECUTED 2 TIME
...........THREAD T3 IS STARTED........
THREAD T1 IS EXECUTED 4 TIME
THREAD T3 IS EXECUTED 1 TIME
THREAD T2 IS EXECUTED 3 TIME
THREAD T3 IS EXECUTED 2 TIME
THREAD T1 IS EXECUTED 5 TIME
THREAD T3 IS EXECUTED 3 TIME
THREAD T2 IS EXECUTED 4 TIME
THREAD T3 IS EXECUTED 4 TIME
                                THREAD T1 IS STOPPED........
THREAD T3 IS EXECUTED 5 TIME
THREAD T2 IS EXECUTED 5 TIME
                                THREAD T3 IS STOPPED........
                                THREAD T2 IS STOPPED........

C:\Users\shivaji\Desktop\java\threads>java thread2
...........THREAD T1 IS STARTED........
THREAD T1 IS EXECUTED 1 TIME
THREAD T1 IS EXECUTED 2 TIME
...........THREAD T2 IS STARTED........
THREAD T1 IS EXECUTED 3 TIME
THREAD T2 IS EXECUTED 1 TIME
THREAD T1 IS EXECUTED 4 TIME
THREAD T2 IS EXECUTED 2 TIME
...........THREAD T3 IS STARTED........
THREAD T1 IS EXECUTED 5 TIME
THREAD T3 IS EXECUTED 1 TIME
THREAD T2 IS EXECUTED 3 TIME
THREAD T3 IS EXECUTED 2 TIME
                                THREAD T1 IS STOPPED........
THREAD T3 IS EXECUTED 3 TIME
THREAD T2 IS EXECUTED 4 TIME
THREAD T3 IS EXECUTED 4 TIME
THREAD T2 IS EXECUTED 5 TIME
THREAD T3 IS EXECUTED 5 TIME
                                THREAD T2 IS STOPPED........
                                THREAD T3 IS STOPPED........
                                */
