interface INF1{
    int a =10;
    void display();
    static void display2(){
        System.out.println("Static method...");
    }
}
interface INF2{
    int b =20;
    void show();
    default void show2(){
        System.out.println("Default method...");
    }
}
class cls1{
    int c=25;
}
class cls2 extends cls1 implements INF1 , INF2{
    public void display(){
        System.out.println("interface 1 : "+a+" "+b+" "+c);
    }
    public void show(){
        System.out.println("interface 2 : "+a+" "+b+" "+c);
    }
}
class P16Le502{
    public static void main(String[] args) {
        cls2 obj = new cls2();
        INF1.display2(); obj.show2();
        obj.display(); obj.show();
    }
}
