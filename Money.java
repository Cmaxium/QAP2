// Money.java
public class Money {
    private long dollars;
    private int cents;

    // Constructors
    public Money() {
        this.dollars = 0;
        this.cents = 0;
    }

    public Money(long dollars, int cents) {
        if (cents >= 100) {
            this.dollars = dollars + cents / 100;
            this.cents = cents % 100;
        } else {
            this.dollars = dollars;
            this.cents = cents;
        }
    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Getters
    public long getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    // Methods
    public Money add(Money other) {
        return new Money(this.dollars + other.dollars, this.cents + other.cents);
    }

    public Money subtract(Money other) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = other.dollars * 100 + other.cents;
        long diffCents = totalCents1 - totalCents2;

        return new Money(diffCents / 100, (int) (diffCents % 100));
    }

    public int compareTo(Money other) {
        if (this.dollars > other.dollars) {
            return 1;
        } else if (this.dollars < other.dollars) {
            return -1;
        } else {
            if (this.cents > other.cents) {
                return 1;
            } else if (this.cents < other.cents) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
