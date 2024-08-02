package org.springfamework.beans;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue){
        propertyValueList.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues(){
        return this.propertyValueList.toArray(new PropertyValue[0]);//传入0会更加list的大小创建一个新数组并填充
    }
    public PropertyValue getPropertyValue(String propertyName){
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue propertyValue = propertyValueList.get(i);
            if(propertyValue.getName().equals(propertyName)){
                return propertyValue;
            }
        }
        return null;
    }

}
