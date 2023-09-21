class P14Le502{
    public static void main(String[] args) {
        Subchild sc=new Subchild();
        sc.m1();
        sc.m2();
        sc.m3();
    }
}
class ParentClass{
    void m1(){
        System.out.println("Parent Class method...");
    }
}
class Child extends ParentClass{
    void m2(){
        System.out.println("child Class method...");
    }
}
class Subchild extends Child{
    void m3(){
        System.out.println("Subchild Class method...");
    }
}
