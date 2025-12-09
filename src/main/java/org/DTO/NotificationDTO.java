package org.DTO;

import lombok.Data;
import java.util.List;
import java.util.UUID;

@Data
public class NotificationDTO {
    private UUID uuid;
    private String type;
    private Sender sender;
    private Receiver receiver;
    private Notice notice;

    @Data
    public static class Sender {
        private String name;
        private String contact;
    }

    @Data
    public static class Receiver {
        private String contact;
    }

    @Data
    public static class Notice {
        private String topic;
        private String body;
        private List<Content> content;
        private String sentAt;
    }

    @Data
    public static class Content {
        private String fileName;
        private String data;
    }
}
