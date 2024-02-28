import java.util.HashMap;
import java.util.Scanner;
class LibraryLoginSystem {
    private static HashMap<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        // Inisialisasi data pengguna (Admin, mahasiswa)
        users.put("admin", "312");
        users.put("mahasiswa", "202310370311312");

        // Tampilkan menu login
        System.out.println("Selamat datang di Library Login System");
        loginMenu();
    }

    private static void loginMenu() {
        Scanner scanner = new Scanner(System.in);

        // Tampilkan menu pilihan login
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                loginStudent();
                break;
            case 2:
                loginAdmin();
                break;
            case 3:
                System.out.println("Terima kasih. Sampai jumpa!");
                System.exit(0);
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                loginMenu();
        }
    }

    private static void loginStudent() {
        Scanner scanner = new Scanner(System.in);

        // Input NIM mahasiswa
        System.out.print("Enter your NIM: ");
        String nim = scanner.nextLine();

        // Periksa keberadaan mahasiswa
        if (nim.equals("202310370311312")) {
            System.out.println("Successful Login as Student");
        } else {
            System.out.println("User Not Found");
        }

        // Kembali ke menu login
        loginMenu();
    }

    private static void loginAdmin() {
        Scanner scanner = new Scanner(System.in);

        // Input username dan password admin
        System.out.print("Enter your username (Admin): ");
        String username = scanner.nextLine();
        System.out.print("Enter your password (Admin): ");
        String password = scanner.nextLine();

        // Validasi admin
        if (username.equals("Admin") && password.equals("312")) {
            System.out.println("Successful Login as Admin");
        } else {
            System.out.println("Admin User Not Found!!");
        }

        // Kembali ke menu login
        loginMenu();
    }
}