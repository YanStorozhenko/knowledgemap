package service;

import com.fasterxml.jackson.core.type.TypeReference;
import knowledgemap.Application;
import model.Role;
import model.User;
import service.JsonDataReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public  class InitConfig {
    public InitConfig() {
    }

    public static void SetPath() {
        //шляхи до джсон файлів
        Application.USER_JSON_FILEPATH = "src\\repository\\userData.json";
        Application.ROLE_JSON_FILEPATH = "src\\repository\\roleData.json";
    }

    public static void ReadJsonData() throws IOException {
        System.out.println(new String(Files.readAllBytes(Paths.get(Application.USER_JSON_FILEPATH))));
       User[] usr =  JsonDataReader.modelDataJsonReader(Application.USER_JSON_FILEPATH, User[].class);

       Application.users = Arrays.asList(usr);

      ///  Application.roles = List.of(JsonDataReader.modelDataJsonReader(Application.ROLE_JSON_FILEPATH, Role[].class));
    }
}
