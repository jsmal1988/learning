package courses.javamoreobjectoriented.c_3_booleanflags;

import java.math.BigDecimal;

//class modeling a money account which allows deposits and withdrawals
/*here we simulates code, when we add many flags to it, which causes that we have to add many if checks, to code
* which leds at the end to complicity of code, and also make lot of tests needed to handle simple behavior
* those flags can be added after time which will led to even bigger complicity of the code
*/
public class Account1_WithFlags {
	/*if verified then user can withdraw
	* if closed then user cannot deposit or withdraw
	* frozen can be done when account is not closed and is verified, 
	* if frozen  after deposit or withdraw it is not frozen anymore
	*/
	private boolean isVerified;
	private boolean isClosed;
	private boolean isFrozen;
	private BigDecimal balance;
	
	//interface which stores metod to handle unfrozen action
	private AccountUnfrozen onUnfrozen;
	
	public Account1_WithFlags(AccountUnfrozen onUnfrozen) {
		this.balance = BigDecimal.ZERO;
		this.onUnfrozen = onUnfrozen;
	}
	
	public void holderVerified() {
		this.isVerified = true;
	}
	
	public void closeAccount() {
		this.isClosed = true;
	}
	
	public void freezeAccount() {
		if(this.isClosed){
			return;
		}
		if(!this.isVerified) {
			return;
		}
		this.isFrozen = true;
	}
	
	public void deposit(BigDecimal amount) {
		if(this.isClosed) {
			return;
		}
		if(this.isFrozen) {
			this.isFrozen = false;
			this.onUnfrozen.handle();
		}
		
		this.balance = this.balance.add(amount);
	}

	public void withdraw(BigDecimal amount) {
		if(!this.isVerified) {
			return;
		}
		if(this.isClosed) {
			return;
		}
		if(this.isFrozen) {
			this.isFrozen = false;
			this.onUnfrozen.handle();
		}
		this.balance = this.balance.subtract(amount);
	}

}
