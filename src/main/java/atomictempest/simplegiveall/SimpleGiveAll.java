package atomictempest.simplegiveall;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class SimpleGiveAll extends JavaPlugin {
        public final Logger logger = Logger.getLogger("Minecraft");
    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("Plugin se pali");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("Plugin se gasi");
    }
}
