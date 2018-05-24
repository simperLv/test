package javaBase;
/**
 * false
false
true
good=====
gbc
 * @author Administrator
 *
 */
public class Test1 {
    String str = new String("good");
    char[] ch = new char[]{'a','b','c'};
    
    public void change(String str,char[] ch){
        str = new String("bood");
        ch[0] = 'g';
        /*intern() 方法返回字符串对象的规范化表示形式。
                        它遵循以下规则：对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。
                        语法*/
        System.out.println(this.str.intern() == str.intern());
        System.out.println(this.str == str);
        System.out.println(this.ch == ch);
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.change(t.str, t.ch);
        System.out.println(t.str + "=====");
        System.out.println(t.ch);
    }
}