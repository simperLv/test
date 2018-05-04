package org;
/**
 * �������ع��������ɻ��ڸ�����Ϣ��ʵ����Ķ���
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
