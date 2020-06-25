package mod.linguardium.tiredrightnow.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static mod.linguardium.tiredrightnow.MainInit.SleepTime;

@Mixin(ServerPlayerEntity.class)
public class ServerPlayerEntityMixin {

    @Redirect(at=@At(target="Lnet/minecraft/world/World;isDay()Z",value="INVOKE"), method="trySleep")
    private boolean isItSleepyTime_SPE(World world) {
        return world.getTimeOfDay() < world.getGameRules().getInt(SleepTime) && !world.isThundering();
    }
}
