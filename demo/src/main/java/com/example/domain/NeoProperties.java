package com.example.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NeoProperties {
    @Value("${com.example.title}")
    private String title;

    public String getTitle() {
        return title;
    }

}
