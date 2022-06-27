package study.interfaceAndAbstract;

public class Main {

    public static void main(String[] args) {
        Marin JimRaynor = new Marin(10, 10, 100);
        System.out.println("HP = " + JimRaynor.getHp());

        JimRaynor.usingSteamPack();
        System.out.println("HP after using steampack = " + JimRaynor.getHp());

        JimRaynor.healing();
        System.out.println("HP after healing = " + JimRaynor.getHp());

    }
}
