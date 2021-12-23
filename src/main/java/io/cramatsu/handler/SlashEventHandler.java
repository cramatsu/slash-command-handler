package io.cramatsu.handler;

import lombok.NonNull;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Map;


public class SlashEventHandler extends ListenerAdapter {

    private final SlashCommandManager slashCommandManager;

    public SlashEventHandler(SlashCommandManager slashCommandManager) {
        this.slashCommandManager = slashCommandManager;
    }

    @Override
    public void onSlashCommand(@NonNull SlashCommandEvent event) {
            String commandName = event.getName();
            Map<String,SlashCommand> commandMap = slashCommandManager.getSlashCommandCollection();

            if (commandMap.containsKey(commandName)) {
                commandMap.get(commandName).execute(event);
            }
    }

}
