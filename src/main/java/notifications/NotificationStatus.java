package notifications;

import lombok.Data;

@Data
public class NotificationStatus {
    private Notification notification;
    private String status;
}
