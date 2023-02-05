package notifications;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.File;

public class EmailIdNotification {
    @Schema(description = "ID пользователя")
    private int uuid;
    @Schema(description = "Сообщение")
    private String message;
//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
