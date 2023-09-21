
class cls1{
    int a=100;
    void Method1(){
        System.out.println("a = "+a);
    }
}
class cls2 extends cls1{
    int b=1000;
    void Method2(){
        System.out.println("b = "+b);
    }
}
class single{
    public static void main(String[] args) {
        cls2 obj1=new cls2();
        obj1.Method1();
        obj1.Method2();
    }
}
