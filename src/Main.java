public class Main {
    public static void main(String[] args) {
        //ObjectA
        Transport transport = new Transport("Украинский автозавод", "город Домбас", 1995, ClassificationOfTransport.CLASSIFICATION_C);
        System.out.println(transport.getInfo());

        System.out.println(transport.signal("СЛАВА УКРАИНЕ!!!"));
        System.out.println(transport.signal());
        System.out.println(transport.signal(718));
        System.out.println("________________________");
        //ObjectB
        Truck truck1 = new Truck("Завод Volvo", "Швеция, Геденберг",
                2013, ClassificationOfTransport.CLASSIFICATION_C, "Volvo", "FH");
        System.out.println(truck1.getInfo());

        System.out.println(truck1.signal("Nigga Nigga"));
        System.out.println(truck1.signal());
        System.out.println(truck1.signal(404));
        System.out.println("________________________");
        //ObjectC
        Truck truck2 = new Truck("Завод Mercedes", "Германия, Штутгард",
                2018, ClassificationOfTransport.CLASSIFICATION_C, "Mercedes-Benz", "Actros L");
        System.out.println(truck2.getInfo());

        System.out.println(truck2.signal("Hello"));
        System.out.println(truck2.signal());
        System.out.println(truck2.signal(10101976));
        System.out.println("________________________");
    }
}