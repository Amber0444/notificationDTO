package org.DTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorDTO {
    private String uuid;
    private String data;
    private String error;
}
