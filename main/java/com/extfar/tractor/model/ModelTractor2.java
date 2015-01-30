package com.extfar.tractor.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * TractorWPlow.tcn - TechneToTabulaImporter
 * Created using Tabula 4.1.1
 */
public class ModelTractor2 extends ModelBase {
    public ModelRenderer SeederPipe3;
    public ModelRenderer SeederPipe;
    public ModelRenderer SeederPipe2;
    public ModelRenderer BackAxis;
    public ModelRenderer LeftWheel4;
    public ModelRenderer LeftWheelCenter;
    public ModelRenderer RightWeel1;
    public ModelRenderer RightWheel2;
    public ModelRenderer RightWheel3;
    public ModelRenderer LeftWheel3;
    public ModelRenderer RightWheel4;
    public ModelRenderer LeftWheel2;
    public ModelRenderer RightWheelCenter;
    public ModelRenderer LeftWeel1;
    public ModelRenderer LeftPanel1;
    public ModelRenderer LeftPanel2;
    public ModelRenderer LeftPanel3;
    public ModelRenderer RightPanel1;
    public ModelRenderer RightPanel2;
    public ModelRenderer RightPanel3;
    public ModelRenderer Hood;
    public ModelRenderer WheelBar1;
    public ModelRenderer RightWheelConnector;
    public ModelRenderer WheelBar2;
    public ModelRenderer LeftWheelConnector;
    public ModelRenderer WheelBar3;
    public ModelRenderer FrontAxis;
    public ModelRenderer LeftWheelFront;
    public ModelRenderer RightWheelFront;
    public ModelRenderer Pipe1;
    public ModelRenderer Pipe2;
    public ModelRenderer LeftLampConnector;
    public ModelRenderer RigthLamp;
    public ModelRenderer LeftLampHolder;
    public ModelRenderer RightLampHolder;
    public ModelRenderer LeftLamp;
    public ModelRenderer RightLampConnector;
    public ModelRenderer Trekhaak1;
    public ModelRenderer Trekhaak2;
    public ModelRenderer Trekhaak3;
    public ModelRenderer AxisBlock1;
    public ModelRenderer SteeringWheel;
    public ModelRenderer SteeringPole;
    public ModelRenderer Floor;
    public ModelRenderer ChairBack;
    public ModelRenderer Chair;
    public ModelRenderer ChairPanel1;
    public ModelRenderer ChairPanel2;
    public ModelRenderer AxisBlock2;
    public ModelRenderer AxisConnect;
    public ModelRenderer SeederPotFloor;
    public ModelRenderer SeederPot;
    public ModelRenderer SeederPot2;
    public ModelRenderer SeederPot3;
    public ModelRenderer SeederConnector;
    public ModelRenderer SeederPot4;

    public ModelTractor2() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.LeftWheelCenter = new ModelRenderer(this, 182, 80);
        this.LeftWheelCenter.setRotationPoint(13.0F, 12.0F, 0.0F);
        this.LeftWheelCenter.addBox(0.0F, -7.0F, -7.0F, 4, 14, 14, 0.0F);
        this.WheelBar1 = new ModelRenderer(this, 0, 36);
        this.WheelBar1.setRotationPoint(-12.0F, 14.0F, -39.0F);
        this.WheelBar1.addBox(0.0F, 0.0F, 0.0F, 24, 1, 4, 0.0F);
        this.RightWheelFront = new ModelRenderer(this, 215, 40);
        this.RightWheelFront.setRotationPoint(-19.0F, 12.0F, -43.0F);
        this.RightWheelFront.addBox(0.0F, 0.0F, 0.0F, 6, 12, 12, 0.0F);
        this.RightPanel1 = new ModelRenderer(this, 0, 51);
        this.RightPanel1.setRotationPoint(-12.0F, -3.0F, -17.0F);
        this.RightPanel1.addBox(0.0F, 0.0F, 0.0F, 2, 16, 30, 0.0F);
        this.SeederPot3 = new ModelRenderer(this, 200, 131);
        this.SeederPot3.setRotationPoint(-8.0F, -2.0F, 31.0F);
        this.SeederPot3.addBox(0.0F, 0.0F, -16.0F, 1, 16, 16, 0.0F);
        this.RightLampHolder = new ModelRenderer(this, 0, 12);
        this.RightLampHolder.setRotationPoint(-13.0F, 3.0F, -41.0F);
        this.RightLampHolder.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        this.RightLampConnector = new ModelRenderer(this, 0, 5);
        this.RightLampConnector.setRotationPoint(-11.0F, 4.0F, -38.0F);
        this.RightLampConnector.addBox(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        this.AxisConnect = new ModelRenderer(this, 0, 221);
        this.AxisConnect.setRotationPoint(-1.5F, 11.5F, -11.0F);
        this.AxisConnect.addBox(0.0F, 0.0F, 0.0F, 3, 3, 9, 0.0F);
        this.SeederPot4 = new ModelRenderer(this, 200, 131);
        this.SeederPot4.setRotationPoint(7.0F, -2.0F, 31.0F);
        this.SeederPot4.addBox(0.0F, 0.0F, -16.0F, 1, 16, 16, 0.0F);
        this.SteeringWheel = new ModelRenderer(this, 134, 0);
        this.SteeringWheel.setRotationPoint(-3.0F, -3.0F, -8.0F);
        this.SteeringWheel.addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.setRotateAngle(SteeringWheel, -0.408965528011322F, -0.0F, 0.0F);
        this.Trekhaak2 = new ModelRenderer(this, 23, 207);
        this.Trekhaak2.setRotationPoint(-0.5F, 11.0F, 10.5F);
        this.Trekhaak2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.LeftWheel4 = new ModelRenderer(this, 182, 40);
        this.LeftWheel4.setRotationPoint(13.0F, 0.0F, -12.0F);
        this.LeftWheel4.addBox(0.0F, 0.0F, 0.0F, 8, 24, 5, 0.0F);
        this.Floor = new ModelRenderer(this, 59, 36);
        this.Floor.setRotationPoint(-11.0F, 11.0F, -12.0F);
        this.Floor.addBox(-1.0F, 0.0F, 0.0F, 22, 1, 3, 0.0F);
        this.RightWeel1 = new ModelRenderer(this, 182, 40);
        this.RightWeel1.setRotationPoint(-21.0F, 0.0F, 7.0F);
        this.RightWeel1.addBox(0.0F, 0.0F, 0.0F, 8, 24, 5, 0.0F);
        this.LeftLampConnector = new ModelRenderer(this, 14, 5);
        this.LeftLampConnector.setRotationPoint(8.0F, 4.0F, -38.0F);
        this.LeftLampConnector.addBox(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        this.LeftWheelFront = new ModelRenderer(this, 215, 40);
        this.LeftWheelFront.setRotationPoint(13.0F, 12.0F, -43.0F);
        this.LeftWheelFront.addBox(0.0F, 0.0F, 0.0F, 6, 12, 12, 0.0F);
        this.SeederPotFloor = new ModelRenderer(this, 186, 169);
        this.SeederPotFloor.setRotationPoint(-8.0F, 13.0F, 31.0F);
        this.SeederPotFloor.addBox(0.0F, 0.0F, -16.0F, 16, 1, 16, 0.0F);
        this.LeftWheel3 = new ModelRenderer(this, 182, 0);
        this.LeftWheel3.setRotationPoint(13.0F, 0.0F, -12.0F);
        this.LeftWheel3.addBox(0.0F, 0.0F, 0.0F, 8, 5, 24, 0.0F);
        this.ChairBack = new ModelRenderer(this, 200, 200);
        this.ChairBack.setRotationPoint(-6.5F, -1.0F, 8.0F);
        this.ChairBack.addBox(0.0F, 0.0F, 0.0F, 13, 2, 2, 0.0F);
        this.RightWheelConnector = new ModelRenderer(this, 0, 206);
        this.RightWheelConnector.setRotationPoint(-20.0F, 17.0F, -38.0F);
        this.RightWheelConnector.addBox(0.0F, 0.0F, 0.0F, 8, 2, 2, 0.0F);
        this.LeftLampHolder = new ModelRenderer(this, 15, 12);
        this.LeftLampHolder.setRotationPoint(9.0F, 3.0F, -41.0F);
        this.LeftLampHolder.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        this.LeftWeel1 = new ModelRenderer(this, 182, 40);
        this.LeftWeel1.setRotationPoint(13.0F, 0.0F, 7.0F);
        this.LeftWeel1.addBox(0.0F, 0.0F, 0.0F, 8, 24, 5, 0.0F);
        this.LeftWheel2 = new ModelRenderer(this, 182, 0);
        this.LeftWheel2.setRotationPoint(13.0F, 19.0F, -12.0F);
        this.LeftWheel2.addBox(0.0F, 0.0F, 0.0F, 8, 5, 24, 0.0F);
        this.Trekhaak1 = new ModelRenderer(this, 37, 216);
        this.Trekhaak1.setRotationPoint(-1.0F, 12.0F, 1.0F);
        this.Trekhaak1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 11, 0.0F);
        this.LeftLamp = new ModelRenderer(this, 33, 0);
        this.LeftLamp.setRotationPoint(10.0F, 4.0F, -42.0F);
        this.LeftLamp.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.ChairPanel1 = new ModelRenderer(this, 93, 0);
        this.ChairPanel1.setRotationPoint(4.0F, 2.0F, -1.0F);
        this.ChairPanel1.addBox(0.0F, 0.0F, 0.0F, 2, 8, 10, 0.0F);
        this.AxisBlock2 = new ModelRenderer(this, 29, 233);
        this.AxisBlock2.setRotationPoint(-1.0F, 8.0F, -4.0F);
        this.AxisBlock2.addBox(0.0F, 0.0F, 0.0F, 2, 8, 8, 0.0F);
        this.SeederConnector = new ModelRenderer(this, 200, 116);
        this.SeederConnector.setRotationPoint(-2.0F, 7.0F, 11.0F);
        this.SeederConnector.addBox(0.0F, 0.0F, 0.0F, 4, 4, 8, 0.0F);
        this.setRotateAngle(SeederConnector, -0.31869712141416456F, 0.0F, 0.0F);
        this.LeftWheelConnector = new ModelRenderer(this, 0, 206);
        this.LeftWheelConnector.setRotationPoint(12.0F, 17.0F, -38.0F);
        this.LeftWheelConnector.addBox(0.0F, 0.0F, 0.0F, 8, 2, 2, 0.0F);
        this.RightWheel3 = new ModelRenderer(this, 182, 0);
        this.RightWheel3.setRotationPoint(-13.0F, 12.0F, 0.0F);
        this.RightWheel3.addBox(-8.0F, -12.0F, -12.0F, 8, 5, 24, 0.0F);
        this.ChairPanel2 = new ModelRenderer(this, 63, 0);
        this.ChairPanel2.setRotationPoint(-6.0F, 2.0F, -1.0F);
        this.ChairPanel2.addBox(0.0F, 0.0F, 0.0F, 2, 8, 10, 0.0F);
        this.BackAxis = new ModelRenderer(this, 30, 205);
        this.BackAxis.setRotationPoint(-18.0F, 10.0F, -2.0F);
        this.BackAxis.addBox(0.0F, 0.0F, 0.0F, 36, 4, 4, 0.0F);
        this.RightWheel4 = new ModelRenderer(this, 182, 40);
        this.RightWheel4.setRotationPoint(-21.0F, 0.0F, -12.0F);
        this.RightWheel4.addBox(0.0F, 0.0F, 0.0F, 8, 24, 5, 0.0F);
        this.Chair = new ModelRenderer(this, 200, 210);
        this.Chair.setRotationPoint(-6.5F, 1.0F, -1.0F);
        this.Chair.addBox(0.0F, 0.0F, 0.0F, 13, 1, 11, 0.0F);
        this.SeederPipe = new ModelRenderer(this, 180, 167);
        this.SeederPipe.setRotationPoint(-2.0F, 13.0F, 21.0F);
        this.SeederPipe.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
        this.RightPanel2 = new ModelRenderer(this, 0, 100);
        this.RightPanel2.setRotationPoint(-13.0F, -3.0F, -17.0F);
        this.RightPanel2.addBox(-10.0F, 0.0F, 0.0F, 13, 2, 30, 0.0F);
        this.Trekhaak3 = new ModelRenderer(this, 67, 217);
        this.Trekhaak3.setRotationPoint(-1.0F, 9.0F, 10.0F);
        this.Trekhaak3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.WheelBar2 = new ModelRenderer(this, 0, 23);
        this.WheelBar2.setRotationPoint(-12.0F, 14.0F, -39.0F);
        this.WheelBar2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
        this.RightPanel3 = new ModelRenderer(this, 25, 150);
        this.RightPanel3.setRotationPoint(-23.0F, -3.0F, -17.0F);
        this.RightPanel3.addBox(0.0F, 0.0F, 0.0F, 13, 16, 2, 0.0F);
        this.SeederPot2 = new ModelRenderer(this, 200, 131);
        this.SeederPot2.setRotationPoint(-8.0F, -2.0F, 30.0F);
        this.SeederPot2.addBox(0.0F, 0.0F, 0.0F, 16, 16, 1, 0.0F);
        this.AxisBlock1 = new ModelRenderer(this, 0, 232);
        this.AxisBlock1.setRotationPoint(-3.0F, 9.0F, -3.0F);
        this.AxisBlock1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.Hood = new ModelRenderer(this, 39, 138);
        this.Hood.setRotationPoint(-8.0F, 0.0F, -8.0F);
        this.Hood.addBox(0.0F, 0.0F, -34.0F, 16, 14, 34, 0.0F);
        this.Pipe2 = new ModelRenderer(this, 16, 215);
        this.Pipe2.setRotationPoint(7.5F, -11.0F, -30.0F);
        this.Pipe2.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F);
        this.WheelBar3 = new ModelRenderer(this, 13, 22);
        this.WheelBar3.setRotationPoint(11.0F, 14.0F, -39.0F);
        this.WheelBar3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
        this.RightWheelCenter = new ModelRenderer(this, 182, 80);
        this.RightWheelCenter.setRotationPoint(-13.0F, 12.0F, 0.0F);
        this.RightWheelCenter.addBox(-4.0F, -7.0F, -7.0F, 4, 14, 14, 0.0F);
        this.SeederPipe3 = new ModelRenderer(this, 0, 200);
        this.SeederPipe3.setRotationPoint(0.0F, 20.7F, 22.5F);
        this.SeederPipe3.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        this.FrontAxis = new ModelRenderer(this, 0, 200);
        this.FrontAxis.setRotationPoint(-14.0F, 17.5F, -37.5F);
        this.FrontAxis.addBox(0.0F, 0.0F, 0.0F, 28, 1, 1, 0.0F);
        this.SteeringPole = new ModelRenderer(this, 26, 215);
        this.SteeringPole.setRotationPoint(-1.0F, -2.0F, -6.0F);
        this.SteeringPole.addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(SteeringPole, -0.40896472334861755F, -0.0F, 0.0F);
        this.LeftPanel2 = new ModelRenderer(this, 93, 99);
        this.LeftPanel2.setRotationPoint(20.0F, -3.0F, -17.0F);
        this.LeftPanel2.addBox(-10.0F, 0.0F, 0.0F, 13, 2, 30, 0.0F);
        this.Pipe1 = new ModelRenderer(this, 0, 214);
        this.Pipe1.setRotationPoint(6.5F, -3.0F, -31.0F);
        this.Pipe1.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.RightWheel2 = new ModelRenderer(this, 182, 0);
        this.RightWheel2.setRotationPoint(-21.0F, 19.0F, -12.0F);
        this.RightWheel2.addBox(0.0F, 0.0F, 0.0F, 8, 5, 24, 0.0F);
        this.SeederPipe2 = new ModelRenderer(this, 0, 200);
        this.SeederPipe2.setRotationPoint(-0.5F, 17.7F, 22.5F);
        this.SeederPipe2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.SeederPot = new ModelRenderer(this, 200, 131);
        this.SeederPot.setRotationPoint(-8.0F, -2.0F, 15.0F);
        this.SeederPot.addBox(0.0F, 0.0F, 0.0F, 16, 16, 1, 0.0F);
        this.LeftPanel3 = new ModelRenderer(this, 120, 150);
        this.LeftPanel3.setRotationPoint(10.0F, -3.0F, -17.0F);
        this.LeftPanel3.addBox(0.0F, 0.0F, 0.0F, 13, 16, 2, 0.0F);
        this.RigthLamp = new ModelRenderer(this, 33, 8);
        this.RigthLamp.setRotationPoint(-12.0F, 4.0F, -42.0F);
        this.RigthLamp.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.LeftPanel1 = new ModelRenderer(this, 107, 51);
        this.LeftPanel1.setRotationPoint(10.0F, -3.0F, -17.0F);
        this.LeftPanel1.addBox(0.0F, 0.0F, 0.0F, 2, 16, 30, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.LeftWheelCenter.render(f5);
        this.WheelBar1.render(f5);
        this.RightWheelFront.render(f5);
        this.RightPanel1.render(f5);
        this.SeederPot3.render(f5);
        this.RightLampHolder.render(f5);
        this.RightLampConnector.render(f5);
        this.AxisConnect.render(f5);
        this.SeederPot4.render(f5);
        this.SteeringWheel.render(f5);
        this.Trekhaak2.render(f5);
        this.LeftWheel4.render(f5);
        this.Floor.render(f5);
        this.RightWeel1.render(f5);
        this.LeftLampConnector.render(f5);
        this.LeftWheelFront.render(f5);
        this.SeederPotFloor.render(f5);
        this.LeftWheel3.render(f5);
        this.ChairBack.render(f5);
        this.RightWheelConnector.render(f5);
        this.LeftLampHolder.render(f5);
        this.LeftWeel1.render(f5);
        this.LeftWheel2.render(f5);
        this.Trekhaak1.render(f5);
        this.LeftLamp.render(f5);
        this.ChairPanel1.render(f5);
        this.AxisBlock2.render(f5);
        this.SeederConnector.render(f5);
        this.LeftWheelConnector.render(f5);
        this.RightWheel3.render(f5);
        this.ChairPanel2.render(f5);
        this.BackAxis.render(f5);
        this.RightWheel4.render(f5);
        this.Chair.render(f5);
        this.SeederPipe.render(f5);
        this.RightPanel2.render(f5);
        this.Trekhaak3.render(f5);
        this.WheelBar2.render(f5);
        this.RightPanel3.render(f5);
        this.SeederPot2.render(f5);
        this.AxisBlock1.render(f5);
        this.Hood.render(f5);
        this.Pipe2.render(f5);
        this.WheelBar3.render(f5);
        this.RightWheelCenter.render(f5);
        this.SeederPipe3.render(f5);
        this.FrontAxis.render(f5);
        this.SteeringPole.render(f5);
        this.LeftPanel2.render(f5);
        this.Pipe1.render(f5);
        this.RightWheel2.render(f5);
        this.SeederPipe2.render(f5);
        this.SeederPot.render(f5);
        this.LeftPanel3.render(f5);
        this.RigthLamp.render(f5);
        this.LeftPanel1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
