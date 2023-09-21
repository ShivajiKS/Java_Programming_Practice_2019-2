class parent{
     final void method(){
        System.out.println("final key for class ");
    }
}
class ffm extends parent{
    void method(){
        System.out.println("final key for class ");
    }
    public static void main(String[] args) {
    ffm obj = new ffm();
    obj.method();
    }
}
