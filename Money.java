public class Money {
    private long dollars; 
    private long cents;  

    
    public Money(double amount) {
        this.dollars = (long) amount; 
        this.cents = Math.round((amount - this.dollars) * 100); 
    }

    
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    
    public Money add(Money otherAmount) {
        long newDollars = this.dollars + otherAmount.dollars;
        long newCents = this.cents + otherAmount.cents;

        
        if (newCents >= 100) {
            newDollars += newCents / 100;
            newCents = newCents % 100;
        }
        
        return new Money(newDollars + newCents / 100.0); 
    }

    
    public Money subtract(Money otherAmount) {
        long totalCentsThis = this.dollars * 100 + this.cents;
        long totalCentsOther = otherAmount.dollars * 100 + otherAmount.cents;
        long resultCents = totalCentsThis - totalCentsOther;

        
        if (resultCents < 0) {
            return new Money(0); 
        }

        long newDollars = resultCents / 100;
        long newCents = resultCents % 100;
        
        return new Money(newDollars + newCents / 100.0); 
    }

   
    public int compareTo(Money otherObject) {
        long totalCentsThis = this.dollars * 100 + this.cents;
        long totalCentsOther = otherObject.dollars * 100 + otherObject.cents;

        return Long.compare(totalCentsThis, totalCentsOther);
    }

    
    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}

