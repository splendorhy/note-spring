package org.splendor.util;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:58
 * @description
 */
public class ClassUtils {


    public static ClassLoader getDefaultClassLoader(){
        ClassLoader c1 = null;
        try {
            c1 = Thread.currentThread().getContextClassLoader();
        } catch (Exception e) {
            //Cannot access thread context ClassLoader - failing loader od system class loader ...
            e.printStackTrace();
        }
        if (c1 == null) {
            //No thread context class loader --> user class loader of this loader...
            c1 = ClassUtils.class.getClassLoader();
        }
        return c1;
    }

}
