package sk.tope.car_repair_register.api.service.so;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(name = "CustomerCreate")
public record CustomerCreateSo(
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
        @Size(max = 64)
        @NotBlank
        String name,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
        @Size(max = 64)
        String surname,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
        @Size(max = 20)
        String mobile,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
        @Size(max = 320)
        String email) {
}
