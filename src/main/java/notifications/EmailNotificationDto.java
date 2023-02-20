package notifications;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class EmailNotificationDto extends Notification {
    @Schema(description = "Кому")
    private String to;
    @Schema(description = "Копия")
    private String cc;
    @Schema(description = "Скрытая копия")
    private String bcc;
    @NotNull
    @Schema(description = "Тема письма")
    private String subject;
}
