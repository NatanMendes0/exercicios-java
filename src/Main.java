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
                    Menu de música:
                    1 - Pessoa
                    2 - Calculadora
                    3 - Musica
                    4 - Carro
                    5 - Aluno
                    6 - Sair""");

            option = scan.nextInt();

            //runs the method based in user choices - each number is a exercise
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

                case 2:
                    Calculator calculator = new Calculator();
                    System.out.println("Digite um número: ");
                    calculator.number = scan.nextDouble();
                    System.out.println("O dobro desse número é: "+calculator.numberMultiply(calculator.number)+"\n");
                    break;

                case 3:
                    Music music = new Music();
                    System.out.println("O que você deseja fazer?\n");
                    boolean musicMenuStart = true;
                    while (musicMenuStart) {
                        System.out.println("""
                                1 - Exibir ficha técnica
                                2 - Avaliar música
                                3 - Sair do menu
                                """);
                        int musicOption = scan.nextInt();
                        switch (musicOption){
                            case 1:
                                music.showsDatasheet();
                                break;

                            case 2:
                                System.out.println("Insira sua avaliação: ");
                                music.rating = scan.nextDouble();
                                music.insertRating(music.rating);
                                System.out.println("Avaliação enviada!");
                                break;

                            case 3:
                                System.out.println("Saindo do menu de música!");
                                musicMenuStart = false;
                                break;
                        }
                    }

                //TODO - cases 4 and 5
                    /*
                    * case 4 - Crie uma classe Carro com atributos modelo,
                    * ano, cor e métodos para exibir a ficha técnica
                    * e calcular a idade do carro.
                    * case 5 - Crie uma classe Aluno com atributos nome,
                    * idade, e um método para exibir informações.
                    * Crie uma instância (como nos exercícios anteriores)
                    * da classe Aluno, atribua valores aos seus atributos e
                    * utilize o método para exibir as informações.
                    */

                case 6:
                    System.out.println("Programa encerrado!");
                    execute = false;
                    break;
            }
        }
    }
}
