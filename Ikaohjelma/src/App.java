import java.util.Scanner;

public class App {
public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);



    System.out.println("Tämä on ikä-ohjelma, syötä ikäsi! ");
    int ika = Integer.parseInt(in.nextLine());



    if (ika > 0 && ika < 18) { 
        System.out.println("Olet alaikäinen"); 
        }

    if (ika == 15) { 
        System.out.println("Saat ajaa mopoa");
        }

    if (ika <= 17 && ika >=16) {
        System.out.println("Saat ajaa kevaria");
        }


    if (ika == 18) {
        System.out.println("Olet täysi-ikäinen ja saat ajaa autoa");
        }

    else if (ika >= 65) { 
        System.out.println("Olet eläkeläinen"); 
        } 

    if (ika >= 18 && ika != 18 && ika <= 64) { 
        System.out.println("Olet aikuinen"); 
        }

    if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60 || ika == 70 || ika == 80) {
        System.out.println("Onnea tasakymmenestä!");

        if (ika == 40 || ika == 50) {
            System.out.println("Hyvää keski-ikää!");
    }
}

    if (ika == 100) { 
        System.out.println("Onnea 100v!");
        System.out.println("Onnea 100v!");
        System.out.println("Onnea 100v!");
        }

    if (ika >= 58 && ika <= 64) {
    System.out.println("Voit jäädä varhaiseläkkeelle!");
    }

    if (ika == 65) {
    System.out.println("Hyviä eläkepäiviä!");
    }

} 
}
