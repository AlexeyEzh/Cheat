public class Bright {
	
	public static boolean Bright = false;
	
	public static void Enable(){
		float[] bright = Minecraft.getMinecraft().theWorld.provider.lightBrightnessTable;
		
		for(int i = 0; i < bright.length; i++){
			bright[i] = 1.0F;
		}
	}
	
	public static void Disable(){
		Minecraft.getMinecraft().theWorld.provider.registerWorld(Minecraft.getMinecraft().theWorld);
	}
}
