package org.example.formatter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.example.core.EntryField;
import org.yaml.snakeyaml.Yaml;

import java.util.List;

public class ConverterYAML implements FormatConverter{

    @Override
    public String formater(List<EntryField> fields) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(fields);
        } catch (Exception e) {
            return "Erro ao converter para XML: " + e.getMessage();
        }
    }
}