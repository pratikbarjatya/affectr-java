package io.theysay.affectr.client.api;

public class DependencyParse {
    private Dependency dependency;
    private Dependent dependent;
    private Governor governor;

    public Dependency getDependency() {
        return dependency;
    }

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    public Dependent getDependent() {
        return dependent;
    }

    public void setDependent(Dependent dependent) {
        this.dependent = dependent;
    }

    public Governor getGovernor() {
        return governor;
    }

    public void setGovernor(Governor governor) {
        this.governor = governor;
    }
}
