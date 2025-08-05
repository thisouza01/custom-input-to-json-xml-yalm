package org.example.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.core.EntryField;
import org.example.core.TypeConverse;
import org.example.formatter.ConverterJSON;
import org.example.formatter.ConverterXML;
import org.example.formatter.ConverterYAML;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException, JsonProcessingException {

        Scanner scanner = new Scanner(System.in);

        ArrayList<EntryField> entryFields = new ArrayList<>();

        while(true){
            System.out.println("Padrão: NOME_CAMPO;VALOR;TIPO");
            String entry = scanner.nextLine();

            String[] fields = entry.split(";");

            if (entry.equals(",")) break;

            if (fields.length < 3){
                System.out.println("Entrada de tamanho inválido!");
                continue;
            }

            Object convertedValue = TypeConverse.parse(fields[1], fields[2]);

            String fieldName = fields[0].trim();
            String fieldType = fields[2].trim();

            EntryField entryData = new EntryField();

            entryData.setFieldName(fieldName);
            entryData.setFieldValue(convertedValue);
            entryData.setFieldType(fieldType);

            entryFields.add(entryData);
        }

        ConverterJSON converterJSON = new ConverterJSON();
        System.out.println("JSON:");
        System.out.println(converterJSON.formater(entryFields));

        ConverterXML converterXML = new ConverterXML();
        System.out.println("XML:");
        System.out.println(converterXML.formater(entryFields));

        ConverterYAML converterYAML = new ConverterYAML();
        System.out.println("YAML:");
        System.out.println(converterYAML.formater(entryFields));
    }
}