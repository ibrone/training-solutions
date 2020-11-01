package classtructureattributes;



import java.util.Scanner;

public class Music {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

            System.out.println("Kérem a kedvenc dalának címét:");
            song.title = scanner.nextLine();
            System.out.println("Kérem a dal előadójának nevét:");
            song.band = scanner.nextLine();
            System.out.println("Kérem a dal hosszát másodpercben:");
            song.length = scanner.nextInt();
            System.out.println("Köszönöm!");

            System.out.println("Az Ön kedvec dalának címe: " + song.title);
            System.out.println("Az Ön kedvenc dalának előadója: " + song.band);
            System.out.println("A dal hossza másodpercben: " + song.length);


    }

}
