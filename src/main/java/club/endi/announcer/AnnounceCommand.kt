package club.endi.announcer

import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import net.kyori.adventure.sound.Sound
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class AnnounceCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, p1: Command, p2: String, args: Array<out String>?): Boolean {
        var message = "§e§lAnnouncement: §r§6"

        if (args != null) {
            for (arg in args) {
                message += arg+" "
            }
        }

        for (player in Bukkit.getOnlinePlayers()) {
            player.sendMessage(message)
            player.playSound(player.location, org.bukkit.Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.0f)
        }
        return true
    }
}