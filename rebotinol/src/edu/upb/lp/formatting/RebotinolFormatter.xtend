/**
 * @author: Alexis Marechal
 */
package edu.upb.lp.formatting

import com.google.inject.Inject
import edu.upb.lp.services.RebotinolGrammarAccess
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.Keyword;

/**
 * @author: Alexis Marechal
 */
class RebotinolFormatter extends AbstractDeclarativeFormatter {

	@Inject extension RebotinolGrammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
		c.setAutoLinewrap(120);
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
		
		for(Keyword semicolon: findKeywords(";")) {
			c.setNoLinewrap().before(semicolon);
			c.setNoSpace().before(semicolon);
			c.setLinewrap().after(semicolon);
		}
		
		c.setLinewrap().before(instructionRule);
		c.setLinewrap().after(instructionRule);
		
		for (Pair<Keyword, Keyword> pair : findKeywordPairs("{", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setNoLinewrap().before(pair.getFirst());
			c.setLinewrap().after(pair.getFirst());
			c.setLinewrap().before(pair.getSecond());
			c.setLinewrap().after(pair.getSecond());
		}
	}
}
