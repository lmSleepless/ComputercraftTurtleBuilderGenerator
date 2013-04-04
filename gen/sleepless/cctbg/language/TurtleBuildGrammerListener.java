// Generated from E:\Development\eclipseWorkspace\ComputercraftTurtleBuilderGenerator\src/sleepless/cctbg/language/TurtleBuildGrammer.g4 by ANTLR 4.0

package sleepless.cctbg.language;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TurtleBuildGrammerListener extends ParseTreeListener {
	void enterBuilddir(TurtleBuildGrammerParser.BuilddirContext ctx);
	void exitBuilddir(TurtleBuildGrammerParser.BuilddirContext ctx);

	void enterProg(TurtleBuildGrammerParser.ProgContext ctx);
	void exitProg(TurtleBuildGrammerParser.ProgContext ctx);

	void enterBuild_set(TurtleBuildGrammerParser.Build_setContext ctx);
	void exitBuild_set(TurtleBuildGrammerParser.Build_setContext ctx);

	void enterRepeat_iterations(TurtleBuildGrammerParser.Repeat_iterationsContext ctx);
	void exitRepeat_iterations(TurtleBuildGrammerParser.Repeat_iterationsContext ctx);

	void enterDatadict_decl_list(TurtleBuildGrammerParser.Datadict_decl_listContext ctx);
	void exitDatadict_decl_list(TurtleBuildGrammerParser.Datadict_decl_listContext ctx);

	void enterDatadict_block(TurtleBuildGrammerParser.Datadict_blockContext ctx);
	void exitDatadict_block(TurtleBuildGrammerParser.Datadict_blockContext ctx);

	void enterGen_expr(TurtleBuildGrammerParser.Gen_exprContext ctx);
	void exitGen_expr(TurtleBuildGrammerParser.Gen_exprContext ctx);

	void enterRepeat(TurtleBuildGrammerParser.RepeatContext ctx);
	void exitRepeat(TurtleBuildGrammerParser.RepeatContext ctx);

	void enterBlock_meaning(TurtleBuildGrammerParser.Block_meaningContext ctx);
	void exitBlock_meaning(TurtleBuildGrammerParser.Block_meaningContext ctx);

	void enterBlock_symbol(TurtleBuildGrammerParser.Block_symbolContext ctx);
	void exitBlock_symbol(TurtleBuildGrammerParser.Block_symbolContext ctx);

	void enterBuilddir_opt(TurtleBuildGrammerParser.Builddir_optContext ctx);
	void exitBuilddir_opt(TurtleBuildGrammerParser.Builddir_optContext ctx);

	void enterRepeat_expr(TurtleBuildGrammerParser.Repeat_exprContext ctx);
	void exitRepeat_expr(TurtleBuildGrammerParser.Repeat_exprContext ctx);

	void enterDatadict_decl(TurtleBuildGrammerParser.Datadict_declContext ctx);
	void exitDatadict_decl(TurtleBuildGrammerParser.Datadict_declContext ctx);

	void enterBuild_set_item(TurtleBuildGrammerParser.Build_set_itemContext ctx);
	void exitBuild_set_item(TurtleBuildGrammerParser.Build_set_itemContext ctx);
}