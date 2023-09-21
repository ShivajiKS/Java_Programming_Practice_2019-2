class defaulyExcept2{
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        method2();
    }
    public static void method2(){
        method3();
        System.out.println(10/0);
    }
    public static void method3(){
        System.out.println("Method 3..........");
    }
}
/*
C:\Users\shivaji\Desktop\java\exceptionHandling>javac defaulyExcept2.java

C:\Users\shivaji\Desktop\java\exceptionHandling>java defaulyExcept2
Method 3..........
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at defaulyExcept2.method2(defaulyExcept2.java:10)
        at defaulyExcept2.method1(defaulyExcept2.java:6)
        at defaulyExcept2.main(defaulyExcept2.java:3)
*/
