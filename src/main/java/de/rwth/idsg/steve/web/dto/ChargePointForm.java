package de.rwth.idsg.steve.web.dto;

import de.rwth.idsg.steve.web.validation.ChargeBoxId;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author Sevket Goekay <goekay@dbis.rwth-aachen.de>
 * @since 18.12.2014
 */
@Getter
@Setter
public class ChargePointForm {

    // Internal database id
    private Integer chargeBoxPk;

    @NotBlank(message = "ChargeBox ID is required")
    @ChargeBoxId
    private String chargeBoxId;

    @NotNull
    private Boolean insertConnectorStatusAfterTransactionMsg;

    private Address address;

    @Range(min = -90, max = 90, message = "Latitude must be between {min} and {max}")
    private BigDecimal locationLatitude;

    @Range(min = -180, max = 180, message = "Longitude must be between {min} and {max}")
    private BigDecimal locationLongitude;

    private String description;
    private String note;

    @URL(message = "Admin address must be a valid URL")
    private String adminAddress;
}
