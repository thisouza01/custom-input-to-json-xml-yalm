package org.example.formatter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.core.EntryField;

import java.util.List;

public class ConverterJSON implements FormatConverter{

    @Override
    public String formater(List<EntryField> fields) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(fields);
        } catch (Exception e) {
            return "Erro ao converter para JSON: " + e.getMessage();
        }
    }
}
