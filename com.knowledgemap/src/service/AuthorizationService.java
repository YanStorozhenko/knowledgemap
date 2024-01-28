package service;

import knowledgemap.Application;

import view.ConsoleUI;

public class   AuthorizationService {
    public AuthorizationService() {
    }

    public static void authorization () {
       String userName = ConsoleUI.userInputText("Логін:");
       String password = ConsoleUI.userInputText("Пароль:");

//      if (PersonController.authenticate(userName, password)) {
//          Application.currentUser = userName;
//          ConsoleUI.printMessage("Успішна аторизація " + userName);
//          ConsoleUI.textInTopBottomBorder(PersonController.personalData(Application.currentUser), 50);
//      }
//      else {
//          ConsoleUI.printOperationMessage("Ви не пройшли аутентифікацію");
//      }
    }
}
