package org.example;

public class EntryField {

    private String fieldName;
    private String fieldValue;
    private Object fieldType;

    public EntryField (){

    }

    public EntryField(String fieldName, String fieldValue, Object fieldType) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Object getFieldType() {
        return fieldType;
    }

    public void setFieldType(Object fieldType) {
        this.fieldType = fieldType;
    }

    @Override
    public String toString() {
        return "EntryField{" +
                "fieldName='" + fieldName + '\'' +
                ", fieldValue='" + fieldValue + '\'' +
                ", fieldType=" + fieldType +
                '}';
    }
}
