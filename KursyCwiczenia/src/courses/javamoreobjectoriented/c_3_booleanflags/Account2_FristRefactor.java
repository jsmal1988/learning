package courses.javamoreobjectoriented.c_3_booleanflags;

import java.math.BigDecimal;

public class Account2_FristRefactor {
	private boolean isVerified;
	private boolean isClosed;
	private BigDecimal balance;

	private AccountUnfrozen onUnfrozen;
	private EnsureUnfrozen ensureUnfrozen;

	public Account2_FristRefactor(AccountUnfrozen onUnfrozen) {
		this.balance = BigDecimal.ZERO;
		this.onUnfrozen = onUnfrozen;
		this.ensureUnfrozen = this::stayUnfrozen;
	}

	public void holderVerified() {
		this.isVerified = true;
	}

	public void closeAccount() {
		this.isClosed = true;
	}

	public void freezeAccount() {
		if (this.isClosed) {
			return;
		}
		if (!this.isVerified) {
			return;
		}
		this.ensureUnfrozen = this::unfreeze;
	}

	public void deposit(BigDecimal amount) {
		if (this.isClosed) {
			return;
		}
		this.ensureUnfrozen.execute();

		this.balance = this.balance.add(amount);
	}

	public void withdraw(BigDecimal amount) {
		if (!this.isVerified) {
			return;
		}
		if (this.isClosed) {
			return;
		}
		this.ensureUnfrozen.execute();
		this.balance = this.balance.subtract(amount);
	}



	private void unfreeze() {
		this.onUnfrozen.handle();
		this.ensureUnfrozen = this::stayUnfrozen;
	}

	public void stayUnfrozen() {

	}

}
