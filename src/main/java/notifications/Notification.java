package notifications;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class Notification {
    @Schema(description = "UUID пользователя")
    private Integer uuid;
    @NotNull
    @Schema(description = "Сообщение")
    private String message;
//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
