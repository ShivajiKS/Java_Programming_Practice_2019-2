import java.io.BufferedReader;
import java.io.InputStreamReader;

class resouce1{
    public static void main(String[] args) {
        int number=0;
        System.out.println("Enter a Number : ");
        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))){
             number=Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(number);
    }
}
