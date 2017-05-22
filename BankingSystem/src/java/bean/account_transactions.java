
package bean;

public class account_transactions {
    private String Date;
    private String Description;
    private String ChequeNo;
    private double withdraw;
    private double deposit;
    private double availablebalance;
    private String accountNo;
    private String depositaccountNo;
    private String withdrawaccountNo;
    private int SINo;

    public int getSINo() {
        return SINo;
    }

    public void setSINo(int SINo) {
        this.SINo = SINo;
    }

    public String getDepositaccountNo() {
        return depositaccountNo;
    }

    public void setDepositaccountNo(String depositaccountNo) {
        this.depositaccountNo = depositaccountNo;
    }

    public String getWithdrawaccountNo() {
        return withdrawaccountNo;
    }

    public void setWithdrawaccountNo(String withdrawaccountNo) {
        this.withdrawaccountNo = withdrawaccountNo;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getChequeNo() {
        return ChequeNo;
    }

    public void setChequeNo(String ChequeNo) {
        this.ChequeNo = ChequeNo;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getAvailablebalance() {
        return availablebalance;
    }

    public void setAvailablebalance(double availablebalance) {
        this.availablebalance = availablebalance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    
    
}
