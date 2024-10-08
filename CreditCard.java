public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);

    }

    public Money getBalance(){
        return new Money(balance);
    }

    public Money getCreditLimit(){
        return new Money(creditLimit);
    }

    public String getPersonals(){
        return owner.toString();
    }

    public void charge(Money amount){
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) > 0) {
            System.out.println("Charge exceeds credit limit");
        } else {
            balance = newBalance;
            System.out.println("Charged: " + amount + ", New Balance: ");
        }
        
    }

    public void payment(Money amount) {
        Money newBalance = balance.subtract(amount);
        balance = newBalance;
        System.out.println("Payment: " + amount + ", New balance: " + balance);
    }
}
