public class KeysBinding
{
  public static KeysBinding instance = new KeysBinding();
  public EntityRenderer entityRenderer;
  public GuiScreen currentScreen;
  public EntityPlayer player()
	{
		return Minecraft.getMinecraft().thePlayer;
	}
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
  public void onEvent(InputEvent.KeyInputEvent event)
  {
	  if (Keyboard.getEventKeyState())
      {
          if (Keyboard.getEventKey() == 62 && this.entityRenderer != null)
          {
              this.entityRenderer.deactivateShader();
          }

          if (this.currentScreen != null)
          {
              this.currentScreen.handleKeyboardInput();
          }
          else{
          //CODE
        }
     }
  }
}
FMLCommonHandler.instance().bus().register(new KeysBinding());
