class P11Le502{
    int width,length;
    P11Le502(){
        System.out.println("No arguments constructor ...");
    }
    P11Le502(int width, int length){
        this.width=width;
        this.length=length;
    }
    P11Le502(int x){
        width=length=x;
    }
    int getArea(){
        return width*length;
    }
    public static void main(String[] args) {
        P11Le502 obj1=new P11Le502();
        P11Le502 obj2=new P11Le502(10,20);
        int area =obj2.getArea();
        System.out.println("Area of Rectangle with width 10 and length 20 is :"+area);
        P11Le502 obj3=new P11Le502(10);
        area =obj3.getArea();
        System.out.println("Area of Rectangle with width 10 and length 10 is :"+area);
    }
}
