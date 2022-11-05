package org.splendor.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author splendor.s
 * @create 2022/10/18 下午8:43
 * @description
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public void addPropertyValue(PropertyValue propertyValue){
        this.propertyValueList.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues(){
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        return propertyValueList.stream().filter(p -> p.getName().equals(propertyName)).findFirst().get();
    }

}
