import java.util.Arrays;

class HarekDataMaker{
    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + ", age - " + age + ", planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {

        String[] arr = new String[3];
        arr[0] = aggregateSingle(names[0], String.valueOf(ages[0]), planets[0]);
        arr[1] = aggregateSingle(names[1], String.valueOf(ages[1]), planets[1]);
        arr[2] = aggregateSingle(names[2], String.valueOf(ages[2]), planets[2]);

        return arr;
    }

    public static void main(String[] args) {
        HarekDataMaker robot = new HarekDataMaker();

        String[] arr = robot.aggregateAll(new String[]{"buw", "gex", "kew"}, new int[]{21, 19, 68}, new String[]{"Amcoqeruw", "guwuwalay", "Ydnuzuugf"});
        System.out.println(Arrays.toString(arr));
    }
}
