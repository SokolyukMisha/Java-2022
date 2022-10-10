public class Ship{
    private String name;
    private int year;

    private String type;
    private int length;
    private int width;

    public Ship(String name, int year, String type, int length, int width) {
        this.name = name;
        this.year = year;
        this.type = type;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public String getType(){
        return type;
    }

    public int getYear() {
        return year;
    }

}