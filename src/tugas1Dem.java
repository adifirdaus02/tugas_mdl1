package tugas1;

import java.util.Scanner;

public class tugas1Dem {
    void Student(long nomer){
        long NIM[] = {202310370311227L, 202310370311200L, 2023103703112102L};
        for (long i : NIM){
            if (i == nomer){
                System.out.println("Succesful login as Student.");
                break;
            } else {
                System.out.println("User not found.");
                break;
            }
        }
    }

    void Admin(String user, String password){
        String adm = "admin";
        String pw = "admin";

        if (adm.equals(user) && pw.equals(password)) {
            System.out.println("Succesful login as Admin.");
        }
        else {
            System.out.println("User not found.");
        }
    }

    public static void main(String[] args){
        tugas1Dem lb = new tugas1Dem();
        Scanner inp = new Scanner(System.in);

        System.out.println("====== Library System ======");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");
        int pilih = inp.nextInt();

        switch (pilih){
            case 1:
                System.out.print("Enter your NIM: ");
                long nim = inp.nextLong();
                lb.Student(nim);
                break;
            case 2:
                System.out.print("Enter your username: ");
                String user = inp.next();
                System.out.print("Enter your password: ");
                String pass = inp.next();
                lb.Admin(user,pass);
                break;
            case 3:
                break;
            default:
                System.out.println("Maaf inputan anda salah.");
                break;
        }
    }
}