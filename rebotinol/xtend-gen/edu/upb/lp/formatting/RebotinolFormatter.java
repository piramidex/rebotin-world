/**
 * @author: Alexis Marechal
 */
package edu.upb.lp.formatting;

import com.google.inject.Inject;
import edu.upb.lp.services.RebotinolGrammarAccess;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.formatting.impl.FormattingConfig.LinewrapLocator;
import org.eclipse.xtext.formatting.impl.FormattingConfig.NoLinewrapLocator;
import org.eclipse.xtext.formatting.impl.FormattingConfig.NoSpaceLocator;
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
  
  protected void configureFormatting(final FormattingConfig c) {
    c.setAutoLinewrap(120);
    LinewrapLocator _setLinewrap = c.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = this._rebotinolGrammarAccess.getSL_COMMENTRule();
    _setLinewrap.before(_sL_COMMENTRule);
    LinewrapLocator _setLinewrap_1 = c.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = this._rebotinolGrammarAccess.getML_COMMENTRule();
    _setLinewrap_1.before(_mL_COMMENTRule);
    LinewrapLocator _setLinewrap_2 = c.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = this._rebotinolGrammarAccess.getML_COMMENTRule();
    _setLinewrap_2.after(_mL_COMMENTRule_1);
    List<Keyword> _findKeywords = this._rebotinolGrammarAccess.findKeywords(";");
    for (final Keyword semicolon : _findKeywords) {
      {
        NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(semicolon);
        NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(semicolon);
        LinewrapLocator _setLinewrap_3 = c.setLinewrap();
        _setLinewrap_3.after(semicolon);
      }
    }
    LinewrapLocator _setLinewrap_3 = c.setLinewrap();
    ParserRule _instructionRule = this._rebotinolGrammarAccess.getInstructionRule();
    _setLinewrap_3.before(_instructionRule);
    LinewrapLocator _setLinewrap_4 = c.setLinewrap();
    ParserRule _instructionRule_1 = this._rebotinolGrammarAccess.getInstructionRule();
    _setLinewrap_4.after(_instructionRule_1);
    List<Pair<Keyword,Keyword>> _findKeywordPairs = this._rebotinolGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword,Keyword> pair : _findKeywordPairs) {
      {
        Keyword _first = pair.getFirst();
        Keyword _second = pair.getSecond();
        c.setIndentation(_first, _second);
        NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        Keyword _first_1 = pair.getFirst();
        _setNoLinewrap.before(_first_1);
        LinewrapLocator _setLinewrap_5 = c.setLinewrap();
        Keyword _first_2 = pair.getFirst();
        _setLinewrap_5.after(_first_2);
        LinewrapLocator _setLinewrap_6 = c.setLinewrap();
        Keyword _second_1 = pair.getSecond();
        _setLinewrap_6.before(_second_1);
        LinewrapLocator _setLinewrap_7 = c.setLinewrap();
        Keyword _second_2 = pair.getSecond();
        _setLinewrap_7.after(_second_2);
      }
    }
  }
}
