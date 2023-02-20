package notifications;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;

public class Notification {
    @Schema(description = "UUID пользователя")
    private Integer uuid;
    @NotNull
    @Schema(description = "Сообщение")
    private String message;
//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
