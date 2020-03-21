/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thevoxelbox.voxelsniper.brush.perform;

import com.thevoxelbox.voxelsniper.Message;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;

/**
 * @author Voxel
 */
public class pComboMatNoPhys extends vPerformer
{

    private BlockData d;
    private Material i;
    private Material ir;

    public pComboMatNoPhys()
    {
        name = "Combo-Mat, No Physics";
    }

    @Override
    public void init(com.thevoxelbox.voxelsniper.SnipeData v)
    {
        w = v.getWorld();
        d = v.getData();
        i = v.getVoxelId();
        ir = v.getReplaceId();
    }

    @Override
    public void info(Message vm)
    {
        vm.performerName(name);
        vm.voxel();
        vm.replace();
        vm.data();
    }

    @SuppressWarnings("deprecation")
	@Override
    public void perform(Block b)
    {
        if (b.getType() == ir)
        {
            h.put(b);
            b.setBlockData(d, false);
        }
    }

    @Override
    public boolean isUsingReplaceMaterial()
    {
        return true;
    }
}
