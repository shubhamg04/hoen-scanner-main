package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {

    @JsonProperty
    private String city;

    // Default constructor is needed for Jackson deserialization
    public Search() {
    }

    // Constructor for easy object creation
    public Search(String city) {
        this.city = city;
    }

    // Getter
    public String getCity() {
        return city;
    }
}