import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.*;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            distance = distance * -1;
        }
        return distance;
    }

    public String[] getPlanets(String galaxy) {
        String[] Miaru = {"Maux", "Reux", "Piax"};
        String[] Milkyway = {"Earth", "Mars", "Jupiter"};
        String[] DangerBanger = {"Fobius", "Demius"};
        String[] UnknownGalaxy = {};

//        switch (galaxy) {
//            case "Miaru":
//                return Miaru;
//            case "Milkyway":
//                return Milkyway;
//            case "DangerBanger":
//                return DangerBanger;
//        }

        if (Objects.equals(galaxy, "Miaru")) {
                return Miaru;
        } if (Objects.equals(galaxy, "Milkyway")) {
            return Milkyway;
        }  if (Objects.equals(galaxy, "DangerBanger")) {
                return DangerBanger;
        }
        return UnknownGalaxy;
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int STAR100 = 70;
        int STAR500 = 120;
        int STAR1000 = 200;

        if (fuel == "STAR100") {
            return STAR100 * count;
        }
        if (fuel == "STAR500") {
            return STAR500 * count;
        }
        if (fuel == "STAR1000") {
            return STAR1000 * count;
        } else {
            return 50 * count;
        }
    }

    public int roundSpeed(int speed) {
        double speed2 = (double)speed / 10;
        speed2 = round(speed2) * 10;

        return (int)speed2;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        } else {
            return (distance - 20) * 5 + 1000;
        }
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int k = max(a, b);
        int koef = max(k, c);
        float power = 0;
        
        if (koef < 10) {
            power = 0.7f;
        }
        if (koef >= 10 && koef <= 100) {
            power = 1.2f;
        }
        if (koef > 100) {
            power = 2.1f;
        }

        System.out.println(koef * power);
        scanner.close();
    }

    public String getMyPrizes(int ticket) {
        String word = "";
        if (ticket % 10 == 0) {
            word = "crystall";
        }
        if (ticket % 10 == 7) {
            word += " chip";
        }
        if (ticket > 200) {
            word += " coin";
        }

        return word;
    }

    public boolean isHangarOk(int side1, int side2, int price) {
        double maxSide = max(side1, side2);
        double minSide = min(side1, side2);
        if (side1 * side2 >= 1500 && maxSide/minSide <= 2 && price / (side1 * side2) <= 1000) {
            return true;
        }

        return false;
    }
    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
//        System.out.println(ship.roundSpeed(89));
        System.out.println(ship.isHangarOk(197, 68, 174148));
    }
}
