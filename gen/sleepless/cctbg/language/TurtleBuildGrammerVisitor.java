// Generated from E:\Development\eclipseWorkspace\ComputercraftTurtleBuilderGenerator\src/sleepless/cctbg/language/TurtleBuildGrammer.g4 by ANTLR 4.0

package sleepless.cctbg.language;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TurtleBuildGrammerVisitor<T> extends ParseTreeVisitor<T> {
	T visitBuilddir(TurtleBuildGrammerParser.BuilddirContext ctx);

	T visitProg(TurtleBuildGrammerParser.ProgContext ctx);

	T visitBuild_set(TurtleBuildGrammerParser.Build_setContext ctx);

	T visitRepeat_iterations(TurtleBuildGrammerParser.Repeat_iterationsContext ctx);

	T visitDatadict_decl_list(TurtleBuildGrammerParser.Datadict_decl_listContext ctx);

	T visitDatadict_block(TurtleBuildGrammerParser.Datadict_blockContext ctx);

	T visitGen_expr(TurtleBuildGrammerParser.Gen_exprContext ctx);

	T visitRepeat(TurtleBuildGrammerParser.RepeatContext ctx);

	T visitBlock_meaning(TurtleBuildGrammerParser.Block_meaningContext ctx);

	T visitBlock_symbol(TurtleBuildGrammerParser.Block_symbolContext ctx);

	T visitBuilddir_opt(TurtleBuildGrammerParser.Builddir_optContext ctx);

	T visitRepeat_expr(TurtleBuildGrammerParser.Repeat_exprContext ctx);

	T visitDatadict_decl(TurtleBuildGrammerParser.Datadict_declContext ctx);

	T visitBuild_set_item(TurtleBuildGrammerParser.Build_set_itemContext ctx);
}