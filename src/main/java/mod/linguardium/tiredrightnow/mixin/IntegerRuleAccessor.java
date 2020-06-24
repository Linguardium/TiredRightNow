package mod.linguardium.tiredrightnow.mixin;

import org.apache.commons.lang3.NotImplementedException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.world.GameRules;

@Mixin(GameRules.IntRule.class)
public interface IntegerRuleAccessor{

    @Invoker
    public static GameRules.Type<GameRules.IntRule> invokeCreate(int defaultValue) {
        throw new NotImplementedException("Mixin failed");
     }

}