public class CheapStocks {
    public String getCheapStocks(String[] stocks) {
//        int count = 0;
        String newStocks = "";
        for (String stock : stocks) {
            String[] spited = stock.split("\\s+");
            if (Integer.parseInt(spited[1]) < 200) {
                newStocks += spited[0] + " ";
//                count++;
            }
        }
//        String[] newStocks = new String[count];
//        int i = 0;
//        for (String stock : stocks) {
//            String[] spited = stock.split("\\s+");
//            if (Integer.parseInt(spited[1]) < 200) {
//                newStocks[i] = spited[0];
//                i++;
//            }
//        }

        return newStocks;
    }
}
