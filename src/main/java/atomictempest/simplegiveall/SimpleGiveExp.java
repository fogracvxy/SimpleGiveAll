package atomictempest.simplegiveall;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SimpleGiveExp implements CommandExecutor {

private SimpleGiveAll Plugin;

public SimpleGiveExp (SimpleGiveAll plugin){
}
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String potentPlayer = args[0];
        if (command.getName().equalsIgnoreCase("sgiveexp")){
            Player p = Bukkit.getServer().getPlayer(potentPlayer);
            if(p.isOnline()){
                p.giveExp(2000,false);
                p.sendMessage(ChatColor.GREEN + "You gained 2000 exp");

            }else  {
                p.sendMessage(ChatColor.RED + "Player is not online");
            }
        }
        return false;
    }
}
