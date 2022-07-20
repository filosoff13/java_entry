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

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int count = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
        }
        for (int price : prices) {
            if (price == min) {
                count++;
            }
        }

        return count;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        if (prices.length == 0) {
            return prices;
        }
        int count = 0;
        for (int price : prices) {
            if (price == toRemove) {
                count++;
            }
        }
        int[] newPrices = new int[prices.length - count];
        int j = 0;
        for (int price : prices) {
            if (price != toRemove) {
                newPrices[j] = price;
                j++;
            }
        }

        return newPrices;
    }

    public int[] leavePrice9(int[] prices) {
        if (prices.length == 0) {
            return prices;
        }
        int count = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                count++;
            }
        }
        int[] newPrices = new int[count];
        int j = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                newPrices[j] = price;
                j++;
            }
        }

        return newPrices;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] newStocks = new String[showcaseStocks.length + warehouseStocks.length];
        int index = 0;
        for (String price : showcaseStocks) {
            newStocks[index] = price;
            index++;
        }
        for (String price : warehouseStocks) {
            newStocks[index] = price;
            index++;
        }
        return newStocks;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int total = 0;
        for (int price : prices) {
            if (price >= minPrice && price <= maxPrice) {
                total += price;
            }
        }

        return total;
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
