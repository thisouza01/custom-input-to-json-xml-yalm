package org.example.formatter;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.core.EntryField;

import java.util.List;

public interface FormatConverter {

    String formater(List<EntryField> fields) throws JsonProcessingException;

}
