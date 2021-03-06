package io.github.mooy1.slimequest.command;

import io.github.mooy1.slimequest.command.subcommands.Check;
import io.github.mooy1.slimequest.command.subcommands.Help;
import io.github.mooy1.slimequest.command.subcommands.Remove;
import io.github.mooy1.slimequest.command.subcommands.Reset;
import io.github.mooy1.slimequest.command.subcommands.Complete;
import io.github.mooy1.slimequest.SlimeQuest;
import io.github.mooy1.slimequest.command.subcommands.Book;
import io.github.mooy1.slimequest.command.subcommands.Open;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SubCommands {

    private SubCommands() {}

    public static Collection<SubCommand> getAllCommands(QuestCommand cmd) {
        SlimeQuest plugin = cmd.getPlugin();
        List<SubCommand> commands = new LinkedList<>();

        commands.add(new Help(plugin, cmd));
        commands.add(new Open(plugin, cmd));
        commands.add(new Book(plugin, cmd));
        commands.add(new Reset(plugin, cmd));
        commands.add(new Complete(plugin, cmd));
        commands.add(new Remove(plugin, cmd));
        commands.add(new Check(plugin, cmd));
        commands.add(new io.github.mooy1.slimequest.command.subcommands.List(plugin, cmd));

        return commands;
    }
}
