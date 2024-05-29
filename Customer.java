public class Customer {
    
    // create methods
    public void deposit(){
        System.out.println("Dear "+accountName+" Enter Amount to Deposit"  );
    }

public void withdraw(){
    System.out.println("Dear "+ accountName + " Enter Amount to withdraw");
}

public void checkBalance(int amount){
    System.out.println("Dear "+ accountName+" Your account Balance is - "+amount);
}

public void renewaccount(){
    System.out.println("Dear "+accountName+" You have successfully Renewed your Account");
}

    //attributes
     String accountName;
    String accountNumber;
    String address;
    String phoneNumber;
     

    //Constuctor
    public Customer(String accountName,String accountNumber,String address,String phoneNumber){
this.accountName=accountName;
this.accountNumber=accountNumber;
this.address=address;
this.phoneNumber=phoneNumber;

    }
    // Objects
    public static void main(String[] args) {
        Customer localCustomer = new Customer("Edward Kirui", "KCB 000080000", "P.O.Box 0100-Nairobi", "070000007");
        localCustomer.deposit();
        localCustomer.withdraw();
        localCustomer.checkBalance(300);
        localCustomer.renewaccount();
        
        Customer internationalCustomer=new Customer("Venus", "KCB", "P.O.Box 100-080" , "078988888");
internationalCustomer.deposit();
internationalCustomer.withdraw();
internationalCustomer.checkBalance(500);
internationalCustomer.renewaccount();
        }
        
    }
    
    
    
        
    


    

