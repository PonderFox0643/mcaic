// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelNoelrm extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer ear_r1;
	private final ModelRenderer ear_r2;
	private final ModelRenderer ear_r3;
	private final ModelRenderer ear_r4;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public ModelNoelrm() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.setTextureOffset(0, 57).addBox(-3.0F, -14.0F, -1.5F, 2.0F, 5.0F, 2.0F, -0.2F, false);
		Head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.3F, false);
		Head.setTextureOffset(0, 57).addBox(1.0F, -14.0F, -1.5F, 2.0F, 5.0F, 2.0F, -0.2F, false);

		ear_r1 = new ModelRenderer(this);
		ear_r1.setRotationPoint(4.0F, 0.0F, 0.0F);
		Head.addChild(ear_r1);
		setRotationAngle(ear_r1, 0.0F, 0.0F, -0.2618F);
		ear_r1.setTextureOffset(0, 57).addBox(0.5F, -14.0F, -2.0F, 2.0F, 5.0F, 2.0F, -0.2F, false);

		ear_r2 = new ModelRenderer(this);
		ear_r2.setRotationPoint(4.0F, 0.0F, 0.0F);
		Head.addChild(ear_r2);
		setRotationAngle(ear_r2, 0.0F, 0.0F, 0.2182F);
		ear_r2.setTextureOffset(0, 57).addBox(-6.0F, -13.0F, -2.0F, 2.0F, 5.0F, 2.0F, -0.2F, false);

		ear_r3 = new ModelRenderer(this);
		ear_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(ear_r3);
		setRotationAngle(ear_r3, 0.0F, 0.0F, -0.2618F);
		ear_r3.setTextureOffset(0, 57).addBox(0.5F, -14.0F, -2.0F, 2.0F, 5.0F, 2.0F, -0.2F, false);

		ear_r4 = new ModelRenderer(this);
		ear_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(ear_r4);
		setRotationAngle(ear_r4, 0.0F, 0.0F, 0.2182F);
		ear_r4.setTextureOffset(0, 57).addBox(-6.0F, -13.0F, -2.0F, 2.0F, 5.0F, 2.0F, -0.2F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(24, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 16.0F, 4.0F, 0.5F, false);
		Body.setTextureOffset(0, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 14.0F, 4.0F, 0.8F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(32, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArm.setTextureOffset(16, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(32, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArm.setTextureOffset(16, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		RightLeg.setTextureOffset(48, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.8F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		LeftLeg.setTextureOffset(48, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.8F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}