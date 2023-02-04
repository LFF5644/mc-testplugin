package one.lff;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class CommandHandler implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
		sender.sendMessage("hello "+sender.getName());
		sender.sendMessage("you oped: "+sender.isOp());
		sender.sendMessage("command: "+command.getName());
		sender.sendMessage("Übergebene Argumente: "+args.length);
		return true;
	}
}
