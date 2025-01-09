java.util.*;

class User{
    public User(String userid, String password){
        this.userid = userid;
        this.password = password;
    }

    public void addData()
}

class DataBase{
    private ArrayList<User> information = new ArrayList<>();

    public void addData(User user){
        information.add(user);
    }

    public boolean checkUser(User user){
        if(information.contains(user)){
            return true;
        }
        else{
            return false
        }
    }
}
class LibraryManagementSystem{
    public static void main(String[] args){
        DataBase db = new DataBase();
        Scanner sc = Scanner(System.in);
        boolean authenticate = true;

        while(authenticate){
            System.out.println("\nAuthentication required for library portal access");
            System.out.println("1.Login");
            System.out.println("2.Sign In");
            System.out.print("Choose between these options: ")
            System.out.print("\n")
            int choice1 = sc.nextInt()

            switch(choice1){
            case 1: 
                System.out.print("Enter UserId: ")
                String userid = sc.nextLine()
                System.out.print("\nEnter Password: ")
                String password = sc.nextLine()
                User user = new User(userid, password);
                boolean checkExistence = db.checkUser(user)
                if(checkExistence){
                    System.out.println("Welcome to the library portal");
                    authenticate = false;
                }
                else{
                    System.out.println("Sorry wrong user id or password!!!");
                    System.out.println("Please Try again.");
                }

            case 2:

                

        }
        }

    }
}