package wzorceprojektowe.structural.abstractfactory.factories;

import wzorceprojektowe.structural.abstractfactory.creditcards.AmexGoldCreditCard;
import wzorceprojektowe.structural.abstractfactory.creditcards.AmexPlatinumCreditCard;
import wzorceprojektowe.structural.abstractfactory.creditcards.CardType;
import wzorceprojektowe.structural.abstractfactory.creditcards.CreditCard;
import wzorceprojektowe.structural.abstractfactory.validators.AmexGoldValidator;
import wzorceprojektowe.structural.abstractfactory.validators.AmexPlatinumValidator;
import wzorceprojektowe.structural.abstractfactory.validators.Validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
	
			case PLATINUM:
				return new AmexPlatinumCreditCard();	
				
			default:
				break;
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				
				return new AmexGoldValidator();
	
			case PLATINUM:
				
				return new AmexPlatinumValidator();	
		
		}
		
		return null;
	}
}
