package wzorceprojektowe.structural.abstractfactory.factories;

import wzorceprojektowe.structural.abstractfactory.creditcards.CardType;
import wzorceprojektowe.structural.abstractfactory.creditcards.CreditCard;
import wzorceprojektowe.structural.abstractfactory.validators.Validator;

//AbstractFactory
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
	
		if(creditScore > 650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
		
	public abstract Validator getValidator(CardType cardType);
}
