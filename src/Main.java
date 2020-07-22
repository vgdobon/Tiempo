import java.util.Scanner;

public class Main {

    //Time [PENDIENTE]
    //Crear una clase Tiempo que tenga:
    //- Time(hour: int, minute: int, second: int)
    //- getXXX (hour, minute, second)
    //- setXXX (hour, minute, second)
    //- toString() => "hh:mm:ss"
    //- nextSecond()
    //- prevSecond()
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tiempo nuevaHora = new Tiempo();
        System.out.println("¿Que hora es?");
        nuevaHora.setHour(sc.nextInt());
        System.out.println("¿Que minuto es?");
        nuevaHora.setMinute(sc.nextInt());
        System.out.println("¿Que hora es?");
        nuevaHora.setSecond(sc.nextInt());

        System.out.println(nuevaHora);

        nuevaHora.nextSecond();
        System.out.println(nuevaHora);
        nuevaHora.prevSecond();
        System.out.println(nuevaHora);
        nuevaHora.prevSecond();
        System.out.println(nuevaHora);

    }
}
