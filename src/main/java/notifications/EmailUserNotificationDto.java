package notifications;

import io.swagger.v3.oas.annotations.media.Schema;

public class EmailUserNotificationDto {
    @Schema(description = "ID пользователя")
    private int uuid;
    @Schema(description = "Сообщение")
    private String message;
//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
