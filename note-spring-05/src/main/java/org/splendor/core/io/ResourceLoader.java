package org.splendor.core.io;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:59
 * @description
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
