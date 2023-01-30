package bill;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.UUID;
@Data
public class BillResponseDto {
    @Schema(description = "user id")
    private UUID userId;
    @Schema(description = "дата создания")
    private ZonedDateTime creationDate;
    @Schema(description = "дата обновления")
    private ZonedDateTime lastUpdateDate;
    @Schema(description = "сумма платежа")
    private Double amount;
    @Schema(description = "дата до оплаты заказа")
    private String paymentDate;
    @Schema(description = "статус оплаты заказа")
    private Boolean wasPaid;
}
