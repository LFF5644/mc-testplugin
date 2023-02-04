package one.lff;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin{
  public static Logger LOGGER=Logger.getLogger("testplugin");

  public void onEnable(){
    LOGGER.info("testplugin enabled");
    CommandHandler commandHandler = new CommandHandler();
    getCommand("test").setExecutor(commandHandler);
  }

  public void onDisable(){
    LOGGER.info("testplugin disabled");
  }
}
