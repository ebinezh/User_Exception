import java.io.*;
import java.util.*;

class myException extends Exception {
    myException() {
        System.out.println("Error:Password too short");
    }

    myException(int n) {
        System.out.println("Error:Only adults can join");
    }
}

class UserExceptionEx7 {
    public static void main(String args[]) throws IOException, myException {
        Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter user name : ");
            String n = sc.nextLine();
            System.out.print("Enter your password : ");
            String m = sc.nextLine();
            if (m.length() < 6)
                throw new myException();
            System.out.print("Enter your age : ");
            int age = sc.nextInt();
            if (age < 18)
                throw new myException(age);
        } catch (Exception e) {
        }
    }
}