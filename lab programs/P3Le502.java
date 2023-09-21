import java.util.Scanner;
 class P3Le502{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many bike Racers are there :");
        int n=sc.nextInt();
        Double array[]= new Double[n+1];
        Double sum=0.0,average=0.0;
        System.out.println("ENTER Speed of "+n+ " Bike Racers : ");
        for(int i=1;i<array.length; i++) {
            array[i]=sc.nextDouble();
            sum =sum+array[i];
        }
        average =sum/5;
        System.out.println("Average speed is : "+average);
        for (int i=1;i<array.length;i++) {
            if (array[i]>average){
                 System.out.print("RACER : "+i+" is Qualified");
                 System.out.println(" Speed is "+array[i]);
            }
         }
    }
}
