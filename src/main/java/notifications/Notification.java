package notifications;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
public class Notification {
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    @Schema(description = "UUID пользователя")
    private Integer uuid;
    @NotNull
    @Schema(description = "Сообщение")
    private String message;
//    @Schema(description = "Приложенный файл")
//    private File attachment;
}
