import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yükseklik değeri alınır
        System.out.print("Yüksekliği girin: ");
        int height = input.nextInt();

        // Yıldızları yazdıran döngü
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Alt satıra geç
        }

        input.close();
            }
        }

