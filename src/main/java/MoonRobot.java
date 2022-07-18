import java.util.Scanner;

public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 || batteryPercent > 67;
    }

    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding) {
        if (isEngineWorking && isEngineWorking == false) {
            return true;
        }
        if (isEngineWorking && isEngineWorking) {
            return false;
        }
        return (isEngineWorking || isRobotStanding);
    }

    public String getNameCode(String name) {
        int n = name.length();
        char first = name.charAt(0);
        char last = name.charAt(n - 1);
        System.out.println(n);

        return Character.toString(first) + Character.toString(last);
    }

    public boolean isInvisibleName(String name) {
        return (name.length() != 0 && (name.contains(" ") || name.contains("\n") || name.contains("\t")));
    }
    //Test output
    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();

        //Should be false
        System.out.println(robot.isInvisibleName(" "));

        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        System.out.println((a && b && c) + " " + (a || b || c));
        scanner.close();
    }
}