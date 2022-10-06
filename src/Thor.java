import java.util.Arrays;

public class Thor extends Odin {

    private String name;
    private String[] strength;
    private String weapon;
    private House house;

    private String money;

    public String getMoney() {
        return money;
    }

     public String money(){
        return "милонер";
    }
    final public String money(String money){
return money;
    }

    public Thor(String name, String[] strength, String weapon, House house) {
        this.name = name;
        this.strength = strength;
        this.weapon = weapon;
        this.house = house;
    }

    public Thor(String name, String weapon, House house) {
        this.name = name;
        this.weapon = weapon;
        this.house = house;
    }

    @Override
    public House getHouse() {
        return house;
    }

    public String getName() {
        return name;
    }

    public String[] getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getInfo() {
        return "name: " + name +
                "\nstrength: " + Arrays.toString(strength) +
                "\nweapon: " + weapon +
                "\nhouse: " + house.getAddress() +
                "\nhjuse: " + house.getName();
    }
}
