package io.theysay.affectr.client.api;

public class Version {
    private String name;
    private String version;
    private String engineVersion;
    private String engineBuild;
    private String engineBuildDate;
    private String scalaVersion;
    private String buildDate;

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public String getEngineBuild() {
        return engineBuild;
    }

    public String getEngineBuildDate() {
        return engineBuildDate;
    }

    public String getScalaVersion() {
        return scalaVersion;
    }

    public String getBuildDate() {
        return buildDate;
    }
}
