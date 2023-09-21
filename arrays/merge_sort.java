import java.util.Arrays;
class merge_sort{
    public static void main(String[] args) {
        int[] arra1={10,5,16,12,67,44};
        int[] arra2 ={4,55,32,63,25};
        int size1=arra1.length;
        int size2=arra2.length;
        int[] arra3 = new int[size1+size2];
// System.arraycopy(src,src_position,destination,destination_position,Length);
        System.arraycopy(arra1,0,arra3,0,size1);
        System.arraycopy(arra2,0,arra3,size1,size2);
        System.out.print("Array elements are : ");
        for(int i=0; i<arra3.length;i++){
            System.out.print(arra3[i]+" ");
        }
        Arrays.sort(arra3);
        System.out.print("\nsorted order is : ");
        System.out.println(Arrays.toString(arra3));
    }
}
/* output ----
C:\Users\shivaji\Desktop\java\arrays>javac merge_sort.java
C:\Users\shivaji\Desktop\java\arrays>java merge_sort
Array elements are : 10 5 16 12 67 44 4 55 32 63 25
sorted order is : [4, 5, 10, 12, 16, 25, 32, 44, 55, 63, 67]
*/
