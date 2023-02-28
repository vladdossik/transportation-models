package notifications.email;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EmailNotificationWithUserDto {
    @Schema(description = "UUID пользователя")
    private Integer uuid;

    @NotNull
    @Schema(description = "Тема письма")
    private String subject;

    @NotNull
    @Schema(description = "Сообщение")
    private String content;

//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
