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
        /*intern() ���������ַ�������Ĺ淶����ʾ��ʽ��
                        ����ѭ���¹��򣺶������������ַ��� s �� t�����ҽ��� s.equals(t) Ϊ true ʱ��s.intern() == t.intern() ��Ϊ true��
                        �﷨*/
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