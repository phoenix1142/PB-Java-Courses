package homework.lesson5;

import homework.lesson5.objects.Bus;
import homework.lesson5.objects.Dog;
import homework.lesson5.objects.Human;
import homework.lesson5.objects.Station;

//Смоделировать жизненную ситуацию (с помощью методов и свойств объектов):
//        1) Автобус трогается с первой остановки
//        2) Автобус останавливается на 2-й остановке в него садятся Человек и Собака
//        3) на 4-й остановке они выходят и входят 4 Человека
//        4) 4 человека выходят на конечной остановке
//
//        Все остановки должны иметь названия.
//        Объекты должны иметь только свои свойства и методы (без дублирования чужих).
//        Результат работы программы - в методе main последовательный вызов нужных методов и изменение свойств объектов - для достижения результата задачи, и вывод соответствующей информации в консоль.
//        Объекты должны быть связаны между собой для определенного действия - собака не может сесть в автобус без человека.
//
//        При описании классов их следует разместить по пакетам и добавить описание методов (javadoc).
//        Чем больше деталей - тем лучше.


public class BusStations {
    public static void main(String[] args) {

        Station firstStation = new Station("Nikolaev");
        Station secondStation = new Station("Kherson");
        Station fourthStation = new Station("Poltava");
        Station lastStation = new Station("Lviv");

        Bus bus = new Bus("Bogdan", 4);

        Human human1 = new Human("Max");
        Human human2 = new Human("Vasya");
        Human human3 = new Human("Petya");
        Human human4 = new Human("Alex");
        Human human5 = new Human("Den");

        Dog dog1 = new Dog("Rex");

        bus.go(firstStation);
        bus.stop(secondStation);
        bus.goOnTheBus(human1,dog1);
        bus.go(secondStation);
        bus.stop(fourthStation);
        bus.goOffTheBus(human1,dog1);
        bus.goOnTheBus(human2,null);
        bus.goOnTheBus(human3,null);
        bus.goOnTheBus(human4,null);
        bus.goOnTheBus(human5,null);
        bus.go(fourthStation);
        bus.stop(lastStation);
        bus.goOffTheBus(human2,null);
        bus.goOffTheBus(human3,null);
        bus.goOffTheBus(human4,null);
        bus.goOffTheBus(human5,null);
    }
}
