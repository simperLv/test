package javaBase;

public class S extends F{
    public S(){
        System.out.println("子类构造函数");
    }
    {
        System.out.println("子类非静态代码块");
    }
    static{
        System.out.println("子类静态代码块");
    }
}
