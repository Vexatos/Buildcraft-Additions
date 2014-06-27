package buildcraftAdditions.items.Dusts;

import buildcraftAdditions.BuildcraftAdditions;
import buildcraftAdditions.core.Variables;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

/**
 * Copyright (c) 2014, AEnterprise
 * http://buildcraftadditions.wordpress.com/
 * Buildcraft Additions is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://buildcraftadditions.wordpress.com/wiki/licensing-stuff/
 */
public class BaseDust extends Item {
    public IIcon icon;
    public String metal;

    public BaseDust (String metal){
        this.setCreativeTab(BuildcraftAdditions.bcadditions);
        this.setUnlocalizedName("dust" + metal);
        this.metal = metal;
        Variables.addMetal(metal);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        icon = par1IconRegister.registerIcon("bcadditions:" + metal);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage) {
        return icon;
    }

}
