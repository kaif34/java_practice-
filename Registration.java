import java.util.Scanner;


public class Registration {
    String ans,user,pass,username,password,email,dob,gender,phone;
    

    public static void  main(String[]args) Register_user() {
        System.out.println("Have You Registered Or Not");
        Scanner sc = new Scanner(System.in);
        ans = sc.nextLine();

        if (ans.equals("yes"))
         {
            
             // Corrected comparison
            System.out.println("Enter User Name : ");
            user = sc.nextLine();

            System.out.println("\n Enter Password : ");
            pass = sc.nextLine();

            if(user == username && pass == password)
          {
                System.out.println("Login Successfully");
        }
            else {
                    System.out.println("Login Failed");
                }

        } 
        else
         {
            System.out.println("\n Enter User Name : ");
            username = sc.nextLine();

            System.out.println("\n Enter Password : ");
            password = sc.nextLine();

            System.out.println("\n Enter Email : ");
            email = sc.nextLine();

            System.out.println("\n Enter Date Of Birth : ");
            dob = sc.nextLine();

            System.out.println("\n Enter Gender : ");
            gender = sc.nextLine();

            System.out.println("\n Enter Phone Number : ");
            phone = sc.nextLine();

            System.out.println("Registration Done Successfully");
        }
    }

}


public class flight_booking {

    public static void main(String[] args) {
        Registration r1 = new Registration();
        r1.Register_user();
    }
}

