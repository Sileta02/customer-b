public class BankAccount {

     private String AccountNo;
    double balance;
    public void deposit(){
        System.out.println("Depositing...");
    }
    public String getAccountNo(){
        return this.AccountNo;
    }
    public void setAccountNo(String AccountNo){
        this.AccountNo=AccountNo;
    }
}
       class  SavingAccount {
        public static void main(String[] args) {
            BankAccount acc_1Account=new BankAccount();
            
            acc_1Account.getAccountNo();
            
            acc_1Account.setAccountNo("0011232");
        
            
            
        }
    
        
    }
