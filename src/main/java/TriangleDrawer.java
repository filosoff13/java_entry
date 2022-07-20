public class TriangleDrawer {
    public String drawTriangle(int side) {
        String newDrew = "";
        int j = 0;
        while (j < side) {
            newDrew += "*".repeat(side - j);
            newDrew += System.lineSeparator();
            j++;
        }

        return newDrew;
    }

    //Test output
    public static void main(String[] args) {
        TriangleDrawer helper = new TriangleDrawer();
        //Should be:
        //***
        //**
        //*

        System.out.println(helper.drawTriangle(3));
    }
}
