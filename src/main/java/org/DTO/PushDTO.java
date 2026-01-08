package org.DTO;

import lombok.Data;
import java.util.Map;

@Data
public class PushDTO {
    private String endpoint;
    private String publicKey;
    private String auth;
    private String title;
    private String body;
    private String icon;
    private String badge;
    private String image;
    private Map<String, Object> data;
    private Integer ttl = 86400;
}
