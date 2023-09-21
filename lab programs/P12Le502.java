class overload{
    int sum(int num1, int num2){
        return num1+num2;
    }
    int sum(int num1, int num2,int num3){
        return num1+num2+num3;
    }
    double sum(double num1, int num2){
            return num1+num2;
     }
}
class P12Le502{
    public static void main(String[] args) {
        overload obj=new overload();
        int s=obj.sum(12,34);
        System.out.println("Sum of 12 and 34 is :"+s);
        s=obj.sum(15,22,45);
        System.out.println("Sum of 15,22 and 45 is :"+s);
        double s2=obj.sum(15.22,43);
        System.out.println("Sum of 15.22 and 43 is :"+s2);
    }
}
