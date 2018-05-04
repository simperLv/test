package org;
/**
 * 创建加载工厂，生成基于给定信息的实体类的对象。
 * @author Administrator
 *
 */
public class LoaderFactory {
    public Loader getLoader(String fileType){
        if(fileType == null){
            return null;
        }
        if(fileType.equalsIgnoreCase("Word")){
            return new WordLoader();
        } else if(fileType.equalsIgnoreCase("Jpg")){
            return new JpgLoader();
        }
        return null;
    }
}
