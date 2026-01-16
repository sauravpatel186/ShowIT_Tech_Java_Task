package CollectionFramework;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmapdemo {
    HashMap<Integer,String> employeeData = new HashMap<>();

    public void addEmployee(int employeeId, String employeeName){
        employeeData.put(employeeId,employeeName);
    }
    public boolean updateEmployee(int employeeId, String updatedName){
        if(employeeData.containsKey(employeeId)){
            //Hashmap does not allow duplicate keys but allows duplicate value
            employeeData.put(employeeId,updatedName);
            return true;
        }
        return false;
    }
    public void deleteEmployee(int employeeId){
        employeeData.remove(employeeId);
    }
    public void searchEmployee(int employeeId){
        String name = employeeData.get(employeeId);
        if (name != null) {
            System.out.printf("Employee Id %d -> Name: %s%n", employeeId, name);
        } else {
            System.out.printf("Employee Id %d not found%n", employeeId);
        }
    }
    public void printAllEmployee(){
        employeeData.forEach((id,name)->
                System.out.printf("Employee Id %d -> Name : %s%n", id,name));
    }
    public static void main(String[] args) {
        Hashmapdemo hashmapdemo = new Hashmapdemo();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease enter your choice");
            System.out.println("1: Insert");
            System.out.println("2: Update");
            System.out.println("3: Delete");
            System.out.println("4: Search");
            System.out.println("5: Print All Employees");
            System.out.println("6: Exit");

            int choice = in.nextInt();
            int id;
            String name;

            switch (choice) {
                case 1:
                    System.out.println("Please Enter Employee Id and Name");
                    id = in.nextInt();
                    in.nextLine();  // consume the leftover newline
                    name = in.nextLine();
                    hashmapdemo.addEmployee(id, name);
                    break;
                case 2:
                    System.out.println("Please enter Employee Id and Name");
                    id = in.nextInt();
                    in.nextLine();
                    name = in.nextLine();
                    hashmapdemo.updateEmployee(id, name);
                    break;
                case 3:
                    System.out.println("Please enter Employee Id");
                    id = in.nextInt();
                    hashmapdemo.deleteEmployee(id);
                    break;
                case 4:
                    System.out.println("Please enter Employee Id");
                    id = in.nextInt();
                    hashmapdemo.searchEmployee(id);
                    break;
                case 5:
                    System.out.println("All employee details:");
                    hashmapdemo.printAllEmployee();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }
}
