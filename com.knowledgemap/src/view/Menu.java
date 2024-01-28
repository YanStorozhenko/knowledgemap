package view;

import knowledgemap.Application;

public class Menu {
    public Menu() {
    }

    public static void run() {

        while (true) {
            if (Application.currentUser.equals("")){
                ConsoleUI.menuBorder("1 Авторизація");
            }
            else {
                ConsoleUI.menuBorder("1 Вийти із системи");
                ConsoleUI.menuBorder("2 Переглянути свої дані");
                ConsoleUI.menuBorder("3 Поповнити карту");
                ConsoleUI.menuBorder("4 Зняти з карти");
                ConsoleUI.menuBorder("5 Придбати товар");

            }
            ConsoleUI.menuBorder("0 для виходу");

            int choice = ConsoleUI.userInputInt("Ваш вибір"); // вибір користувача

            switch (choice) {
                case 1:
                    if (Application.currentUser.equals("")) {
                        // авторизація
                        //AuthorizationService.authorization();
                    }
                    else {
                        //вихід з системи
                        Application.currentUser = "";
                    }
                    break;
                case 2:
                    //вивід персональних даних
                    if (!Application.currentUser.equals("")) {
                        //ConsoleUI.textInTopBottomBorder(PersonController.personalData(Application.currentUser), 50);
                    }
                    break;
                case 3:
                    //поповнити карту
                    if (!Application.currentUser.equals("")) {
                       // CardOperationService.deposit(Application.currentUser);
                    }
                    break;

                case 4:
                    //зняти з карти
                    if (!Application.currentUser.equals("")) {
                       // CardOperationService.withdraw(Application.currentUser);
                    }
                    break;

                case 5:
                    //Придбати товар
                    if (!Application.currentUser.equals("")) {
                       // GoodsStoreService.viewGoods();
                       // GoodsStoreService.purchaseGoods(Application.currentUser);
                    }
                    break;


                case 0:
                    // Вихід

                    ConsoleUI.printMessage("Дякую, що скористалися нашою програмою.");
                    System.exit(0);
                    break;
                default:
                    ConsoleUI.printMessage("Невірний вибір. Спробуйте ще раз.");
                    break;
            }

            if (choice == 0) {break;}
        }

    }
}
