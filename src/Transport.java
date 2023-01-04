public class Transport extends FactoryOfTransport{
    private int year;
    private ClassificationOfTransport classOfTransport;

    public Transport(String name, String address, int year, ClassificationOfTransport classOfTransport) {
        super(name, address);
        this.year = year;
        this.classOfTransport = classOfTransport;
    }
    public int getYear() {
        return year;
    }

    public ClassificationOfTransport getClassOfTransport() {
        return classOfTransport;
    }

    public String signal(String signal){
        return signal;
    }

    final public String signal(){
        return "Beep beep";
    }
    public int signal(int signal){
        return signal;
    }
    public String getInfo(){
        return "Название и адрес: " + getName() + ", " + getAddress() +
                "\nГоды производств: " + getYear() +
                "\nКлассы машин: " + getClassOfTransport();
    }
}
