package javaBase;
/**
 * ���������￼����Thread����start()��run()�����������ˡ�
 * start()��������һ���̣߳�������start������ϵͳ�ŻῪ��һ���µ��̣߳�
 * ��������run()������ִ�����񣬶������ĵ���run()�͸�������ͨ������һ���ģ�
 * �Ѿ�ʧȥ�̵߳������ˡ����������һ���̵߳�ʱ��һ��Ҫʹ��start()������run()��
 * @author Administrator
 *
 */
public class Test2 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }
    static void pong(){
        System.out.print("pong");
    }
}
