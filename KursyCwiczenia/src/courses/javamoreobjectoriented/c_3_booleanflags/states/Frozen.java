package courses.javamoreobjectoriented.c_3_booleanflags.states;

import java.math.BigDecimal;
import java.util.function.Consumer;

import courses.javamoreobjectoriented.c_3_booleanflags.AccountUnfrozen;

public class Frozen implements AccountState{
	private AccountUnfrozen onUnfrozen;
	
	public Frozen(AccountUnfrozen onUnfrozen) {
		this.onUnfrozen = onUnfrozen;
	}
	

	private AccountState unfreeze() {
		this.onUnfrozen.handle();
		return new Active(this.onUnfrozen);
	}
	
	

	@Override
	public AccountState deposit(BigDecimal amount, Consumer<BigDecimal> addToBalance) {
		addToBalance.accept(amount);
		 return this.unfreeze();
	}


	@Override
	public AccountState withdraw(BigDecimal balance, BigDecimal amount, Consumer<BigDecimal> removFromBalance) {
		if(balance.compareTo(amount) >= 0) {
			removFromBalance.accept(amount);
		}
		 return this.unfreeze();
	}
	
	@Override
	public AccountState freezeAccount() {
		 this.onUnfrozen.handle();
	      return new Active(this.onUnfrozen);
		
	}

	@Override
	public AccountState holderVerified() {
		return this;
	}

	@Override
	public AccountState closeAccount() {
		return new Closed();
	}



}
