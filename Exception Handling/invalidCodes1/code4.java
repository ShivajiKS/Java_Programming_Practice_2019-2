class code4{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        System.out.println("stsatement 1");  // it is a independent statement
        catch(Exception e){
            System.out.println("EXCEPTION");
        }
    }
}
/* ode4.java:3: error: 'try' without 'catch', 'finally' or resource declarations
       try{
       ^
ode4.java:7: error: 'catch' without 'try'
       catch(Exception e){
       ^
 errors*/
