package com.koenv.idk.essentials;

import org.stevewinfield.suja.idk.game.miscellaneous.ChatCommandArguments;
import org.stevewinfield.suja.idk.game.miscellaneous.IChatCommand;
import org.stevewinfield.suja.idk.game.miscellaneous.NotifyType;
import org.stevewinfield.suja.idk.game.plugins.GamePlugin;
import org.stevewinfield.suja.idk.game.rooms.RoomPlayer;

public class Essentials {
    private GamePlugin plugin;

    public Essentials(GamePlugin plugin) {
        this.plugin = plugin;
    }

    public void onLoad() {
        plugin.addChatCommand("essentials", new IChatCommand() {

            @Override
            public String getPermissionCode() {
                return "command_essentials";
            }

            @Override
            public boolean execute(RoomPlayer roomPlayer, ChatCommandArguments chatCommandArguments) {
                roomPlayer.getSession().sendNotification(
                        NotifyType.MOD_ALERT,
                        "Essentials v" + Essentials.class.getPackage().getImplementationVersion() + " was developed by koesie10"
                );
                return true;
            }
        });
    }
}