package wzorceprojektowe.structural.abstractfactory.validators;

import wzorceprojektowe.structural.abstractfactory.creditcards.CreditCard;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
