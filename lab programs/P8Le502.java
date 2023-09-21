class P8Le502{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Shivaji");
        StringBuffer sb2=new StringBuffer("1234567890");
        StringBuffer sb3=new StringBuffer("10988");
        System.out.println("StringBuffer is = "+sb);
        System.out.println("sb3 length is = "+sb3.length());
        sb3.setLength(12);
        System.out.println("sb3 new length is = "+sb3.length());
        System.out.println("sb3 capacity is = "+sb3.capacity());
        sb3.ensureCapacity(100);
        System.out.println("sb3 new capacity is = "+sb3.capacity());
        System.out.println("charAt (index =4) = "+sb.charAt(4));
        sb.setCharAt(4,'A'); //raplace a char at based on index
        System.out.println("setCharAt = "+sb);
        sb.append("ondeti");
        System.out.println("After append = "+sb);
        sb.insert(7,"K");
        System.out.println("After insert = "+sb);
        System.out.println("substring ="+sb.substring(7));
        System.out.println("substring ="+sb.substring(0,8));
        System.out.println("sb3 ="+sb2.toString());
        sb2.deleteCharAt(0);
        System.out.println("after deleteCharAt ="+sb2);
        System.out.println("Reverse = "+sb2.reverse());
        sb2.replace(0,5,"04281");
        System.out.println("before replace= "+sb2+" and after replace = "+sb2);
        sb2.delete(0,10); //it delets all data because you specified index
        System.out.println("StringBuffer is empty because you deleted data ="+sb2);
    }
}
