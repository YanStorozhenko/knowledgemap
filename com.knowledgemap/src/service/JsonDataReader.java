package service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonDataReader {
    public JsonDataReader() {
    }


    public static <T> T modelDataJsonReader(String pathToJson, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.readValue(new File(pathToJson), clazz);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}