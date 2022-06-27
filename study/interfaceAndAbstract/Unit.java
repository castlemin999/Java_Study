package study.interfaceAndAbstract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Unit {
    private int locationX;
    private int locationY;
    private int hp;

    public Unit(int locationX, int locationY, int hp) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.hp = hp;
    }

    public void movingX(int xDistance){
        locationX += xDistance;
    }

    public void movingY(int yDistance){
        locationY += yDistance;
    }

    public abstract void attack();
    public abstract void talk();
}
