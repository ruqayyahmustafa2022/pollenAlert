package com.detroitlabs.pollenAlert.Data;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Type {
    @JsonAlias("index")
    private Index indexAliasTest;


    public Index getIndex() {
        return indexAliasTest;
    }


    public void setIndex(Index indexAliasTest) {
        this.indexAliasTest = indexAliasTest;
    }
}
