	public static void drawRect(int par1, int par2, int par3, int par4, int par5) {
  		if ((mc.inGameHasFocus || (mc.currentScreen != null && (mc.currentScreen instanceof GuiChat))) && !mc.gameSettings.showDebugInfo)
	    {
  	    int j1;

  	    if (par1 < par3)
  	    {
  	        j1 = par1;
  	      par1 = par3;
  	      par3 = j1;
  	    }

  	    if (par2 < par4)
  	    {
  	        j1 = par2;
  	        par2 = par4;
  	      par4 = j1;
  	    }

  	    float f3 = (float)(par5 >> 24 & 255) / 255.0F;
  	    float f = (float)(par5 >> 16 & 255) / 255.0F;
  	    float f1 = (float)(par5 >> 8 & 255) / 255.0F;
  	    float f2 = (float)(par5 & 255) / 255.0F;
  	    Tessellator tessellator = Tessellator.instance;
  	    GL11.glEnable(GL11.GL_BLEND);
  	    GL11.glDisable(GL11.GL_TEXTURE_2D);
  	    OpenGlHelper.glBlendFunc(770, 771, 1, 0);
  	    GL11.glColor4f(f, f1, f2, f3);
  	    tessellator.startDrawingQuads();
  	    tessellator.addVertex((double)par1, (double)par4, 0.0D);
  	    tessellator.addVertex((double)par3, (double)par4, 0.0D);
  	    tessellator.addVertex((double)par3, (double)par2, 0.0D);
  	    tessellator.addVertex((double)par1, (double)par2, 0.0D);
  	    tessellator.draw();  
  	    GL11.glEnable(GL11.GL_TEXTURE_2D);
  	    GL11.glDisable(GL11.GL_BLEND);
  	}	
}
  	public static void drawBorderedRect(int x, int y, int x1, int y1, int size, int borderC, int insideC)
  	{
  	drawRect(x + size, y + size, x1 - size, y1 - size, insideC);
  	drawRect(x + size, y + size, x1, y, borderC);
  	drawRect(x, y, x + size, y1 - 1, borderC);
  	drawRect(x1, y1 - 1, x1 - size, y + size, borderC);
  	drawRect(x, y1 - size, x1, y1, borderC);
  	}
