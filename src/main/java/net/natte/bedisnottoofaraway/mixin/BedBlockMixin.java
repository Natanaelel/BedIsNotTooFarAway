package net.natte.bedisnottoofaraway.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayerEntity.class)
public class BedBlockMixin {
	@Inject(method = "isBedTooFarAway(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;)Z", at = @At("HEAD"), cancellable = true)
	public void isBedCloseEnough(BlockPos pos, Direction direction, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}
