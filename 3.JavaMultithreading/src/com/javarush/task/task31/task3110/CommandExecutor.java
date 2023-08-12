package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.*;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {

    private static final Map<Operation, Command> ALL_KNOWN_COMMANDS_MAP = new HashMap<>();

    static {
        ALL_KNOWN_COMMANDS_MAP.put(Operation.ADD, new ZipAddCommand());
        ALL_KNOWN_COMMANDS_MAP.put(Operation.CONTENT, new ZipContentCommand());
        ALL_KNOWN_COMMANDS_MAP.put(Operation.EXIT, new ExitCommand());
        ALL_KNOWN_COMMANDS_MAP.put(Operation.CREATE, new ZipCreateCommand());
        ALL_KNOWN_COMMANDS_MAP.put(Operation.REMOVE, new ZipRemoveCommand());
        ALL_KNOWN_COMMANDS_MAP.put(Operation.EXTRACT, new ZipExtractCommand());
    }

    private CommandExecutor() {
    }

    public static void execute(Operation operation) throws Exception {
        ALL_KNOWN_COMMANDS_MAP.get(operation).execute();
    }

}
