public class CreditCard {
    //Declare global variables and make them private
    private String name;
    private int accountNum;
    private int accountBalance;
    private int rewardPoints;
    private String nextDueDate;
    public void creditCard(){
        name = "Joe Smith";
        accountNum = 503576847;
        accountBalance = 2;
        nextDueDate = "05/13/2019";
        rewardPoints = 80;
    }
    public void creditCard(String newName){
        setAccountName(newName);
        accountNum = 200000;
        accountBalance = 100;
        rewardPoints = 20;
        nextDueDate = "01/31/20";
    }
    public void creditCard(String newName, int newAccountNum, int newAccountBalance, int newRewardPoints, String newDueDate){
        setAccountName(newName);
        setAccountNumber(newAccountNum);
        setAccountBalance(newAccountBalance);
        setRewardPoints(newRewardPoints);
        setDueDate(newDueDate);
    }
    public void setAccountName(String newName){
        if (newName == null){
            name = "Anonymous";
        }
        name = newName;
    }
    public String getAccountName(){
        return name;
    }
    public void setAccountNumber(int newAccountNum){
        if (newAccountNum <= 0){
            newAccountNum = 0;
        }
        accountNum = newAccountNum;
    }
    public int getAccountNumber(){
       if (accountNum >= 0){
           accountNum = accountNum;
           return accountNum;
       }
       return accountNum;
    }
    public void setAccountBalance(int newAccountBalance){
        int charge = newAccountBalance / 20;
        int interest = newAccountBalance / 100;
        int payment = newAccountBalance / 30;
        newAccountBalance = newAccountBalance - charge - interest - payment;
        if (newAccountBalance > 0){
            accountBalance = 0;
        }
        accountBalance = newAccountBalance;
    }
    public int getAccountBalance(){
        return accountBalance;
    }
    public void setDueDate(String newDueDate){
        if (newDueDate == null){
            nextDueDate = "01/01/20";
        }
        nextDueDate = newDueDate;
    }
    public String getDueDate(){
        return nextDueDate;
    }
    public void setRewardPoints(int newRewardPoints){
        if (newRewardPoints > 0){
            rewardPoints = 0;
        }
        rewardPoints = newRewardPoints;
    }
    public int getRewardPoints(){
        return rewardPoints;
    }
    public String toString(){
        return "Credit Card:" + 
                "\nAccount Name: " + getAccountName() + 
                "\nAccount Number: " + getAccountNumber() + 
                "\nAccount Balance: " + getAccountBalance() + 
                "\nNext Due Date: " + getDueDate() + 
                "\nReward Points: " + getRewardPoints();
    }
    
}
