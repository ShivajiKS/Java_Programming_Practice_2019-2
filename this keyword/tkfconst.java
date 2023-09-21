class tkfconst{
    int number;
    tkfconst(int number){
        this.number =number;
        System.out.println("local variable : " +number);  // it displays local variable
    }
    void method(){
        System.out.println("instance  variable : " +this.number);    // it displays instance  variable  is number = 187
    }
    public static void main(String[] args) {
        tkfconst obj =new tkfconst(187);
        obj.method();

    }
}
/* C:\Users\shivaji\Desktop\java\this keyword>javac tkfconst.java

C:\Users\shivaji\Desktop\java\this keyword>java tkfconst
local variable : 187
instance  variable : 187
*/
