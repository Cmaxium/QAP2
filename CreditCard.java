// CreditCard.java
public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(); // initialized to zero
        this.creditLimit = new Money(creditLimit); // use copy constructor
    }

    // Accessor methods
    public Money getBalance() {
        return new Money(balance); // return a copy
    }

    public Money getCreditLimit() {
        return new Money(creditLimit); // return a copy
    }

    public String getPersonals() {
        return owner.toString();
    }

    // Charge method
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Payment method
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
