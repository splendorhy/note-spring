package org.splendor.beans;

/**
 * @author splendor.s
 * @create 2022/10/17 上午11:07
 * @description 定义bean 异常
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
