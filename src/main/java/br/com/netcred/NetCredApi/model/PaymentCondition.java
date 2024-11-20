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
public class PaymentCondition extends AbstractEntity {
    private String name;

    private String description;

    private Company company;

    private String interestType;

    private String interestValueType;

    private BigDecimal interestValue;

    private String fineValueType;

    private BigDecimal fineValue;

    private String discountType;

    private String discountValueType;

    private BigDecimal discountValue;

    private BigDecimal discountValue1;

    private int discountDateDelta1;

    private BigDecimal discountValue2;

    private int discountDateDelta2;

    private BigDecimal discountValue3;

    private int discountDateDelta3;
}
