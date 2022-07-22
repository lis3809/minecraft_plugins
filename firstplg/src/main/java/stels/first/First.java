package stels.first;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class First extends JavaPlugin implements Listener {



    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Плагин включился");
        getServer().getPluginCommand("sendMessage").setExecutor(new SendMessage());

        //Первый вариант - команды в разных классах
        getServer().getPluginCommand("summ").setExecutor(new Summ());
        getServer().getPluginCommand("razn").setExecutor(new Razn());

        //Второй вариант - команды в одном классе
        getServer().getPluginCommand("sendSUMM").setExecutor(new SendMessage());
        getServer().getPluginCommand("sendRAZN").setExecutor(new SendMessage());


        //Работа с Ивентами
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onLoad(){
        getLogger().info("Плагин загрузился");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Плагин выключился");

    }

    @EventHandler
    public void closeInventory(InventoryCloseEvent inventoryCloseEvent){
        inventoryCloseEvent.getPlayer().sendMessage("Вы закрыли ивентарь");
    }



}
