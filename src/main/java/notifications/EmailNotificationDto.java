package notifications;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class EmailNotificationDto {
    @Schema(description = "UUID пользователя")
    private Integer uuid;
    @Schema(description = "Кому")
    private String to;
    @Schema(description = "Копия")
    private String cc;
    @Schema(description = "Скрытая копия")
    private String bcc;
    @Schema(description = "Тема письма")
    private String subject;
    @Schema(description = "Сообщение")
    private String message;
//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
