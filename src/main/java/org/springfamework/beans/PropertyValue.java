package org.springfamework.beans;

public class PropertyValue {
    /**
     * 属性名
     */
    private final String name;
    /**
     * 值
     */
    private final Object value;

    public PropertyValue(String name,Object value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }
    public Object getValue(){
        return value;
    }
}
