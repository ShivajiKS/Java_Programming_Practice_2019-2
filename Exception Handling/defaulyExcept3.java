class defaulyExcept3{
    public static void main(String[] args) {
        method1();
        System.out.println(10/0);
    }
    public static void method1(){
        method2();
        System.out.println("Method 1..............");
    }
    public static void method2(){
        System.out.println("Method 2..............");
    }
}
/* OUTPUT-----
C:\Users\shivaji\Desktop\java\exceptionHandling>java defaulyExcept3
Method 2..............
Method 1..............
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at defaulyExcept3.main(defaulyExcept3.java:4)
*/
