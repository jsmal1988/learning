package courses.javamoreobjectoriented.c_3_booleanflags;

import java.math.BigDecimal;

import courses.javamoreobjectoriented.c_3_booleanflags.states.AccountState;
import courses.javamoreobjectoriented.c_3_booleanflags.states.Active;

public class Account4_ThirdRefactor2 {
	private BigDecimal balance;
	private AccountState state;


	public Account4_ThirdRefactor2(AccountUnfrozen onUnfrozen) {
		this.balance = BigDecimal.ZERO;
		this.state = new Active(onUnfrozen);
	}

	public void holderVerified() {
		this.state = this.state.holderVerified();
	}

	public void closeAccount() {
		this.state = this.state.closeAccount();
	}

	public void freezeAccount() {
		this.state = this.state.freezeAccount();
	}

	public void deposit(BigDecimal amount) {
		this.state = this.state.deposit(amount, this::addToBalance);
	}

	public void withdraw(BigDecimal amount) {
		this.state = this.state.withdraw(this.balance, amount, this::substractFromBalance);
	}

	private void addToBalance(BigDecimal amount) {
		this.balance = this.balance.add(amount);
	}
	
	private void substractFromBalance(BigDecimal amount) {
		this.balance = this.balance.subtract(amount);
		
	}
}
