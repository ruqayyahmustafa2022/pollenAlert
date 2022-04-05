package com.detroitlabs.pollenAlert.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class PollenData {
    private String date;
    private String types;

}
