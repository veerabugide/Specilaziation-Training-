import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class EmpMenu {
    private static Emp emp;


    static Scanner scanner = new Scanner(System.in);
    static HashSet<Emp> empList = new HashSet<Emp>();

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("Menu");
            System.out.println("1.Create");
            System.out.println("2.Search");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.DisplayData");
            System.out.println("Exit(press -1)");


            System.out.println("Please chose your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    readEmpData();
                    break;
                case 2:
                    searchEmpData();
                    break;
                case 3:
                    updateEmpData();
                    break;
                case 4:
                    DeleteEmpData();
                case 5:
                    System.out.println(empList);
                    break;
            }
        } while (choice != -1);
        System.out.println("Program ends");

    }

    private static void readEmpData() {
        System.out.println("enter Emp Name");
        String name = scanner.next();

        System.out.println("enter Emp ID");
        int id = scanner.nextInt();

        System.out.println("enter Emp Dept");
        String dept = scanner.next();

        System.out.println("enter Emp Salary");
        float salary = scanner.nextFloat();

        Emp newEmp = new Emp(name, id, dept, salary);

        empList.add(newEmp);

    }

    private static void searchEmpData() {
        System.out.println("enter the emp id to be searched");
        int eid = scanner.nextInt();
        /*for(int index=0; index<empList.size();index++){
         if(empList.contains() == eid){
              return index;
            }
          return -1;
        }*/
    }

    private static void updateEmpData() {

        System.out.println("enter the emp id to be updated");
        int eid = scanner.nextInt();
        for (int index = 0; index < empList.size(); index++) {
//            empList.add()
        }

    }

    private static void DeleteEmpData() {
        System.out.println("enter the emp id to be deleted");
        String ename= scanner.next();
       // empList.remove(e);
        int eid = scanner.nextInt();
        for(int index=0; index<empList.size();index++) {
            //emp = empList.removeAll();
            if (emp.getEmpId() == eid) {
                empList.remove(eid);
            }
        }
    }
}
