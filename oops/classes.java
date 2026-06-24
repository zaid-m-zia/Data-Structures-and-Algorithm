class test{
    static void test(){
        System.out.println("this is a test function inside the test class");
    }
}

public class classes {
    public static void main(String[] args) {
        System.out.println("this is the main function inside the main class");
        test.test();
    }
}
