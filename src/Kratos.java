import java.util.Arrays;

public final class Kratos extends Thor {
    private int life;

    public Kratos(String name, String[] strength, String weapon, House house, int life) {
        super(name, strength, weapon, house);
        this.life = life;
    }

    public String money(){
        return "Бомж";
    }
    public Kratos(String name, String weapon, House house, int life) {
        super(name, weapon, house);
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    @Override
    public String getInfo() {
        if (getStrength()!= null) {
            return "name: " + getName() +
                    "\nstrength: " + Arrays.toString(getStrength()) +
                    "\nweapon: " + getWeapon() +
                    "\nhouse: " + getHouse().getAddress() +
                    "\nhjuse: " + getHouse().getName() + "life: " + life;
        }else {
            return "name: " + getName() +
                    "\nweapon: " + getWeapon() +
                    "\nhouse: " + getHouse().getAddress() +
                    "\nh0use: " + getHouse().getName() +
                    "\nlife: " + life;
        }
    }
}
