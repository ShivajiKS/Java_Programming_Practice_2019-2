class P10Le502{
    P10Le502(){
        System.out.println("I am Default Constructor...");
    }
    P10Le502(int x)
    {
        System.out.println("I am parameterized Constructor...");
    }
    public static void main(String[] args) {
        P10Le502 obj=new P10Le502();
        P10Le502 obj2=new P10Le502(10);
    }
}
