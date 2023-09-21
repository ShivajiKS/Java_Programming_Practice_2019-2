class P7Le502{
    public static void main(String[] args) {
    String str="ShiVaji";
    String s=new String("shivaji");
    System.out.println("str ="+str);
    System.out.println(str==s);
    System.out.println("length is = "+str.length());
    System.out.println("toLowerCase letters = "+str.toLowerCase());
    System.out.println("toUppercase letters = "+str.toUpperCase());
    System.out.println("substring = "+str.substring(4));
    System.out.println("substring(Slicing) ="+str.substring(0,5));
    System.out.print("S index is ="+str.indexOf("S"));
    System.out.println(" and j index is = "+str.indexOf("j"));
    System.out.println("Char at ="+str.charAt(5));
    System.out.println("is Empty = "+str.isEmpty());
    String str1=str.replace("S","A");
    System.out.println("Replace = "+str1);
    String s1="Shivaji"; String s2="shivaji"; String s3="mallesh";
    System.out.println("Equals method ="+s1.equals(s2));
    System.out.println("compareTo method ="+s1.compareTo(s2));
    System.out.println("compareTo method ="+s2.compareTo(s3));
    System.out.println("equalsIgnoreCase method ="+s1.equalsIgnoreCase(s2));//return true
    System.out.println("equalsIgnoreCase method ="+s2.equalsIgnoreCase(s3));//return false
    String str2="    Shivaji   ";
    System.out.println("before Trim method = "+str2+"\nAFTER trim method ="+str2.trim());


    }
}
