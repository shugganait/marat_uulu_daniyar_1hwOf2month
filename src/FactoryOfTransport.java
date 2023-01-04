public class FactoryOfTransport {
    private String name;
    private String address;

    public FactoryOfTransport(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
