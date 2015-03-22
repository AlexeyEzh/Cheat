	
	public class Xray
{

	public static boolean Xray = false;
	public static ArrayList<Block> xrayBlocks = new ArrayList<Block>();

	public static void Enable(){
		Minecraft.getMinecraft().renderGlobal.loadRenderers();
	}
	public static void Disable(){
		Minecraft.getMinecraft().renderGlobal.loadRenderers();
	}
	public static boolean isXrayBlock(Block blockToCheck)
	{
		if(xrayBlocks.contains(blockToCheck))
		{
			return true;
		}
			return false;
	}
}
