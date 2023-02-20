package notifications;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
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

    @Builder
    public EmailNotificationDto(Integer uuid, @NotNull String message, String to, String cc, String bcc, String subject) {
        super(uuid, message);
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.subject = subject;
    }
}
