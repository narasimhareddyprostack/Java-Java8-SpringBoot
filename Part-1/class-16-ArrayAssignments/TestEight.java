class Test{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055};
        //Sum all prices in the array.
        int total=0;
        for (int price  : prices) {
            total=total+price;
        }
        System.out.println("Total Product Prices:"+total);
    }
}