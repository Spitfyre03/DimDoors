package com.zixiken.dimdoors.shared.items;

import com.zixiken.dimdoors.DimDoors;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemStableFabric extends Item {

    public static final String ID = "stable_fabric";

    public ItemStableFabric() {
        setCreativeTab(DimDoors.DIM_DOORS_CREATIVE_TAB);
        setUnlocalizedName(ID);
        setRegistryName(new ResourceLocation(DimDoors.MODID, ID));
    }
}
