/*
 * DiscordSRV - A Minecraft to Discord and back link plugin
 * Copyright (C) 2016-2019 Austin "Scarsz" Shapiro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package github.scarsz.discordsrv.api.events;

import lombok.Getter;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.*;

/**
 * <p>Called directly after a message is sent to a {@link TextChannel} by the bot</p>
 */
public class DiscordGuildMessageSentEvent extends DiscordEvent {

    @Getter private final TextChannel channel;
    @Getter private final Guild guild;
    @Getter private final Message message;

    public DiscordGuildMessageSentEvent(JDA jda, Message message) {
        super(jda);
        this.channel = message.getTextChannel();
        this.guild = message.getGuild();
        this.message = message;
    }

}
