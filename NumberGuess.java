import java.util.Scanner;

/**
 * NumberGuess
 */
public class NumberGuess {

    public static void main(String[] args) {
        final int SECRET_NUMBER;
        int numberIn;
        int trialNumber = 0;
        boolean done = false;

        Scanner in = new Scanner(System.in);
        SECRET_NUMBER = (int) (Math.random() * 10);

        while (!done) {
            ++trialNumber;
            System.out.println("Digite um palpite de 0 a 10: ");
            numberIn = in.nextInt();
            if (numberIn == SECRET_NUMBER) {
                System.out.println("Parabéns você acertou!");
                done = true;
            } else if (numberIn < SECRET_NUMBER) {
                System.out.println("Tente um número mais alto");
            } else {
                System.out.println("Tente um número mais baixo");
            }
        }
        System.out.println("você entrou com " + trialNumber + " tentativas.");
        in.close();
    }
}