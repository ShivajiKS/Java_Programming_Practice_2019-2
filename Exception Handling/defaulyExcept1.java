class defaulyExcept1{
    public static void main(String[] args) {
        method1();
    }
        public static void method1(){
            method2();
        }
        public static void method2(){
            method3();
        }
        public static void method3(){
            System.out.println(10/0);
        }
}
/* OUTPUT ------------
C:\Users\shivaji\Desktop\java\exceptionHandling>javac defaulyExcept1.java

C:\Users\shivaji\Desktop\java\exceptionHandling>java defaulyExcept1
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at defaulyExcept1.method3(defaulyExcept1.java:12)
        at defaulyExcept1.method2(defaulyExcept1.java:9)
        at defaulyExcept1.method1(defaulyExcept1.java:6)
        at defaulyExcept1.main(defaulyExcept1.java:3)
*/
