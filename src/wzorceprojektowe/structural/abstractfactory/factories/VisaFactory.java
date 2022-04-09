package wzorceprojektowe.structural.abstractfactory.factories;

import wzorceprojektowe.structural.abstractfactory.creditcards.CardType;
import wzorceprojektowe.structural.abstractfactory.creditcards.CreditCard;
import wzorceprojektowe.structural.abstractfactory.creditcards.VisaBlackCreditCard;
import wzorceprojektowe.structural.abstractfactory.creditcards.VisaGoldCreditCard;
import wzorceprojektowe.structural.abstractfactory.validators.Validator;
import wzorceprojektowe.structural.abstractfactory.validators.VisaValidator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				
				return new VisaGoldCreditCard();
	
			case PLATINUM:
				
				return new VisaBlackCreditCard();	
			
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
