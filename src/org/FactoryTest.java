package org;

public class FactoryTest {
    LoaderFactory loaderFactory = new LoaderFactory();
    //��֤word���ط���
    public void WordTest(){
      //��ȡWord�Ķ��󣬲��������� ���ط���
        Loader loaderWord = loaderFactory.getLoader("Word");
        //����WordLoader�ļ��ط���
        loaderWord.loader();
    }
    //��֤JGP���ط���
    public void JpgTest(){
        //��ȡJpg�Ķ��󣬲��������� ���ط���
        Loader loaderJpg = loaderFactory.getLoader("Jpg");
        //����WordLoader�ļ��ط���
        loaderJpg.loader();
    }
}

