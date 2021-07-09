public class MainClass{

    //通过implemnt实现接口来实现多态的代理

    //此处的static是因为入口函数是static必须使用static进行调用
    public static String invoke(Animal arg) {
        return arg.follow();
    }

    public static void main(String[] args) {
        CatClass cat = new CatClass();

        System.out.println(invoke(cat));//输出cat
    }
}