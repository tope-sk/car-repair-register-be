package sk.tope.car_repair_register.api.service.so;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.List;

@Schema(name = "RepairLog")
public record RepairLogSo(
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED) Long id,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED) String content,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED) VehicleSo vehicle,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED) LocalDateTime repairDate,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED) List<AttachmentSo> attachments,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED) LocalDateTime created,
        @Schema(requiredMode = Schema.RequiredMode.REQUIRED, nullable = true) LocalDateTime modified
) {
}