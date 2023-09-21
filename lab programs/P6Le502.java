import java.util.Scanner;
class P6Le502{
    public static void main(String[] args) {
        int i,j,k;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows(m) and columns(n) of matrix A :");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter number of rows(p) and columns(q) of matrix b :");
        int p=sc.nextInt();
        int q=sc.nextInt();
        if(n!=p)
            System.out.println("Multiplication matrix is not Posssible...");
            else{
                int[][] a=new int[m][n];
                int[][] b=new int[p][q];
                int[][] c=new int[m][q];
                System.out.println("Enter Elements of matrxi A :");
                for(i=0;i<m;i++)
                    for(j=0;j<n;j++)
                        a[i][j]=sc.nextInt();
                System.out.println("Enter Elements of matrxi B :");
                for(i=0;i<p;i++)
                    for(j=0;j<q;j++)
                        b[i][j]=sc.nextInt();
                for (i=0;i<m;i++){
                    for (j=0;j<n;j++){
                        c[i][j]=0;
                        for (k=0;k<n;k++)
                            c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    }
                }
            System.out.println("Resultant Matrix is as Follows :");
             for(i=0;i<m;i++){
                for(j=0;j<q;j++)
                    System.out.print(c[i][j]+" ");
                System.out.println("");
                }
         }
    }
}
