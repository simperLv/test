package javaBase;
/**
 * equals() �� == ������
        ���ڻ������ͣ�== �ж�����ֵ�Ƿ���ȣ���������û�� equals() ������
        �����������ͣ�== �ж�����ʵ���Ƿ�����ͬһ�����󣬶� equals() �ж����õĶ����Ƿ�ȼۡ�
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
        //�Է���
        System.out.println(int1.equals(int1));
        //�Գ���
        System.out.println(int1.equals(int1) == int1.equals(int1));
        //������
        if(int1.equals(int2) && int3.equals(int4)) {
            System.out.println(int1.equals(int4)); 
        }
        //һ����
        System.out.println(int1.equals(int2) == int1.equals(int2));
        //�� null �ıȽ�,���κβ��� null �Ķ��� x ���� x.equals(null) �����Ϊ false
        System.out.println(str.equals(null));
        
    }
}
