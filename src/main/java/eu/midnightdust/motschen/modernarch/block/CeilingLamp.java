package eu.midnightdust.motschen.modernarch.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.EntityContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CeilingLamp extends HorizontalFacingBlock {
    private static final VoxelShape SHAPE;

    public CeilingLamp() {
        super(FabricBlockSettings.copyOf(Blocks.STONE));
    }

    @Override
    public RenderLayer getRenderLayer()
    {
        return RenderLayer.CUTOUT;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext context) {
        return SHAPE;
    }
    static {
        VoxelShape shape = createCuboidShape(3, 15, 3, 13, 16, 13);

        SHAPE = shape;
    }
}
