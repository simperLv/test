package javaBase;
/**
 * equals() 与 == 的区别
        对于基本类型，== 判断两个值是否相等，基本类型没有 equals() 方法。
        对于引用类型，== 判断两个实例是否引用同一个对象，而 equals() 判断引用的对象是否等价。
    true
    false
    true
    true
    true
    true
    false
 * @author Administrator
 *  
 */
public class AboutEquals {
    public static void main(String[] args) {
        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = new Integer(1);
        Integer int4 = new Integer(1);
        String str = new String("abc");
        System.out.println(int1.equals(int2));
        System.out.println(int1 == int2);
        //自反性
        System.out.println(int1.equals(int1));
        //对称性
        System.out.println(int1.equals(int1) == int1.equals(int1));
        //传递性
        if(int1.equals(int2) && int3.equals(int4)) {
            System.out.println(int1.equals(int4)); 
        }
        //一致性
        System.out.println(int1.equals(int2) == int1.equals(int2));
        //与 null 的比较,对任何不是 null 的对象 x 调用 x.equals(null) 结果都为 false
        System.out.println(str.equals(null));
        
    }
}
