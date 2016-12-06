package project.view;

import project.dao.DeveloperDao;
import project.model.*;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public abstract class View {
    Scanner scanner = new Scanner(System.in);

    public void showString(String str) {
        System.out.println(str);
    }

    public void showMapList(Map<Integer,String> map) {
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> setHelpIter : set) {
            System.out.println(setHelpIter.getKey() + ". " + setHelpIter.getValue());
        }
    }

    public void printLine(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
            if(i == 99)
            {
                System.out.print("\n");
            }
        }
    }
    
    public void showTable(int choice) {
        if(choice==1) {
            try {
              //  abstructDao = new ClientDao();
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
               // System.out.println(abstructDao.getList());
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");

            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(choice==2) {
            try {
              //  abstructDao = new CompanyDao();
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
            //    System.out.println(abstructDao.getList());
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(choice==3) {
            try {
                DeveloperDao developerDao = new DeveloperDao();
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
                System.out.println(developerDao.listDevelopers());
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(choice==4) {
            try {
               // abstructDao = new ProjectDao();
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
              //  System.out.println(abstructDao.getList());
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(choice==5) {
            try {
             //   abstructDao = new ProjectDeveloperDao();
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
             //   System.out.println(abstructDao.getList());
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(choice==6) {
            try {
            //    abstructDao = new SpecialityDao();
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
             //   System.out.println(abstructDao.getList());
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(choice==7) {
            try {
             //   abstructDao = new SpecialityDeveloperDao();
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
             //   System.out.println(abstructDao.getList());
                for (int i = 0; i < 100; i++)
                    System.out.print("-");
                System.out.println(" ");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean updateTable(int keyTable , int keyOperation) {
        if(keyOperation == 1) {
            shouParams(keyTable);
            create(keyTable);
            return  true;
        }
        if(keyOperation == 2) {
            shouParams(keyTable);
            update(keyTable);
            return  true;
        }
        if(keyOperation == 3) {
            for (int i = 0; i < 100; i++)
                System.out.print("-");
            System.out.println("");
            showString("Write params : ");
            showString("id");
            delete(keyTable);
            return  true;
        }
        return  false;
    }

    private void create(int keyTable) {
        if(keyTable==1) {
         //   abstructDao = new ClientDao();
            int id = Integer.valueOf(scanner.nextLine());
            String name = scanner.nextLine();
        //    abstructDao.add(new Client(id , name));
        }
        if(keyTable==2) {
        //    abstructDao = new CompanyDao();
            int id = Integer.valueOf(scanner.nextLine());
            String name = scanner.nextLine();
         //   abstructDao.add(new Company(id , name));
        }
        if(keyTable==3) {
            DeveloperDao developerDao = new DeveloperDao();
            int id = Integer.valueOf(scanner.nextLine());
            String name = scanner.nextLine();
            String salary = scanner.nextLine();
            developerDao.addDeveloper(name , id, salary);
        }
        if(keyTable==4) {
         //   abstructDao = new ProjectDao();
            int id = Integer.valueOf(scanner.nextLine());
            String tirle = scanner.nextLine();
            int clientId = Integer.valueOf(scanner.nextLine());
            int companyId= Integer.valueOf(scanner.nextLine());
            int cost = Integer.valueOf(scanner.nextLine());
         //   abstructDao.add(new Project(id, tirle, clientId, companyId, cost));
        }
        if(keyTable==5) {
        //    abstructDao = new ProjectDeveloperDao();
            int id = Integer.valueOf(scanner.nextLine());
            int projectId = Integer.valueOf(scanner.nextLine());
            int developerId = Integer.valueOf(scanner.nextLine());
        //    abstructDao.add(new ProjectDeveloper(id , projectId, developerId));
        }
        if(keyTable==6) {
         //   abstructDao = new SpecialityDao();
            int id = Integer.valueOf(scanner.nextLine());
            String title = scanner.nextLine();
         //   abstructDao.add(new Specialty(id , title));
        }
        if(keyTable==7) {
         //   abstructDao = new SpecialityDeveloperDao();
            int id = Integer.valueOf(scanner.nextLine());
            int specialtyId = Integer.valueOf(scanner.nextLine());
            int developerId = Integer.valueOf(scanner.nextLine());
         //   abstructDao.add(new SpecialtyDeveloper(id , specialtyId, developerId));
        }
    }

    private void update(int keyTable) {
        if(keyTable==1) {
         //   abstructDao = new ClientDao();
            int id = Integer.valueOf(scanner.nextLine());
            String name = scanner.nextLine();
         //   abstructDao.update(new Client(id , name));
        }
        if(keyTable==2) {
        //    abstructDao = new CompanyDao();
            int id = Integer.valueOf(scanner.nextLine());
            String name = scanner.nextLine();
         //   abstructDao.update(new Company(id , name));
        }
        if(keyTable==3) {
            DeveloperDao developerDao = new DeveloperDao();
            int id = Integer.valueOf(scanner.nextLine());
            String name = scanner.nextLine();
            String salary = scanner.nextLine();
            developerDao.addDeveloper(name , id,salary);
        }
        if(keyTable==4) {
           // abstructDao = new ProjectDao();
            int id = Integer.valueOf(scanner.nextLine());
            String tirle = scanner.nextLine();
            int clientId = Integer.valueOf(scanner.nextLine());
            int companyId= Integer.valueOf(scanner.nextLine());
            int cost = Integer.valueOf(scanner.nextLine());
           // abstructDao.update(new Project(id, tirle, clientId, companyId, cost));
        }
        if(keyTable==5) {
           // abstructDao = new ProjectDeveloperDao();
            int id = Integer.valueOf(scanner.nextLine());
            int projectId = Integer.valueOf(scanner.nextLine());
            int developerId = Integer.valueOf(scanner.nextLine());
           // abstructDao.update(new ProjectDeveloper(id , projectId, developerId));
        }
        if(keyTable==6) {
          //  abstructDao = new SpecialityDao();
            int id = Integer.valueOf(scanner.nextLine());
            String title = scanner.nextLine();
         //   abstructDao.update(new Specialty(id , title));
        }
        if(keyTable==7) {
         //   abstructDao = new SpecialityDeveloperDao();
            int id = Integer.valueOf(scanner.nextLine());
            int specialtyId = Integer.valueOf(scanner.nextLine());
            int developerId = Integer.valueOf(scanner.nextLine());
         //   abstructDao.update(new SpecialtyDeveloper(id , specialtyId, developerId));
        }
    }

    private void delete(int keyTable) {
        if(keyTable==1) {
         //   abstructDao = new ClientDao();
            int id = Integer.valueOf(scanner.nextLine());
         //   abstructDao.remove(id);
        }
        if(keyTable==2) {
        //    abstructDao = new CompanyDao();
            int id = Integer.valueOf(scanner.nextLine());
         //   abstructDao.remove(id);
        }
        if(keyTable==3) {
            DeveloperDao developerDao = new DeveloperDao();
            int id = Integer.valueOf(scanner.nextLine());
            developerDao.removeDeveloper(id);
        }
        if(keyTable==4) {
          //  abstructDao = new ProjectDao();
            int id = Integer.valueOf(scanner.nextLine());
           // abstructDao.remove(id);
        }
        if(keyTable==5) {
          //  abstructDao = new ProjectDeveloperDao();
            int id = Integer.valueOf(scanner.nextLine());
          //  abstructDao.remove(id);
        }
        if(keyTable==6) {
          //  abstructDao = new SpecialityDao();
            int id = Integer.valueOf(scanner.nextLine());
          //  abstructDao.remove(id);
        }
        if(keyTable==7) {
         //   abstructDao = new SpecialityDeveloperDao();
            int id = Integer.valueOf(scanner.nextLine());
          //  abstructDao.remove(id);
        }
    }


    private void shouParams(int keyTable) {
        for (int i = 0; i < 100; i++)
            System.out.print("-");
        System.out.println("");
        showString("Write params : ");
        if(keyTable==1) {
            System.out.println("id");
            System.out.println("name");
        }
        if(keyTable==2) {
            System.out.println("id");
            System.out.println("name");
        }
        if(keyTable==3) {
            System.out.println("id");
            System.out.println("name");
            System.out.println("salary");
        }
        if(keyTable==4) {
            System.out.println("id");
            System.out.println("title");
            System.out.println("client id");
            System.out.println("company id");
            System.out.println("cost");
        }
        if(keyTable==5) {
            System.out.println("id");
            System.out.println("project id");
            System.out.println("developer id");
        }
        if(keyTable==6) {
            System.out.println("id");
            System.out.println("title");
        }
        if(keyTable==7) {
            System.out.println("id");
            System.out.println("speciality id");
            System.out.println("developer id");
        }
    }

    public void showInterfaceScreen(String headScreen,Map<Integer,String> mapList){
        printLine();
        showString(headScreen);
        printLine();
        showMapList(mapList);
        printLine();
    }
}