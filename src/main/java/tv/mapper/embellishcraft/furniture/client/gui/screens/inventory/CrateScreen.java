package tv.mapper.embellishcraft.furniture.client.gui.screens.inventory;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.MenuAccess;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import tv.mapper.embellishcraft.core.ECConstants;
import tv.mapper.embellishcraft.furniture.world.inventory.CrateContainer;

public class CrateScreen extends AbstractContainerScreen<CrateContainer> implements MenuAccess<CrateContainer>
{
    private static final ResourceLocation CRATE_SCREEN = new ResourceLocation(ECConstants.MODID, "textures/gui/crate.png");
    private final int inventoryRows;

    private static final int WIDTH = 176;
    private static final int HEIGHT = 185;

    public CrateScreen(CrateContainer p_i51095_1_, Inventory p_i51095_2_, Component p_i51095_3_)
    {
        super(p_i51095_1_, p_i51095_2_, p_i51095_3_);
//        this.passEvents = false;  // @todo 1.20
        this.inventoryRows = p_i51095_1_.getNumRows();
        this.imageHeight = 114 + this.inventoryRows * 18;
    }

    protected void init()
    {
        super.init();

        leftPos = this.width / 2 - WIDTH / 2;
        topPos = this.height / 2 - HEIGHT / 2;
    }

    public void render(GuiGraphics graphics, int p_render_1_, int p_render_2_, float p_render_3_)
    {
        this.renderBackground(graphics);
        super.render(graphics, p_render_1_, p_render_2_, p_render_3_);
        this.renderTooltip(graphics, p_render_1_, p_render_2_);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    @Override
    protected void renderLabels(GuiGraphics graphics, int mouseX, int mouseY)
    {
        graphics.drawString(minecraft.font, this.title, 8, 6, 4210752);
        //TODO this.font.draw(stack, this.inventory.getDisplayName().getString(), 8.0F, (float)(this.imageHeight - 96 + 2), 4210752);
    }

    /**
     * Draws the background layer of this container (behind the items).
     */
    @Override
    protected void renderBg(GuiGraphics graphics, float partialTicks, int mouseX, int mouseY)
    {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, CRATE_SCREEN);
        graphics.blit(TextureAtlas.LOCATION_BLOCKS, leftPos, topPos, 0, 0, WIDTH, HEIGHT);
    }
}