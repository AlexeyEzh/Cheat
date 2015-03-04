	 
Menu

public static void Menu(){	 
	  if ((mc.inGameHasFocus || (mc.currentScreen != null && (mc.currentScreen instanceof GuiChat))) && !mc.gameSettings.showDebugInfo)
		    {
	   ScaledResolution res = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
	   FontRenderer fontRender = mc.fontRenderer;
	   int width = res.getScaledWidth();
	   int height = res.getScaledHeight();
	   
	   }
	   }
	   
RenderHandler

public static RenderHandler instance = new RenderHandler();
private static Minecraft mc = Minecraft.getMinecraft();
@SubscribeEvent
public void RenderGameOverlayEvent(net.minecraftforge.client.event.RenderGameOverlayEvent event) {

// рендер 
if (event.type == RenderGameOverlayEvent.ElementType.TEXT) {
}
}
