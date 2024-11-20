package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class PixCondition extends AbstractEntity {
    private String uuid;

    private BigDecimal amount;

    private BigDecimal paidAmount;

    private BigDecimal refundedAmount;

    private String transactionState;

    private String method;

    private int installmentNumber;

    private String captureMedium;

    private String rejectedReason;

    private LocalDate billingAt;

    private LocalDateTime billedAt;

    private LocalDate dueAt;

    private LocalDateTime paidAt;

    private LocalDateTime processedAt;

    private LocalDateTime voidAt;

    private String voidReason;

    private boolean manualCapture;

    private boolean isDisputed;

    private int attempts;

    private LocalDate billExpiryDate;

    private LocalDate refundMaxDate;

    private int billingCycle;

    private String printUrl;

    private Charge charge;

    private Company company;

    private Customer customer;

    private PaymentProfile paymentProfile;

    private BilletCondition billetCondition;

    private PixCondition pixCondition;

    private ChargeLink chargeLink;

    private PayoutRule payoutRule;

    private Contract contract;

    private CardInfo cardInfo;

    private BilletInfo billetInfo;

    private PixInfo pixInfo;

    private BillingInfo billingInfo;
}
