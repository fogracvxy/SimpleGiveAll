package atomictempest.simplegiveall;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public final class SimpleGiveAll extends JavaPlugin {
        public final Logger logger = Logger.getLogger("Minecraft");
        public SimpleGiveAll plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("[SimpleGiveAll] is turning on!");
        Objects.requireNonNull(getCommand("sgiveexp")).setExecutor(new SimpleGiveExp(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("[SimpleGiveAll] is turning off");
    }
}
