package org;

import org.junit.Test;

public class TestFactory {
    LoaderFactory loaderFactory = new LoaderFactory();
    @Test
    public void testWordTest() {
        //��ȡWord�Ķ��󣬲��������� ���ط���
        Loader loaderWord = loaderFactory.getLoader("Word");
        //����WordLoader�ļ��ط���
        loaderWord.loader();
    }

    @Test
    public void testJpgTest() {
        //��ȡJpg�Ķ��󣬲��������� ���ط���
        Loader loaderJpg = loaderFactory.getLoader("Jpg");
        //����WordLoader�ļ��ط���
        loaderJpg.loader();
    }

}
