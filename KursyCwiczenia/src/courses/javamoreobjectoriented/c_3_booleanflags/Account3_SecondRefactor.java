/*
 * package courses.javamoreobjectoriented.c_3_booleanflags;
 * 
 * import java.math.BigDecimal;
 * 
 * import courses.javamoreobjectoriented.c_3_booleanflags.states.AccountState;
 * import courses.javamoreobjectoriented.c_3_booleanflags.states.Active;
 * 
 * public class Account3_SecondRefactor { private boolean isVerified; private
 * boolean isClosed; private BigDecimal balance; private AccountState freezable;
 * 
 * 
 * public Account3_SecondRefactor(AccountUnfrozen onUnfrozen) { this.balance =
 * BigDecimal.ZERO; this.freezable = new Active(onUnfrozen); }
 * 
 * public void holderVerified() { this.isVerified = true; }
 * 
 * public void closeAccount() { this.isClosed = true; }
 * 
 * public void freezeAccount() { if (this.isClosed) { return; } if
 * (!this.isVerified) { return; } this.freezable =
 * this.freezable.freezeAccount(); }
 * 
 * public void deposit(BigDecimal amount) { if (this.isClosed) { return; }
 * this.freezable = this.freezable.deposit();
 * 
 * this.balance = this.balance.add(amount); }
 * 
 * public void withdraw(BigDecimal amount) { if (!this.isVerified) { return; }
 * if (this.isClosed) { return; } this.freezable = this.freezable.withdraw();
 * this.balance = this.balance.subtract(amount); } }
 */