package de.rwth.idsg.steve.service.dto;

import de.rwth.idsg.steve.repository.dto.ChargePointSelect;
import de.rwth.idsg.steve.repository.dto.ChargingProfile;
import de.rwth.idsg.steve.web.dto.ocpp.ChargePointSelection;
import de.rwth.idsg.steve.web.dto.ocpp.SetChargingProfileParams;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author Sevket Goekay <goekay@dbis.rwth-aachen.de>
 * @since 12.11.2018
 */
@Getter
@RequiredArgsConstructor
public class EnhancedSetChargingProfileParams implements ChargePointSelection {

    private final SetChargingProfileParams delegate;
    private final ChargingProfile.Details details;

    @Override
    public List<ChargePointSelect> getChargePointSelectList() {
        return delegate.getChargePointSelectList();
    }
}
