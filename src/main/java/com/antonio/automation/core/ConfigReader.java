package com.antonio.automation.core;

import java.io.InputStream;
import java.util.Properties;

public final class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        try (InputStream is =
                     ConfigReader.class
                             .getClassLoader()
                             .getResourceAsStream("config.properties")) {

            if (is == null) {
                throw new RuntimeException("config.properties not found");
            }

            properties.load(is);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    private ConfigReader() {
        // prevent instantiation
    }

    public static String get(String key) {
        return System.getProperty(key, properties.getProperty(key));
    }

    public static int getInt(String key) {
        return Integer.parseInt(get(key));
    }
}