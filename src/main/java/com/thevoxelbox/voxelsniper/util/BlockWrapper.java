package com.thevoxelbox.voxelsniper.util;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;

/**
 * @author MikeMatrix
 */
public class BlockWrapper
{

    private Material id;
    private int x;
    private int y;
    private int z;
    private BlockData data;
    private World world;

    /**
     * @param block
     */
    @SuppressWarnings("deprecation")
	public BlockWrapper(final Block block)
    {
        this.setId(block.getType());
        this.setX(block.getX());
        this.setY(block.getY());
        this.setZ(block.getZ());
        this.setData(block.getBlockData());
        this.setWorld(block.getWorld());
    }

    /**
     * @return the data
     */
    public final BlockData getData()
    {
        return this.data;
    }

    /**
     * @return the id
     */
    public final Material getId()
    {
        return this.id;
    }

    /**
     * @return the world
     */
    public final World getWorld()
    {
        return this.world;
    }

    /**
     * @return the x
     */
    public final int getX()
    {
        return this.x;
    }

    /**
     * @return the y
     */
    public final int getY()
    {
        return this.y;
    }

    /**
     * @return the z
     */
    public final int getZ()
    {
        return this.z;
    }

    /**
     * @param data
     *         the data to set
     */
    public final void setData(final BlockData data)
    {
        this.data = data;
    }

    /**
     * @param id
     *         the id to set
     */
    public final void setId(final Material id)
    {
        this.id = id;
    }

    /**
     * @param world
     *         the world to set
     */
    public final void setWorld(final World world)
    {
        this.world = world;
    }

    /**
     * @param x
     *         the x to set
     */
    public final void setX(final int x)
    {
        this.x = x;
    }

    /**
     * @param y
     *         the y to set
     */
    public final void setY(final int y)
    {
        this.y = y;
    }

    /**
     * @param z
     *         the z to set
     */
    public final void setZ(final int z)
    {
        this.z = z;
    }
}
