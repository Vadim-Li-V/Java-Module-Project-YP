import java.util.Scanner;

class Car
{
    String name;
    int speed;

    public Car(String name, int speed)
    {
        this.name = name;
        this.speed = speed;
    }
}

class Race
{
    String leader = "";
    int distance1 = 0;
    public void Leader(Car car)
    {
        int distance2 = car.speed * 24;
        if(distance2 > distance1)
        {
            distance1 = distance2;
            leader = car.name;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Введите название автомобиля");
            String name = scanner.next();
            int speed;
            while(true)
            {
                System.out.println("Введите скорость автомобиля от 0 до 250");
                speed = scanner.nextInt();

                if(speed > 0 && speed < 250)
                {
                    break;
                }
                else
                {
                    System.out.println("Ошибка! Попробуйте еще раз");
                }
            }
            Car car = new Car(name, speed);
            race.Leader(car);
        }
        System.out.println("Самая быстрая машина:" + race.leader);
    }
}