package project.controller;


import project.dao.AbstructDao;
import project.view.View;

import java.util.Scanner;

public class Controller extends View {
    int tableChoice = 0;
    int crudChoice = 0;


    private Scanner scanner = new Scanner(System.in);

    public void startProgramm() {
        while (tableChoice != 8) {
            for (int i = 0; i < 100; i++)
                System.out.print("-");
            System.out.println(" ");
            System.out.println(" Show table");
            for (int i = 0; i < 100; i++)
                System.out.print("-");
            System.out.println(" ");
            System.out.println("1. Client");
            System.out.println("2. Company");
            System.out.println("3. Developer");
            System.out.println("4. Project");
            System.out.println("5. ProjectDeveloper");
            System.out.println("6. Specialty");
            System.out.println("7. SpecialtyDeveloper");
            System.out.println("8. Выход");
            tableChoice = scanner.nextInt();
            if (tableChoice > 0 && tableChoice < 8) {
                showTable(tableChoice);
                while (crudChoice != 4) {
                    for (int i = 0; i < 100; i++)
                        System.out.print("-");
                    System.out.println(" ");
                    System.out.println(" Change table");
                    for (int i = 0; i < 100; i++)
                        System.out.print("-");
                    System.out.println(" ");
                    System.out.println("1. Create");
                    System.out.println("2. Update");
                    System.out.println("3. Delete");
                    System.out.println("4. Go back to main menu");

                    crudChoice = scanner.nextInt();

                    if(crudChoice>0 && crudChoice<4){
                        while (!updateTable(tableChoice, crudChoice));
                    }
                }
                crudChoice = 0;
            }
        }
    }
}

