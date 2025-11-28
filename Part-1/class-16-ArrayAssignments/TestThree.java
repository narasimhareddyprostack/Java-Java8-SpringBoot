class Test{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055};
        //Count how many products thier prices are below 100.
        int count=0;
        for (int price  : prices) {
            if(price<100){
                count++;
            }
        }
        System.out.println("No of Product prices below 100 RS:"+count);
    }
}