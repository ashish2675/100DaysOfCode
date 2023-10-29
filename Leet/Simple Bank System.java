//nt
class Bank {
    long[] balance;
    public Bank(long[] balance) {
        this.balance = balance;    
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if (account2 > balance.length || !withdraw(account1, money)) return false;
        return deposit(account2,money);
    }
    
    public boolean deposit(int account, long money) {
        if (account > balance.length) return false;
        balance[account-1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if (account > balance.length || balance[account-1] < money) return false;
        balance[account-1]-=money;
        return true;
    }
}
