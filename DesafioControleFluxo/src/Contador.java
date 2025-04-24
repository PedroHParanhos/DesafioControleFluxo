import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    int parametroUm = scan.nextInt();
    int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        scan.close();
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int quantidadeInterações = parametroDois - parametroUm;

        System.out.println("Quantidade de interações: " + quantidadeInterações);
        for(int i = 1; i <= quantidadeInterações; i++) {
            System.out.println("Imprimindo número " + i );
        }
    }

}