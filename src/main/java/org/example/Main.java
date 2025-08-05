package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var entryData = new EntryField();

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

            String fieldName = fields[0].trim();
            String fieldValue = fields[1].trim();
            String fieldType = fields[2].trim();

            entryData.setFieldName(fieldName);
            entryData.setFieldValue(fieldValue);
            entryData.setFieldType(fieldType);

            entryFields.add(entryData);
        }

        for (EntryField entries : entryFields){
            System.out.println(entries);
        }
    }
}