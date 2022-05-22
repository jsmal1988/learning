package courses.javamoreobjectoriented.d_4_javaaliasing;

import java.math.BigDecimal;
import java.util.Hashtable;

public final class Currency implements Comparable<Currency> {
    private String symbol;

    @Override
    public boolean equals(Object other) {
        return other instanceof Currency && this.equals((Currency)other);
    }

    private boolean equals(Currency other) {
        return this.symbol.equals(other.symbol);
    }

    @Override
    public int hashCode() {
        return this.symbol.hashCode();
    }

    public Currency(String symbol) {
        this.symbol = symbol;
    }

    public Money zero() {
        return new Money(BigDecimal.ZERO, this);
    }

    @Override
    public int compareTo(Currency other) {
        return this.symbol.compareTo(other.symbol);
    }

    @Override
    public String toString() { return this.symbol; }
}
