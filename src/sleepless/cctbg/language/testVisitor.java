package sleepless.cctbg.language;


public class testVisitor extends TurtleBuildGrammerBaseVisitor<TurtleGenerationData>
{
	private TurtleGenerationData data;
	
	public testVisitor()
	{
		data = new TurtleGenerationData();
	}
	
	@Override
	public TurtleGenerationData visitProg(TurtleBuildGrammerParser.ProgContext ctx)
	{
		System.out.println("Visting Prog Node");
		return data;
	}
}