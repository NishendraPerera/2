package Account;
public class Account {
//     Account attributes *****************************************************
    private int Id;
    private int Type;
    private int HolderId;
    private double Balance;
    private double IntRate;
    private boolean IsActive = true;

//     Getters and Setters ****************************************************
    public int getId() {
        return this.Id;
    }

    public void setId(int newId) {
        this.Id = newId;
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int newType) {
        this.Type = newType;
    }

    public int getHolderId() {
        return this.HolderId;
    }

    public void setHolderId(int newHolderId) {
        this.HolderId = newHolderId;
    }

    public double getBalance() {
        return this.Balance;
    }

    public void setBalance(double newBalance) {
        this.Balance = newBalance;
    }

    public double getIntRate() {
        return this.IntRate;
    }

    public void setIntRate(double newIntRate) {
        this.IntRate = newIntRate;
    }

    public boolean getIsActive() {
        return this.IsActive;
    }

    public void setIsActive(boolean newValue) {
        this.IsActive = newValue;
    }

//     Other methods *********************************************************

    public void avaBalance() {
        double CurBalance = this.getBalance();
        System.out.println("Available Balance: " + CurBalance);
    }
    
    public void deposit(double Amount) {
        double CurBalance = this.getBalance();
        
        if(Amount > 0){
            double NewBalance = CurBalance + Amount;
            this.setBalance(NewBalance);
            System.out.println(Amount + " was credited to the account.");
            avaBalance();
        } else {
            System.out.println("There has been an eror!");
        }
    }
    
    public void withdraw(double Amount) {
        double CurBalance = this.getBalance();
        
        if(Amount > 0 && Amount < CurBalance){
            double NewBalance = CurBalance - Amount;
            this.setBalance(NewBalance);
            System.out.println(Amount + " was debited to the account.");
            avaBalance();
        } else {
            System.out.println("There has been an eror!");
        }
    }
    
    public void calcInterest(){
        double IntRate = this.getIntRate();
        double CurBalance = this.getBalance();
        double IntAmount = CurBalance * IntRate;
        double NewBalance = CurBalance + IntAmount;
        this.setBalance(NewBalance);
        System.out.println(IntAmount + " was credited as Interest.");
        avaBalance();
    }

//     Main method ***********************************************************
//    ________________________________________________________________________
    public static void main(String[] args) {
        
//        Create new Account object ******************************************
        Account newAccount = new Account();

//        Use the methods of the Account *************************************
            newAccount.deposit(12_000.00);
            newAccount.withdraw(4_000.00);
            
//            If the Interest Rate was 5.4% per 12 months ********************
            newAccount.setIntRate(0.054/12);
            newAccount.calcInterest();
    }
}