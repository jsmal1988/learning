package courses.javamoreobjectoriented.c_3_booleanflags.states;

import java.math.BigDecimal;
import java.util.function.Consumer;

//this interface takes resposibility to define how state is change, by which methods
public interface AccountState {
	AccountState deposit(BigDecimal amount, Consumer<BigDecimal> addToBalance);

	AccountState withdraw(BigDecimal balance, BigDecimal amount, Consumer<BigDecimal> removFromBalance);

	AccountState freezeAccount();

	AccountState holderVerified();

	AccountState closeAccount();
}
