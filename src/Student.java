public class Student {
    String name = "João";
    int age = 20;

    void showStudentInfo() {
        System.out.println(String.format(
                """
                Os dados do aluno são os seguintes:
                Nome: %s
                Idade: %d
                """, name, age));
    }
}
