public class Person {
    String name;
    int age;

    void helloWorld(){
        System.out.println(String.format("""
                Olá pessoal!
                Me chamo %s, tenho %d anos.
                Olá mundo!
                """, name, age));
    }
}
