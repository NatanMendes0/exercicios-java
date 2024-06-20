import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //starts the program and make a var for user option
        boolean execute = true;
        int option;

        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Olá mundo! 
                Seja bem-vindo(a) ao meu programma de exercicios
                Para começar, escolha uma opção:
                """);

        //keeps the program running
        while (execute){
            System.out.println("""
                    1 - Pessoa
                    2 - Calculadora
                    3 - Musica
                    4 - Carro
                    5 - Aluno
                    6 - Sair""");

            option = scan.nextInt();

            //runs the method based in user choices
            switch (option){
                case 1:
                    Person person = new Person();
                    System.out.print("Digite a sua idade: ");
                    person.age = scan.nextInt();
                    scan.nextLine(); // Consume the new line left by nextLine()
                    System.out.print("Digite o seu nome: ");
                    person.name = scan.nextLine();
                    person.helloWorld();
                    break;

                case 6:
                    System.out.println("Programa encerrado!");
                    execute = false;
                    break;
            }
        }
    }
}
