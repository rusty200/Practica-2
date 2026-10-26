
import java.util.Scanner;
import java.util.Random;

public class Mazmorra {

    //Metodo para tirar el dado
    private static int tirarDado20() {
        Random dado = new Random();
        return dado.nextInt(20) + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creamos al aventurero y al enemigo
        Aventurero heroe = new Aventurero("Guerrero", 100, 20, 3);
        Enemigo dragon = new Enemigo("Dragón", 120, 15);

        System.out.println("=== GUARIDA DEL DRAGÓN ===");
        System.out.println("¡Comienza el combate!");

    }

}
