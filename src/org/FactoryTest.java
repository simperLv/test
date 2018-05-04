package org;

public class FactoryTest {
    LoaderFactory loaderFactory = new LoaderFactory();
    //验证word加载方法
    public void WordTest(){
      //获取Word的对象，并调用它的 加载方法
        Loader loaderWord = loaderFactory.getLoader("Word");
        //调用WordLoader的加载方法
        loaderWord.loader();
    }
    //验证JGP加载方法
    public void JpgTest(){
        //获取Jpg的对象，并调用它的 加载方法
        Loader loaderJpg = loaderFactory.getLoader("Jpg");
        //调用WordLoader的加载方法
        loaderJpg.loader();
    }
}

