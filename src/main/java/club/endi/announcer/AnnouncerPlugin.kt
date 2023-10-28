package club.endi.announcer

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin

class AnnouncerPlugin : JavaPlugin() {
    override fun onEnable() {
        getCommand("announce")?.setExecutor(AnnounceCommand())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
