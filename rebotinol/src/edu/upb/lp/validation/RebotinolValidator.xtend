/*
 * generated by Xtext
 */
package edu.upb.lp.validation

import edu.upb.lp.rebotinol.RebotinolPackage
import org.eclipse.xtext.validation.Check
import edu.upb.lp.rebotinol.Fraction

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class RebotinolValidator extends AbstractRebotinolValidator {
	@Check
	def checkFractionsDenominators(Fraction fr) {
		if (fr.denominator == 0) {
			error (
				"Una fracción no puede tener un denominador nulo",
				RebotinolPackage.Literals.FRACTION__DENOMINATOR);
		}
	}
}
