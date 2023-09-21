class cls1{
    int number1=1000;
    void method1(){
        System.out.println("number 1 ="+number1);
    }
}
class cls2 extends cls1{
    int number2=100;
    void method2(){
        System.out.println("number 2 ="+number2);
    }
}
class cls3 extends cls2{
    int number3=10;
    void method3(){
        System.out.println("number 3 ="+number3);
    }
}

class cls4 extends cls3{
    int number4=1;
    void method4(){
        System.out.println("number 4 ="+number4);
    }
}
class multilevel{
    public static void main(String[] args) {
        cls4 obj1=new cls4();
        obj1.method1();
        obj1.method2();
        obj1.method3();
        obj1.method4();
    }
}
