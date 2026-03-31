import java.util.Scanner;


public class imc {
    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.print("Digite seu gênero (M/F/N): ");
        char genero = lerTeclado.next().charAt(0);

        System.out.print("Digite sua altura (ex: 1,75): ");
        float altura = lerTeclado.nextFloat();

        System.out.print("Digite seu peso (ex: 70,5): ");
        float peso = lerTeclado.nextFloat();

        lerTeclado.close();

        double imc = peso / (altura * altura);

        genero = Character.toUpperCase(genero);
        boolean masculino = (genero == 'M');

        String classificacao;
if (masculino) {
            if (imc >= 40) classificacao = "Obesidade Mórbida";
            else if (imc >= 30) classificacao = "Obesidade Moderada";
            else if (imc >= 25) classificacao = "Obesidade Leve";
            else if (imc >= 20) classificacao = "Normal";
            else classificacao = "Abaixo do normal";
        } else {
            if (imc >= 39) classificacao = "Obesidade Mórbida";
            else if (imc >= 29) classificacao = "Obesidade Moderada";
            else if (imc >= 24) classificacao = "Obesidade Leve";
            else if (imc >= 19) classificacao = "Normal";
            else classificacao = "Abaixo do normal";
        }

        String generoExibido;
        if (masculino) generoExibido = "Masculino";
        else if (genero == 'F') generoExibido = "Feminino";
        else generoExibido = "Não informado";

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + generoExibido);
        System.out.printf("Altura: %.2f m\n", altura);
        System.out.printf("Peso: %.2f kg\n", peso);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);
    }
}