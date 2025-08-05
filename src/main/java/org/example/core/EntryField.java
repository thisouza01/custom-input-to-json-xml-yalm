package org.example.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EntryField {

    private String fieldName;
    private Object fieldValue;
    private String fieldType;

    public EntryField (){

    }

    public EntryField(String fieldName, Object fieldValue, String fieldType) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    @Override
    public String toString() {
        String formatedValue;
        if (fieldValue instanceof LocalDate date){
            formatedValue = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } else if (fieldValue instanceof LocalDateTime dateTime){
            formatedValue = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        } else {
            formatedValue = fieldValue.toString();
        }
        return String.format("EntryField{fieldName='%s', fieldValue='%s', fieldType=%s}",
                fieldName, formatedValue, fieldType);
    }
}
