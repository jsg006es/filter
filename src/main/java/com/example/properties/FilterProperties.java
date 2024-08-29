package com.example.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
@ConfigurationProperties
@Validated
@Data
public class FilterProperties {

    private String filter;
}
