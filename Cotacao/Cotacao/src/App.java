import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Converter converter = new Converter();
        Moedas moedas = converter.cambio();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da moeda (USD, EUR, AUD): ");
        String codigoMoeda = scanner.nextLine().toUpperCase();

        Double taxa = moedas.conversion_rates().get(codigoMoeda);
        if (taxa != null) {
            System.out.println("A taxa de câmbio para " + codigoMoeda + " é: " + taxa);

            System.out.println("Digite o valor em Reais (BRL) para converter: ");
            double valorEmReais = scanner.nextDouble();
            double valorConvertido = valorEmReais * taxa;

            System.out.println("O valor de " + valorEmReais + " BRL em " + codigoMoeda + " é: " + valorConvertido);
        } else {
            System.out.println("Moeda não encontrada.");
        }

        Arquivo arquivo = new Arquivo();
        arquivo.geradorDeArquivo(moedas);

        scanner.close();
    }
}


