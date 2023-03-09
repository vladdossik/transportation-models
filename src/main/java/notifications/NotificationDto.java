package notifications;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class NotificationDto {
    @Schema(description = "ID пользователя")
    private UUID userId;

    @Schema(description = "Настройки уведомления")
    private NotificationSettings settings;

    @Schema(description = "Тип уведомления")
    private NotificationType type;

    @Schema(description = "Статус уведомления")
    private NotificationStatus status;

    @Schema(description = "Максимальное количество попыток")
    private Integer maxAttempts;

    @Schema(description = "Общее количество попыток")
    private Integer totalAttempts;

    @Schema(description = "Время создания")
    private LocalDateTime createDate;

    @Schema(description = "Время последнего обновления")
    private LocalDateTime updateDate;

//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
