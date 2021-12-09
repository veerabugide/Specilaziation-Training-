import java.util.*;



public class StudentMenu {
    static Scanner sc = new Scanner(System.in);
    static List<Student> stdList = new ArrayList<Student>();



    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("\t \t Student database\n");
            System.out.println("1>Create\n 2>Search\n 3>Update\n 4>Delete\n 5>Display\n 6>Exit\n");
            System.out.println("Please chose your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createStudData();
                    break;
                case 2:
                    int id;
                    System.out.println("Enter the id you want to search");
                    id = sc.nextInt();
                    searchStud(id);
                    break;
                case 3:
                    updateStud();
                    break;
                case 4:
                    System.out.println("Enter the id you want to delete");
                    id = sc.nextInt();
                    removeStud(id);
                    break;
                case 5:
                    System.out.println(stdList);
                    break;
                case 6:
                    System.exit(0);
                    break;



            }
        }while(choice != -1);
        System.out.println("Program ends");
    }



    private static void createStudData() {
        System.out.println("Enter Student Name");
        String name = sc.next();



        System.out.println("Enter Student ID");
        int id = sc.nextInt();



        System.out.println("Enter Student Dept");
        String dept = sc.next();



        System.out.println("Enter Student Marks");
        int marks = sc.nextInt();



        Student newStd = new Student(name,id,dept,marks);



        stdList.add(newStd);
    }
    private static void searchStud(int id) {
        for (int i = 0; i < stdList.size(); i++) {
            Student stud = stdList.get(i);
            if(stud.getStdId()==id)
                System.out.println(stud);
        }



    }



    private static void updateStud() {
        int id;
        String name;
        String dept;
        int marks;
        System.out.println("Enter the id you want to update");
        id = sc.nextInt();
        System.out.println("Enter the name");
        name = sc.next();
        System.out.println("Enter department");
        dept = sc.next();
        System.out.println("Enter marks");
        marks = sc.nextInt();
        for(int i = 0;i<stdList.size();i++){
            Student s = stdList.get(i);
            if(s.getStdId()==id){
                s.setStdName(name);
                s.setDept(dept);
                s.setMarks(marks);
            }
        }




    }
    private static void removeStud(int id) {



        for(int i = 0; i < stdList.size();i++){
            Student stud = stdList.get(i);
            if(stud.getStdId()==id)
                stdList.remove(stud);
            System.out.println("Student removed...");
        }
    }



}