package knowledgemap;


import model.User;
import view.ConsoleUI;
import view.Menu;
import model.*;
import service.InitConfig;

import java.io.IOException;
import java.util.List;


public class Application {
    //глобальні змінні
    public static String USER_JSON_FILEPATH;
    public static String ROLE_JSON_FILEPATH;
    public static List<User> users;
    public static List<Role> roles;



    //поточний юзер
    public static String currentUser = "";


    private static void run() {
        Menu.run();
    }

    public static void main(String[] args) {

        ConsoleUI.printMessage("Карта знань");
        InitConfig.SetPath();
        try {
            InitConfig.ReadJsonData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(users.get(0).getLogin());
       // System.out.println(roles.get(0).getTitle());

        run();
    }

}