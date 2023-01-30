package bill;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BillPostDto {
    @Schema(description = "сумма платежа")
    private Double amount;
    @Schema(description = "дата до оплаты заказа")
    private String paymentDate;
}
