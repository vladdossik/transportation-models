package notifications;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.UUID;

@Data
public class NotificationDto {
    @Schema(description = "ID пользователя")
    private UUID userId;

    @Schema(description = "Настройки уведомления")
    private NotificationSettings settings;

    @Schema(description = "Тип уведомления")
    private NotificationType type;

//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
