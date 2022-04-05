package com.detroitlabs.pollenAlert.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class PollenData {
    private String date;
    private String types;

    public String getDate() {
        return date;
    }
    @JsonProperty
    public void setDate(String date) {
        this.date = date;
    }

    public String getTypes() {
        return types;
    }
    @JsonProperty
    public void setTypes(String types) {
        this.types = types;
    }
}
