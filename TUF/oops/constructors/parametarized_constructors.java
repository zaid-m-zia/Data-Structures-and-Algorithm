

public class parametarized_constructors {
    int balance;
    parametarized_constructors(double _balance){
        balance=(int)_balance;
        System.out.println("your balance is : "+balance);

    }
    public static void main(String[] args) {
        parametarized_constructors obj = new parametarized_constructors(100.23);
        
    }
}
