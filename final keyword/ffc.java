class parent{
    void method(){
        System.out.println("final keyword for class");
    }
}
class ffc extends parent{

    public static void main(String[] args) {
        ffc obj = new ffc();
        obj.method();


    }
}
