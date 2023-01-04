public final class Truck extends Transport{
    private String mark;
    private String model;
    public Truck(String name, String address, int year, ClassificationOfTransport classOfTransport, String mark, String model) {
        super(name, address, year, classOfTransport);
        this.mark = mark;
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String signal(String signal) {
        return super.signal(signal) + " || " + getMark() + " " + getModel() + "*";
    }
    public String getInfo() {
        return "Сделано в " + getName() + ", " + getAddress() +
                "\nГод производства: " + getYear() +
                "\nКласс машины: " + getClassOfTransport() +
                "\nБрэнд: " + getMark() +
                "\nМодель: " + getModel();
    }
}
