import java.util.Arrays;
import java.util.Comparator;

public class Lab4 {
    public static void main(String[] args) {

        int titanicLength = 882;
        int titanicWidth = 269;
        Ship titanic = new Ship("Titanic", 1912, "Olympic-class ocean liner", titanicLength, titanicWidth);

        Ship Victory = new Ship("Victory", 1765, "Battleship", 69, 23);

        Ship QueenMary = new Ship("Queen Mary", 1930, "Cruise ship", 310, 41);

        Ship[] ships = {titanic, Victory, QueenMary};
        //sort ship by year field
        Arrays.sort(ships, Comparator.comparing(Ship::getYear));

        System.out.println("Sorted by year");
        for (Ship ship : ships) {
            PrintShipParameters(ship);
        }

        //sort ship by length field reversed
        System.out.println("Sorted by length reversed");
        Arrays.sort(ships, Comparator.comparing(Ship::getLength).reversed());
        for (Ship ship : ships) {
            PrintShipParameters(ship);
        }
    }

    private static void PrintShipParameters(Ship titanic) {
        System.out.println();
        System.out.println("name of the ship: " + titanic.getName());
        System.out.println("year of the ship: " + titanic.getYear());
        System.out.println("type of the ship: " + titanic.getType());
        System.out.println("length of the ship: " + titanic.getLength());
        System.out.println("width of the ship: " + titanic.getWidth());
        System.out.println();
    }

}