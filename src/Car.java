import java.util.Calendar;

public class Car {
    Calendar calendar = Calendar.getInstance();

    String name = "Fusca", color="Azul";
    int yearOfRelease = 1976, yearOfNow=calendar.get(Calendar.YEAR);

    void showsDatasheet(){
        System.out.println(String.format("""
                Nome: %s
                Ano: %d
                Cor: %s
                """, name, yearOfRelease, color));
    }

    int ageOfCar(int year){
        return yearOfNow - yearOfRelease;
    }
}
