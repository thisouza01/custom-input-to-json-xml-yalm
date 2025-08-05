package org.example.core;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TypeConverse {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static Object parse(String value, String type) throws ParseException {
        return switch (type.toLowerCase()){
            case "text" -> value;
            case "date" -> LocalDate.parse(value, formatter);
            case "date/hour" -> LocalDateTime.parse(value);
            case "int" -> Integer.parseInt(value);
            case "float" -> Float.parseFloat(value);
            case "boolean" -> Boolean.parseBoolean(value);
            default -> throw new IllegalStateException("Unexpected value: " + type.toLowerCase());
        };
    }

}
