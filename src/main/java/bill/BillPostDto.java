package bill;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.UUID;

@Data
public class BillPostDto {
    @Schema(description = "id пользователя")
    private UUID userId;
    @Schema(description = "сумма платежа")
    private Double amount;
    @Schema(description = "дата до оплаты заказа")
    private String paymentDate;
}
