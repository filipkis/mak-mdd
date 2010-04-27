/*
* generated by Xtext
*/
package org.makumba.devel.plugin.eclipse.mdd.parser.antlr;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

import org.makumba.devel.plugin.eclipse.mdd.services.MDDGrammarAccess;

public class MDDParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MDDGrammarAccess grammarAccess;
	
	@Override
	protected IParseResult parse(String ruleName, ANTLRInputStream in) {
		TokenSource tokenSource = createLexer(in);
		XtextTokenStream tokenStream = createTokenStream(tokenSource);
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_FIELDCOMMENT");
		org.makumba.devel.plugin.eclipse.mdd.parser.antlr.internal.InternalMDDParser parser = createParser(tokenStream);
		parser.setTokenTypeMap(getTokenDefProvider().getTokenDefMap());
		parser.setSyntaxErrorProvider(getSyntaxErrorProvider());
		parser.setUnorderedGroupHelper(getUnorderedGroupHelper().get());
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(),re);
		}
	}
	
	protected org.makumba.devel.plugin.eclipse.mdd.parser.antlr.internal.InternalMDDParser createParser(XtextTokenStream stream) {
		return new org.makumba.devel.plugin.eclipse.mdd.parser.antlr.internal.InternalMDDParser(stream, getElementFactory(), getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "dataDefinition";
	}
	
	public MDDGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MDDGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}