package commands;

import io.cramatsu.handler.SlashCommand;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;

public class Ping extends SlashCommand {
    public Ping() {
        super("ping", "'tf man..");
    }

    @Override
    public void execute(SlashCommandEvent event) {
        event.reply("1000-7?").queue();
    }
}
