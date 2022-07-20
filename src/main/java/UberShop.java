public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void printPricesInt(int[] prices) {
        for (int price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else {
                prices[i] *= 1.5;
            }
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length < 2) {
            return prices;
        }
        int max = prices[0];
        int min = prices[0];
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            if (price > max) {
                max = price;
            }
        }
        if (min == max) {
            return new int[] {min};
        }

        return new int[] {min, max};
    }
    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
//        float[] prices = new float[] {107, 100};
        int[] prices = new int[] {25, 26};
//        shop.multiplyPrices(prices);
        int[] minMax = shop.findMinMaxPrices(prices);
        for (int price : minMax) {
            System.out.println(price);
        }
    }
}
