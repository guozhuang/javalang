public class SonClass extends SuperClass {

    //构造函数前不能加void
    public SonClass(String arg) {
        super(arg);
    }
    public String test(){
        //this.abc继承自superClass类，并且当前test进行了方法重写
        return "hi," + this.abc + "!";
    }
}