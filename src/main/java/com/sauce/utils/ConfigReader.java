package com.sauce.utils;

import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class ConfigReader {
    private static Map<String, Object> envConfig;

    @SuppressWarnings("unchecked")
    public static void loadConfig(String env) {
        String fileName = "config/environment.yaml"; // ✅ Load from classpath
        InputStream inputStream = ConfigReader.class.getClassLoader().getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new RuntimeException("Could not find " + fileName + " in classpath.");
        }

        Yaml yaml = new Yaml();
        Map<String, Object> yamlMap = yaml.load(inputStream);
        envConfig = (Map<String, Object>) yamlMap.get(env);

        if (envConfig == null) {
            throw new RuntimeException("Environment '" + env + "' not found in " + fileName);
        }
    }

    public static String getProperty(String key) {
        if (envConfig == null) {
            throw new IllegalStateException("Config not loaded. Call loadConfig() first.");
        }
        if (!envConfig.containsKey(key)) {
            throw new RuntimeException("Property '" + key + "' not found in environment.yaml");
        }
        return envConfig.get(key).toString();
    }
}