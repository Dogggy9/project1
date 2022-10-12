public class Main {
    public static int a = 10;
    public int b = 11;
    public static void some(){
        int c = 12;
    }
    public void test(){
        int d = 13;
        {
            doSomething1();
            int e = 14;
            doSomething2();
            doSomething3();
        }
    }
}