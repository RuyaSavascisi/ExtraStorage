package edivad.extrastorage.data;

import java.util.HashMap;
import java.util.Map;
import edivad.extrastorage.items.storage.fluid.FluidStorageType;
import edivad.extrastorage.items.storage.item.ItemStorageType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ExtraStorageTags {

  public static class Blocks {

    public static final TagKey<Block> STORAGE_BLOCKS = tag("storage_blocks");
    public static final TagKey<Block> ITEM_STORAGE_BLOCKS = tag("storage_blocks/items");
    public static final TagKey<Block> FLUID_STORAGE_BLOCKS = tag("storage_blocks/fluids");
    public static final Map<ItemStorageType, TagKey<Block>> STORAGE_BLOCKS_ITEM = new HashMap<>();
    public static final Map<FluidStorageType, TagKey<Block>> STORAGE_BLOCKS_FLUID = new HashMap<>();

    static {
      for (var type : ItemStorageType.values()) {
        STORAGE_BLOCKS_ITEM.put(type, tag("storage_blocks/items/" + type.getName()));
      }
      for (var type : FluidStorageType.values()) {
        STORAGE_BLOCKS_FLUID.put(type, tag("storage_blocks/fluids/" + type.getName()));
      }
    }

    private static TagKey<Block> tag(String name) {
      return net.minecraft.tags.BlockTags.create(
          new ResourceLocation("refinedstorage", name));
    }
  }

  public static class Items {

    public static final TagKey<Item> STORAGE_BLOCKS = tag("storage_blocks");
    public static final TagKey<Item> ITEM_STORAGE_BLOCKS = tag("storage_blocks/items");
    public static final TagKey<Item> FLUID_STORAGE_BLOCKS = tag("storage_blocks/fluids");
    public static final Map<ItemStorageType, TagKey<Item>> STORAGE_BLOCKS_ITEM = new HashMap<>();
    public static final Map<FluidStorageType, TagKey<Item>> STORAGE_BLOCKS_FLUID = new HashMap<>();

    public static final TagKey<Item> PARTS = tag("parts");
    public static final TagKey<Item> ITEM_PARTS = tag("parts/items");
    public static final TagKey<Item> FLUID_PARTS = tag("parts/fluids");
    public static final Map<ItemStorageType, TagKey<Item>> PARTS_ITEM = new HashMap<>();
    public static final Map<FluidStorageType, TagKey<Item>> PARTS_FLUID = new HashMap<>();

    public static final TagKey<Item> DISKS = tag("disks");
    public static final TagKey<Item> ITEM_DISKS = tag("disks/items");
    public static final TagKey<Item> FLUID_DISKS = tag("disks/fluids");
    public static final Map<ItemStorageType, TagKey<Item>> DISKS_ITEM = new HashMap<>();
    public static final Map<FluidStorageType, TagKey<Item>> DISKS_FLUID = new HashMap<>();

    static {
      for (var type : ItemStorageType.values()) {
        STORAGE_BLOCKS_ITEM.put(type, tag("storage_blocks/items/" + type.getName()));
        PARTS_ITEM.put(type, tag("parts/items/" + type.getName()));
        DISKS_ITEM.put(type, tag("disks/items/" + type.getName()));
      }
      for (var type : FluidStorageType.values()) {
        STORAGE_BLOCKS_FLUID.put(type, tag("storage_blocks/fluids/" + type.getName()));
        PARTS_FLUID.put(type, tag("parts/fluids/" + type.getName()));
        DISKS_FLUID.put(type, tag("disks/fluids/" + type.getName()));
      }
    }

    private static TagKey<Item> tag(String name) {
      return net.minecraft.tags.ItemTags.create(new ResourceLocation("refinedstorage", name));
    }
  }
}
