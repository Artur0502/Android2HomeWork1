public class Main {
    public static void main(String[] args) {
        String[] strings={"Гром","молния"};
        House house =new House("Азгарт","100...");
        Thor thor = new Thor("Thor",strings,"Мюнер",house);
        System.out.println(thor.getInfo());

        System.out.println("---------------------------------");
        Kratos kratos = new Kratos("Kratos",strings,"Два топара",house,3);
        System.out.println(kratos.getInfo());
        kratos.money("milioner");
        kratos.money();

        System.out.println("----------------------------------------");

        Kratos kratos1 = new Kratos("Kratos","Два топара",house,3);
        System.out.println(kratos1.getInfo());
        kratos1.money("BOMJ");
        kratos1.money();
    }

}