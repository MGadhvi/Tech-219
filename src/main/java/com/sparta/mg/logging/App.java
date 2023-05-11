package com.sparta.mg.logging;

import com.sparta.mg.logging.config.CustomFormatter;
import com.sparta.mg.logging.config.FileHandlerConfig;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        consoleHandler.setFormatter(new CustomFormatter());
        logger.setUseParentHandlers(false);

        logger.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        logger.addHandler(FileHandlerConfig.getFileHandler());
        logger.log(Level.INFO, "This is an Info message");
        logger.log(Level.WARNING, "This is a Warning message");
        logger.log(Level.FINE, "This is a Fine message");
    }
}
