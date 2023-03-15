package notifications;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class NotificationSettings {
    @Schema(description = "Кому")
    private String to;

    @Schema(description = "Копия")
    private String cc;

    @Schema(description = "Скрытая копия")
    private String bcc;

    @Schema(description = "Тема")
    private String subject;

    @Schema(description = "Сообщение")
    private String message;

//    @Schema(description = "Файл")
//    private UUID attachmentID;
}
