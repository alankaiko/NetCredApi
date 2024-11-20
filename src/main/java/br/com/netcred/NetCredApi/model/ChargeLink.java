package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class ChargeLink extends AbstractEntity {
    private boolean isActive;

    private BigDecimal baseAmount;

    private boolean unique;

    private int timesUsed;

    private boolean billetAllowed;

    private boolean cardSingleAllowed;

    private boolean cardRecurringAllowed;

    private boolean pixAllowed;

    private String companyName;

    private Company company;

    private LocalDateTime expiryDate;

    private int maxInstallments;

    private String url;

    private BilletCondition billetCondition;

    private OrderInput order;

    private int pixExpiringSeconds;

    private String billetType;
}
