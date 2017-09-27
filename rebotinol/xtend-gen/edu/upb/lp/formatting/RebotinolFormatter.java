/**
 * @author: Alexis Marechal
 */
package edu.upb.lp.formatting;

import com.google.inject.Inject;
import edu.upb.lp.services.RebotinolGrammarAccess;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * @author: Alexis Marechal
 */
@SuppressWarnings("all")
public class RebotinolFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private RebotinolGrammarAccess _rebotinolGrammarAccess;
  
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    c.setAutoLinewrap(120);
    c.setLinewrap(0, 1, 2).before(this._rebotinolGrammarAccess.getSL_COMMENTRule());
    c.setLinewrap(0, 1, 2).before(this._rebotinolGrammarAccess.getML_COMMENTRule());
    c.setLinewrap(0, 1, 1).after(this._rebotinolGrammarAccess.getML_COMMENTRule());
    List<Keyword> _findKeywords = this._rebotinolGrammarAccess.findKeywords(";");
    for (final Keyword semicolon : _findKeywords) {
      {
        c.setNoLinewrap().before(semicolon);
        c.setNoSpace().before(semicolon);
        c.setLinewrap().after(semicolon);
      }
    }
    c.setLinewrap().before(this._rebotinolGrammarAccess.getInstructionRule());
    c.setLinewrap().after(this._rebotinolGrammarAccess.getInstructionRule());
    List<Pair<Keyword, Keyword>> _findKeywordPairs = this._rebotinolGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword, Keyword> pair : _findKeywordPairs) {
      {
        c.setIndentation(pair.getFirst(), pair.getSecond());
        c.setNoLinewrap().before(pair.getFirst());
        c.setLinewrap().after(pair.getFirst());
        c.setLinewrap().before(pair.getSecond());
        c.setLinewrap().after(pair.getSecond());
      }
    }
  }
}
