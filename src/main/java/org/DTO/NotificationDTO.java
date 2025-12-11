package org.DTO;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
public class NotificationDTO {
    private String uuid;
    private String type;
    private Sender sender;
    private Receiver receiver;
    private Notice notice;

    @Builder
    @Data
    public static class Sender {
        private String name;
        private String contact;
    }

    @Builder
    @Data
    public static class Receiver {
        private String contact;
    }

    @Builder
    @Data
    public static class Notice {
        private String topic;
        private String body;
        private List<Content> content;
        private String sentAt;
    }

    @Builder
    @Data
    public static class Content {
        private String fileName;
        private String data;
    }
}
