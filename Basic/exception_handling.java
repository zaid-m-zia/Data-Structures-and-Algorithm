public class exception_handling {
    public static void main(String[] args) {
        try{
            int a = 20;
            int b = 0;
            int c = a/b;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("this is a finally block");
        }
    }
    
}
