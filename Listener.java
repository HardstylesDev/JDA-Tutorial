package me.tom.example;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        if (event.getAuthor().isBot() || event.getMessage().isWebhookMessage())
            return;
        if (event.getMessage().getContentRaw().equalsIgnoreCase("!test"))
            event.getMessage().getTextChannel().sendMessage("Hello " + event.getAuthor().getAsMention()).queue();

    }
}
