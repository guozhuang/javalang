public class SuperClass {
    public String abc;

    public SuperClass (String arg){
        //构造函数
        System.out.println("this is father");
        this.abc = arg;
    }
    public String test() {
        return this.abc;
    }
}