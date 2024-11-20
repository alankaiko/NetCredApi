package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import br.com.netcred.NetCredApi.model.enuns.Method;
import br.com.netcred.NetCredApi.model.enuns.Submethod;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Charge extends AbstractEntity {
    private UUID uuid;

    private String referenceCode;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Method method;

    @Enumerated(EnumType.STRING)
    private Submethod submethod;

    private String rrule;

    private String ipAddress;

    private String customerIpAddress;

    private LocalDateTime voidAt;

    private String voidReason;

    private String chargeType;

    private String chargeStatus;

    private int installmentNumber;

    private String extraInfo;

    private boolean manualCapture;

    private int billingCycleTotal;

    private int billingCyclePaid;

    private int billingCyclesProcessed;

    private Company company;

    private Customer customer;

    private PaymentProfile paymentProfile;

    private BilletCondition billetCondition;

    private PixCondition pixCondition;

    private ChargeLink chargeLink;

    private PayoutRule payoutRule;

    private Contract contract;


}
