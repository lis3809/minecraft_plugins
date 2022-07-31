package stels.first;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import stels.first.mobs.Mobster;
import stels.first.mobs.PlayerMobster;

public class CommandHandler implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            if (command.getName().equalsIgnoreCase("getzombi")){
                //Создаем нашего моба Zombi
                Entity entity = Bukkit.getPlayer(sender.getName()).getWorld().spawnEntity(Bukkit.getPlayer(sender.getName()).getLocation(), EntityType.ZOMBIE);
                Mobster zombi = (Mobster) entity;
                zombi.setCustomName("MOBSTER");
                zombi.setCustomNameVisible(true);
                zombi.setHealth(10);
                zombi.setAI(true);

            }

            if (command.getName().equalsIgnoreCase("getplayer")){
                //Создаем нашего моба Player
                Entity entity = Bukkit.getPlayer(sender.getName()).getWorld().spawnEntity(Bukkit.getPlayer(sender.getName()).getLocation(), EntityType.PLAYER);

                PlayerMobster playerMobster = (PlayerMobster) entity;

                playerMobster.setCustomName("MOBSTER");
                playerMobster.setCustomNameVisible(true);
                playerMobster.setHealth(10);
                playerMobster.setAI(true);
            }

        } else {
            sender.sendMessage("Эта команда только для игроков");
        }


        return true;
    }
}
