package sleepless.cctbg.language;

import java.io.File;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;


public class LanguageTest {

	public static void main(String[] args) throws Exception {
		File f = new File(args[0]);
		TurtleBuildGrammerLexer lexer = new TurtleBuildGrammerLexer(new ANTLRFileStream(f.getAbsolutePath()));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TurtleBuildGrammerParser p = new TurtleBuildGrammerParser(tokens);
		p.setBuildParseTree(true);
		ParseTree tree = p.prog();
		testVisitor visitor = new testVisitor();
		visitor.visit(tree);
	}
}
