import Engineer.Engineer_class;
import Officer.Officer_base;
import Officer_manager.Officer_manager_class;
import Staff.Staff_class;
import Worker.Worker_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Officer_manager_class officer_list = new Officer_manager_class();
        while (true)
        {
            System.out.println("Officer Manager Application");
            System.out.println("Enter 1: Add new officer");
            System.out.println("Enter 2: Search officer's information");
            System.out.println("Enter 3: Show Officer's information list");
            System.out.println("Enter 4: Exit");
            String line = scanner.nextLine();
            switch (line){
                case "1":
                {
                    System.out.println("Enter a/A if you want to add new worker");
                    System.out.println("Enter b/B if you want to add new staff");
                    System.out.println("Enter c/C if you want to add new engineer");
                    String type = scanner.nextLine();
                    type = type.toLowerCase(Locale.ROOT);
                    switch (type){
                        case "a":{
                            System.out.print("Enter name:");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender:");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address:");
                            String address = scanner.nextLine();
                            System.out.print("Enter occupation:");
                            String occupation = scanner.nextLine();
                            Officer_base worker = new Staff_class(name,age,gender,address,occupation);
                            officer_list.addOfficer(worker);
                            System.out.println(worker.toString());
                            break;
                        }
                        case "b":{
                            System.out.print("Enter name:");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender:");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address:");
                            String address = scanner.nextLine();
                            System.out.print("Enter occupation:");
                            String occupation = scanner.nextLine();
                            Officer_base staff = new Staff_class(name,age,gender,address,occupation);
                            officer_list.addOfficer(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        case "c":{
                            System.out.print("Enter name:");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender:");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address:");
                            String address = scanner.nextLine();
                            System.out.print("Enter faculty:");
                            String faculty = scanner.nextLine();
                            Officer_base engineer = new Engineer_class(name,age,gender,address,faculty);
                            officer_list.addOfficer(engineer);
                            System.out.println(engineer.toString());
                            break;
                        }
                        default:
                            System.err.print("Invalid");
                            break;
                    }
                    break;
                }
                case "2":
                {
                    System.out.println("Enter the name you want to find");
                    String name = scanner.nextLine();
                    Officer_base search_result = officer_list.searchOfficerByName(name);
                    if(search_result == null){
                        System.err.println("Cannot find the name of this officer");
                    }else{
                        System.out.println(search_result.toString());
                    }
                    break;
                }
                case "3":{
                    System.out.println("The list of Officer will be shown below:");
                    officer_list.showOfficerInfoList();
                    break;
                }
                case "4":
                    return;
                default:
                    System.err.println("Invalid!");
                    continue;
            }
        }
    }
}
