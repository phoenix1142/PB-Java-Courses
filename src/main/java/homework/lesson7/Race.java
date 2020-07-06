package homework.lesson7;

public class Race extends Hero implements Jumping,Running,Shooting,Swimming {
    @Override
    public void createHero() {
        System.out.println("Герой создался в классе Race");
    }

    @Override
    public void jumpHero() {
        System.out.println("Прыгает в классе Race");
    }

    @Override
    public void runHero() {
        System.out.println("Бежит в классе Race");
    }

    @Override
    public void shoutHero() {
        System.out.println("Стреляет в классе Race");
    }

    @Override
    public void swimHero() {
        System.out.println("Плывет в классе Race");
    }
}
