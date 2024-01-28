import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] employeeDetails = {
                {"Emp No.", "Emp Name", "Join Date", "Desig Code", "Dept", "Basic", "HRA", "IT"},
                {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
                {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
                {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
                {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
                {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
                {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
          \      {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };

        String[][] designationTable = {
                {"e", "Engineer", "20000"},
                {"c", "Consultant", "32000"},
                {"k", "Clerk", "12000"},
                {"r", "Receptionist", "15000"},
                {"m", "Manager", "40000"}
        };

        int numberOfEmployees = employeeDetails.length - 1; 

        System.out.println("\nEnter Employee ID to search for details: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        String searchEmpId = inputString.substring(inputString.length() - 4);

        for (int i = 1; i <= numberOfEmployees; i++) {
            if (employeeDetails[i][0].equals(searchEmpId)) {
                System.out.println("\nEmployee Details for Employee ID " + searchEmpId + ": ");
                System.out.printf("%-12s%-12s%-12s%-15s%-12s%n",
                        "Emp No.", "Emp Name", "Department", "Designation", "Salary");

                String empDesignationCode = employeeDetails[i][3];
                String empDA = "";
                switch (empDesignationCode) {
                    case "e":
                        System.out.printf("%-12s%-12s%-12s%-15s",
                                employeeDetails[i][0], employeeDetails[i][1], employeeDetails[i][4], "Engineer");
                        empDA = "20000";
                        break;
                    case "c":
                        System.out.printf("%-12s%-12s%-12s%-15s",
                                employeeDetails[i][0], employeeDetails[i][1], employeeDetails[i][4], "Consultant");
                        empDA = "32000";
                        break;
                    case "k":
                        System.out.printf("%-12s%-12s%-12s%-15s",
                                employeeDetails[i][0], employeeDetails[i][1], employeeDetails[i][4], "Clerk");
                        empDA = "12000";
                        break;
                    case "r":
                        System.out.printf("%-12s%-12s%-12s%-15s",
                                employeeDetails[i][0], employeeDetails[i][1], employeeDetails[i][4], "Receptionist");
                        empDA = "15000";
                        break;
                    case "m":
                        System.out.printf("%-12s%-12s%-12s%-15s",
                                employeeDetails[i][0], employeeDetails[i][1], employeeDetails[i][4], "Manager");
                        empDA = "40000";
                        break;
                    default:
                        break;
                }

                int salary = Integer.parseInt(employeeDetails[i][5]) +
                        Integer.parseInt(employeeDetails[i][6]) +
                        Integer.parseInt(empDA) -
                        Integer.parseInt(employeeDetails[i][7]);
                System.out.printf("%-12s%n", salary);
                break; 
            }
        }
    }
}


