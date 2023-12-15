import java.util.*;
public class emailMatch{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Email Address:");
        String email=scanner.nextLine();
        if(isValidEmail(email)){
            System.out.println("Success! The Email is Valid");
        }
        else{
            System.out.println("The Email is not Valid");
        }
    }
    private static boolean isValidEmail(String email){
        String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_=&*-]+)*@(?:[a-zA-Z0-9_+&*-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern=Pattern.complile(emailRegex);
        Matcher matcher =pattern.matcher(email);
        return matcher.matches()
    }
}