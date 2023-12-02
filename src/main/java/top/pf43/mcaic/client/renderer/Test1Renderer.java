
package top.pf43.mcaic.client.renderer;

import top.pf43.mcaic.entity.Test1Entity;
import top.pf43.mcaic.client.model.Modeltest;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class Test1Renderer extends MobRenderer<Test1Entity, Modeltest<Test1Entity>> {
	public Test1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeltest(context.bakeLayer(Modeltest.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Test1Entity entity) {
		return new ResourceLocation("mcaic:textures/entities/test1.png");
	}
}
