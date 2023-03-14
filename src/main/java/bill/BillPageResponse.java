package bill;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class BillPageResponse {
    @Schema(description = "Показать страницу")
    long pageNumber;
    @Schema(description = "Количество платежей на страницу")
    long pageSize;
    @Schema(description = "Количество страниц")
    long amountPages;
    @Schema(description = "Список платежей")
    List<BillResponseDto> bills;
    @Schema(description = "Отсортировать по...")
    String sortBy;
    @Schema(description = "Сортировка по убыванию/возрастанию")
    String direction;
}
