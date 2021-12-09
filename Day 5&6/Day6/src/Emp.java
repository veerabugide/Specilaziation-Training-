
import java.util.Scanner;

public class Emp {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Employee e[] = new Employee[10];
          int choice=0, c2=0, i=0;
          do{
               System.out.println("1.Create");
               System.out.println("2.Display");
               System.out.println("3.RaiseSalary");
               System.out.println("4.Exit");
               System.out.println("Enter you choice");
               choice=sc.nextInt();
               switch (choice){
                    case 1:
                         do {
                              System.out.println("\n1.Clerk");
                              System.out.println("2.Programmer");
                              System.out.println("3.Manager");
                              System.out.println("4.Exit");
                              System.out.println("Enter your choice");
                              c2= sc.nextInt();
                              switch (c2){
                                   case 1:
                                        e[i] = new Clerk();
                                        i++;
                                        break;
                                   case 2:
                                        e[i] = new Programmer();
                                        i++;
                                        break;
                                   case 3:
                                        e[i] = new Manager();
                                        i++;
                                        break;
                              }
                         }while (c2!=4);
                         break;
                    case 2:
                         try{
                              for (Employee x:e){
                                   if(x!=null)
                                        x.display();
                              }
                         }catch (Exception ex){
                              System.out.println("\n No records present.........");
                         }
                         break;
                    case 3:
                         try{
                              for (Employee x:e){
                                   if(x!=null)
                                        x.raise();
                              }
                              System.out.println("\n Salary Raised.....");
                         }catch (Exception ex){
                              System.out.println("\n No records present.........");
                         }
                         break;
                    case 4:
                         System.out.println("\n Exiting......");
                         break;
                    default:
                         System.out.println("\n Invalid choice...!!");
               }
          }while (choice!=4);
     }
}