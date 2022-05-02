package wzorceprojektowe.structural.abstractfactory.validators;

import wzorceprojektowe.structural.abstractfactory.creditcards.CreditCard;

public interface Validator {
	public boolean isValid(CreditCard creditCard);
}
