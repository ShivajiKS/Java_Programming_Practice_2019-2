
class cls1{
    int number1=10,number2=12;
     void method1(){
         System.out.println("number1 ="+number1 +" number2 = "+number2);
    }

}
class cls2 extends cls1{
    void method2(){
        System.out.println("the addition of two number is = "+(number1+number2));
    }
}
class cls3 extends cls1{
    void method3(){
        System.out.println("the SUBTRACTION of two number is = "+(number1-number2));
    }
}
class high{
    public static void main(String[] args) {
    cls2 obj1=new cls2();
    cls3 obj2=new cls3();
    obj1.method1();
    obj1.method2();
    obj2.method3();
    }
}
