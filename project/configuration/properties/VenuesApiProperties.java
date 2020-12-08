package com.project.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "venues-api")
public class VenuesApiProperties {

    private String url;
    private String client_id;
    private String client_secret;
    private String v;
}
