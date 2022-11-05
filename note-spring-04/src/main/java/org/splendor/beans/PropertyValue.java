package org.splendor.beans;

/**
 * @author splendor.s
 * @create 2022/10/18 下午8:43
 * @description bean 属性信息
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
