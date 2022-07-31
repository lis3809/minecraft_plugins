package stels.first;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class First extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("===========Plugin enable==============");


        getServer().getPluginCommand("getzombi").setExecutor(new CommandHandler());
        getServer().getPluginCommand("getplayer").setExecutor(new CommandHandler());

    }


}
