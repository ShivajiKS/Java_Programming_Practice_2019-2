class tkfvariable{
    int number=675;
    void method(){
        int number =1000;
        System.out.println(this.number);
        System.out.println(number);
    }
    public static void main(String[] args) {
      tkfvariable obj =new tkfvariable();
      obj.method();
/*
C:\Users\shivaji\Desktop\java\this keyword>javac tkfvariable.java

C:\Users\shivaji\Desktop\java\this keyword>java tkfvariable
675

*/

  }
}
