package mod.linguardium.tiredrightnow.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static mod.linguardium.tiredrightnow.MainInit.SleepTime;

@Mixin(PlayerEntity.class)
public abstract  class PlayerEntityMixin {

    @Redirect(at=@At(target="Lnet/minecraft/world/World;isDay()Z",value="INVOKE"), method="tick")
    private boolean isItSleepyTime_PE(World world) {
        return world.getTimeOfDay() < world.getGameRules().getInt(SleepTime);
    }

}
