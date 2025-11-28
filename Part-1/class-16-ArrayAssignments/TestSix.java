class Test{
    public static void main(String[] args) {
        int[] prices={199,129,98,78,11,171,1055};
        //create new array based on existing array
        int[] prod_Prices=new int[prices.length];
        for(int i=0;i<=prices.length-1;i++){
            prod_Prices[i]=prices[i];
        }
        //iterate new array - forEach
        for (int price : prod_Prices) {
            System.out.println(price);
        }
    }
}