class Parent
{
    void display(){
        System.out.println("I am Parent class method...");
    }
}
class Child extends Parent
{
    void display(){
        System.out.println("I am child class method...");
    }
}
class P19Le502{
    public static void main(String[] args)
    {
        Parent obj =new Child();
        obj.display();
    }
}
