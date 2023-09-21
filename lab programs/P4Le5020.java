import java.util.Scanner;
class P4Le502{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Numbers are there in the list :");
        int array_size= sc.nextInt();
        int[] arra= new int[array_size];
        System.out.println("Enter "+array_size +" Numbers : ");
        for(int i=0; i<array_size;i++)
                arra[i]=sc.nextInt();
        System.out.println("Given Numbers are as Follows : ");
        for(int i=0;i<array_size;i++)
                System.out.print(arra[i]+ " ");
        System.out.println("\n Enter Key Element to be Searched :");
        int key=sc.nextInt();
        int flag=0;
        int first=0,last=array_size-1,middle=(first+last)/2;
        while(first<=last){
            if(key==arra[middle]){
                flag=1;
                break;
            }
            if(key<arra[middle])
                    last=middle-1;
            if(key>arra[middle])
                last=middle+1;
                middle=(first+last)/2;
            }
             if(flag==1)
                System.out.println("Key Element "+key +" is founded in the array..");
            else
                System.out.println("Key Element "+key +" is not founded in the array..");
        }
    }
