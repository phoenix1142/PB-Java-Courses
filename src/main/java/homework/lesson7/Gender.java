package homework.lesson7;

public class Gender extends Hero implements Jumping,Running,Shooting,Swimming {
    @Override
    public void createHero() {
        System.out.println("Герой создался в классе Gender");
    }

    @Override
    public void jumpHero() {
        System.out.println("Прыгает в классе Gender");
    }

    @Override
    public void runHero() {
        System.out.println("Бежит в классе Gender");
    }

    @Override
    public void shoutHero() {
        System.out.println("Стреляет в классе Gender");
    }

    @Override
    public void swimHero() {
        System.out.println("Плывет в классе Gender");
    }
}
