package tv.mapper.embellishcraft.core.util;

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.material.MapColor;

import java.util.Arrays;
import java.util.Comparator;

public enum RockType implements StringRepresentable
{
    BASALT(0, "basalt", "basalt", MapColor.COLOR_BLACK),
    SLATE(1, "slate", "ardoise", MapColor.TERRACOTTA_BLUE),
    MARBLE(2, "marble", "marbre", MapColor.QUARTZ),
    GNEISS(3, "gneiss", "gneiss", MapColor.TERRACOTTA_WHITE),
    JADE(4, "jade", "jade", MapColor.TERRACOTTA_GREEN),
    LARVIKITE(5, "larvikite", "larvikite", MapColor.TERRACOTTA_LIGHT_BLUE);

    private static final RockType[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(RockType::getId)).toArray((type) ->
    {
        return new RockType[type];
    });

    private final int id;
    private final String name;
    private final String fr_name;
    private final MapColor color;

    private RockType(int id, String name, String fr_name, MapColor color)
    {
        this.id = id;
        this.name = name;
        this.fr_name = fr_name;
        this.color = color;
    }

    public String toString()
    {
        return this.name;
    }

    public String getName()
    {
        return this.name;
    }

    public String getFrName()
    {
        return this.fr_name;
    }

    public MapColor getColor()
    {
        return this.color;
    }

    public int getId()
    {
        return this.id;
    }

    public static RockType byId(int id)
    {
        if(id < 0 || id >= VALUES.length)
        {
            id = 0;
        }
        return VALUES[id];
    }

    @Override
    public String getSerializedName()
    {
        return this.name;
    }
}