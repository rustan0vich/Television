public class Channel {
    private int number;
    private String name;

    public Channel(int number,String name){
        if (number<0 && number<=10){
            System.err.println("Такого канала не существует, напишите канал от 1 до 10");
        }else {
            this.number = number;
        }
        this.name = name;
    }

    public Channel() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kanal{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
