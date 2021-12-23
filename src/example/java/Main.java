import commands.Ping;
import io.cramatsu.handler.SlashCommandManager;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws InterruptedException, LoginException {

        JDA jda = JDABuilder.createDefault("YOUR TOKEN🥰", Collections.emptyList())
                .build();
        SlashCommandManager slashCommandManager = new SlashCommandManager(jda);

        slashCommandManager.addCommands(new Ping());
        slashCommandManager.listen();
        jda.awaitReady();
    }
}
