package me.mooy1.slimequest.command;

import lombok.NonNull;
import me.mooy1.slimequest.SlimeQuest;
import org.bukkit.command.CommandSender;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public abstract class SubCommand {

    protected final SlimeQuest plugin;
    protected final QuestCommand cmd;

    private final String name;
    private final String description;
    private final boolean hidden;

    @ParametersAreNonnullByDefault
    protected SubCommand(SlimeQuest plugin, QuestCommand cmd, String name, String description, boolean hidden) {
        this.plugin = plugin;
        this.cmd = cmd;
        this.name = name;
        this.description = description;
        this.hidden = hidden;
    }

    @Nonnull
    public final String getName() {
        return name;
    }

    public final boolean isHidden() {
        return hidden;
    }

    public abstract void onExecute(@Nonnull CommandSender sender, @Nonnull String[] args);

    @NonNull
    public List<String> onTab(@Nonnull CommandSender sender, @Nonnull String[] args) {
        return new ArrayList<>();
    }

    @Nonnull
    protected String getDescription() {
        return description;
    }
}