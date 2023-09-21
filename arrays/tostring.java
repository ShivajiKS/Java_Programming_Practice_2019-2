import java.util.Arrays;
class tostring{
    public static void main(String[] args) {
        int arra[]={10,65,3,26,7,89};
        System.out.println(arra); // its displays object id 
        System.out.println("Array Elements Are : "+Arrays.toString(arra));//to.string Method
        Arrays.sort(arra);
        System.out.print("Sorted Order Is : ");
        for(int arr1:arra){
            System.out.print(arr1 +" ");
        }
    }
}
