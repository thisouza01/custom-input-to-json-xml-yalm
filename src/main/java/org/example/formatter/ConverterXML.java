package org.example.formatter;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.core.EntryField;

import java.util.List;

public class ConverterXML implements FormatConverter{

    @Override
    public String formater(List<EntryField> fields) {
        XmlMapper xmlMapper = new XmlMapper();

        try {
            return xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(fields);
        } catch (Exception e) {
            return "Erro ao converter para XML: " + e.getMessage();
        }
    }
}