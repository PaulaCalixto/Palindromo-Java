import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase();

        if (ePalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo!");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
        scanner.close();
    }

    public static boolean ePalindromo(String palavra) {
        int esquerda= 0;
        int direita= palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}