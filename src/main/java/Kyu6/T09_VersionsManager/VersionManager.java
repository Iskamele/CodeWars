package Kyu6.T09_VersionsManager;

import java.util.ArrayList;
import java.util.List;

public class VersionManager {
    private Integer major = 0;
    private Integer minor = 0;
    private Integer patch = 0;
    private final List<String> history = new ArrayList<>();

    public VersionManager() {
        patch = 1;
    }

    public VersionManager(String version, List<String> history) {
        patch = 1;
        parseVersionFromString(version);
        this.history.addAll(history);
    }

    public VersionManager(String input) {
        parseVersionFromString(input);
    }

    public String release() {
        return major + "." + minor + "." + patch;
    }

    public VersionManager major() {
        history.add(release());
        major++;
        minor = 0;
        patch = 0;
        return this;
    }

    public VersionManager minor() {
        history.add(release());
        minor++;
        patch = 0;
        return this;
    }

    public VersionManager patch() {
        history.add(release());
        patch++;
        return this;
    }

    public VersionManager rollback() {
        if (!history.isEmpty()) {
            String last = history.get(history.size() - 1);
            history.remove(history.size() - 1);
            parseVersionFromString(last);
            return this;
        }
        throw new RuntimeException("Cannot rollback!");
    }

    private void parseVersionFromString(String input) {
        if (input == null || input.isEmpty()) {
            patch = 1;
            return;
        }

        try {
            String[] split = input.split("\\.");

            if (split.length > 2) {
                patch = Integer.parseInt(split[2]);
            }
            if (split.length > 1) {
                minor = Integer.parseInt(split[1]);
            }
            major = Integer.parseInt(split[0]);
        } catch (Exception e) {
            throw new RuntimeException("Error occured while parsing version!");
        }
    }
}
