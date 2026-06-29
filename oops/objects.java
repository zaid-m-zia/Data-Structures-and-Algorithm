class test{
     void test1(){
        System.out.println("sike!! thats the wrong number!");
    }
    static void testingkatester(){
        objects.testing();
    }

}

public class objects {
    static void testing(){
        System.out.println("hello guys mera nam zaid hai");
    }
    public static void main(String[] args) {
        System.out.println("hello world");

        test obj = new test();
        obj.test1();
        test.testingkatester();
        objects.testing();

    }
}
