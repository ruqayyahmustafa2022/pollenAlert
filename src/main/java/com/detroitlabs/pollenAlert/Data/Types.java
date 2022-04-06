package com.detroitlabs.pollenAlert.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Types {
    private Type grass;
    private Type tree;
    private Type weed;

    public Type getGrass() {
        return grass;
    }

    public void setGrass(Type grass) {
        this.grass = grass;
    }

    public Type getTree() {
        return tree;
    }

    public void setTree(Type tree) {
        this.tree = tree;
    }

    public Type getWeed() {
        return weed;
    }

    public void setWeed(Type weed) {
        this.weed = weed;
    }
}
