import com.company.Weapon;

public class Boss extends GameEntity {

    private Weapon weapon;


    public Boss(int health, double damage, String superAbility, Weapon weapon) {
        super(health, damage, superAbility);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}







