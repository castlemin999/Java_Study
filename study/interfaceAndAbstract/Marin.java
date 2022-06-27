package study.interfaceAndAbstract;

public class Marin extends TerranUnit implements Healable{

    public Marin(int locationX, int locationY, int hp) {
        super(locationX, locationY, hp);
    }

    @Override
    public void attack() {
        System.out.println("기관 소총으로 공격");
    }

    @Override
    public void talk() {
        System.out.println("마린 입니다.");
    }

    @Override
    public void healing() {
        System.out.println("힐링 중...");
        this.setHp(this.getHp() + 10);
    }

    public void usingSteamPack() {
        this.setHp(this.getHp() - 10);
        System.out.println("스팀팩 사용");
    }
}
