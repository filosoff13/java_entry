public class ArlanHelper {
    public String drawQuad(int n) {
        String newDrew = "";
        int i = 0;
        int j = 0;
        while (j < n) {
            newDrew += "*";
            while (i < n-1) {
                newDrew += "*";
                i++;
            }
            newDrew += System.lineSeparator();
            i = 0;
            j++;
        }

        return newDrew;
    }

    public String drawRect(int width, int height, char c) {
        String result = "";

        while(height > 0) {
            height--;

            int columns = width;
            while(columns > 0) {
                result += c;
                columns--;
            }

            result += "\n";
        }

        return result;
    }

    public String drawLine(int length) {
        String result = "";
        int count = 0;
        while (length > 0) {
            if (count % 2 == 0) {
                result += "*";
            } else {
                result += "#";
            }
            count++;
            length--;
        }

        return result;
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        String result = "";
        int length = pattern.length;
        int i = 0;
        while (repeatCount > 0) {
            while (length > 0) {
                result += Character.toString(pattern[i]);
                length--;
                i++;
            }
            repeatCount--;
            length = pattern.length;
            i = 0;
        }

        return result;
    }
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
//        System.out.println(helper.drawQuad(3));
//        System.out.println(helper.drawRect(2, 3, 'X'));
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
