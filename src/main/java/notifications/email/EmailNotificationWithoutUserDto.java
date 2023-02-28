package notifications.email;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EmailNotificationWithoutUserDto {
    @Schema(description = "Кому")
    private String to;

    @Schema(description = "Копия")
    private String cc;

    @Schema(description = "Скрытая копия")
    private String bcc;

    @NotNull
    @Schema(description = "Тема письма")
    private String subject;

    @NotNull
    @Schema(description = "Сообщение")
    private String content;

//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
