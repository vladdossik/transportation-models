package users;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
public class UserResponseDto {
    @Schema(description = "Внешний id")
    private UUID externalId;
    @Schema(description = "Имя")
    private String firstName;
    @Schema(description = "Фамилия")
    private String lastName;
    @Schema(description = "Отчество")
    private String patronymic;
    @Schema(description = "Дата создания")
    private ZonedDateTime creationDate;
    @Schema(description = "Дата обновления")
    private ZonedDateTime lastUpdateDate;
    @Schema(description = "Паспорт")
    private String passport;
    @Schema(description = "Дата выдачи паспорта")
    private String issueDate;
    @Schema(description = "Где выдан")
    private String issuePlace;
    @Schema(description = "Количество заказов")
    private Long amountOfOrders;
}
