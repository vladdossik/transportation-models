package notifications;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class EmailMessageNotification {
    @Schema(description = "Кому")
    private String to;
    @Schema(description = "Копия")
    private String cc;
    @Schema(description = "Скрытая копия")
    private String bcc;
    @Schema(description = "Сообщение")
    private String message;
//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
