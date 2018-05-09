package javaBase;
/**
 * 类加载顺序：
 * 父类（静态变量、静态语句块）
        子类（静态变量、静态语句块）
        父类（实例变量、普通语句块）
        父类（构造函数）
        子类（实例变量、普通语句块）
        子类（构造函数）
 * @author Administrator
 *
 */
public class F {
    public F(){
        System.out.println("父类构造函数");
    }
    {
        System.out.println("父类非静态代码块");
    }
    static{
        System.out.println("父类静态代码块。");    
    }
    public static void main(String[] args) {
        new S();
        
    }
}
