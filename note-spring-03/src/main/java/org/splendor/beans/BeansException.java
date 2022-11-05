package org.splendor.beans;

/**
 * @author splendor.s
 * @create 2022/10/17 下午4:15
 * @description
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg,cause);
    }

}
