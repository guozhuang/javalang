public class TestClass {
    public TestClass(String arg) {
        System.out.println(arg);
    }

    public void myObj(String arg) {
        System.out.println(arg);
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass("test");

        testClass.myObj("world");
    }
}