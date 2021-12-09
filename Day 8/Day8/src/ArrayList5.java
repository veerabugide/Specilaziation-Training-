import java.util.ArrayList;
import java.util.List;

class User{
        private String name;
        private int age;
        public User(String name , int age){
            this.name = name;
            this.age = age;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public class ArrayList5 {
        public static void main(String[] args) {
            List<User> users = new ArrayList<>();
            users.add(new User("Sri",22));
            users.add(new User("Ramri",26));
            users.add(new User("Manju",29));
            users.forEach(user->{
                System.out.println("Name  "+ user.getName()+ "Age  "+user.getAge());
            });
        }
}
