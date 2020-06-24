package mod.linguardium.tiredrightnow;

import net.fabricmc.api.ModInitializer;

import net.minecraft.world.GameRules;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainInit implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "tiredrightnow";
    public static final String MOD_NAME = "Tired Right Now";
    public static GameRules.Key<GameRules.IntRule> SleepTime = new GameRules.Key<GameRules.IntRule>("tiredrightnow_sleeptime", GameRules.Category.MISC);


    @Override
    public void onInitialize() {
        log(Level.INFO, "This one goes out to night shift workers. Stay safe.");
        //TODO: Initializer
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}