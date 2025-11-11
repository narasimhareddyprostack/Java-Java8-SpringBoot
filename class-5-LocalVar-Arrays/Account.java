class Account{
    //instance var
    int acc_Id;
    String acc_Name;
    double acc_Bal;
    //static variable
   static  String branch_Name;
   static  String bank_Name;
   public static void main(String[] args) {
    Account a1=new Account();
    a1.acc_Id=101;
    a1.acc_Name="Rahul";
    a1.acc_Bal=45000.45;
    Account.bank_Name="SBI";

    Account a2=new Account();
   
    System.out.println(a1.acc_Id);  //0
    System.out.println(a1.bank_Name);//null
   }
}