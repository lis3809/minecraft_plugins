package stels.first;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SendMessage implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (command.getName().equals("sendSUMM")) {
            sender.sendMessage(String.valueOf(x+y));
        } else if (command.getName().equals("sendRAZN")) {
            sender.sendMessage(String.valueOf(x-y));
        } else {
            sender.sendMessage("Команда НЕ работает");
        }
        return true;
    }
}
