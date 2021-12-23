package io.cramatsu.handler;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;


public abstract class SlashCommand {
    private final String name;
    private final String description;

    public SlashCommand(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void execute(SlashCommandEvent slashCommandEvent);

    public synchronized CommandData getInfo() {
        return new CommandData(name, description);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
