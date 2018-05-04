package org;

import org.junit.Test;

public class TestFactory {
    LoaderFactory loaderFactory = new LoaderFactory();
    @Test
    public void testWordTest() {
        //获取Word的对象，并调用它的 加载方法
        Loader loaderWord = loaderFactory.getLoader("Word");
        //调用WordLoader的加载方法
        loaderWord.loader();
    }

    @Test
    public void testJpgTest() {
        //获取Jpg的对象，并调用它的 加载方法
        Loader loaderJpg = loaderFactory.getLoader("Jpg");
        //调用WordLoader的加载方法
        loaderJpg.loader();
    }

}
