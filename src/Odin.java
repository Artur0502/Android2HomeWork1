public class Odin {

    private String name;
    private int hit;
    private int age;
    private Superprower superprower;
    private House house;

    public String getName() {
        return name;
    }

    public Odin() {
    }

    public int getHit() {
        return hit;
    }

    public int getAge() {

        return age;
    }

    public Superprower getSuperprower() {
        return superprower;
    }


    public House getHouse() {
        return house;
    }

    public String getInfo() {
        return "hit: " + hit +
                "\nage: " + age +
                "\nSuperprower: " + superprower +
                "\nhouse: " + house.getName() +
                "\nhouse: " + house.getAddress();
    }
}
