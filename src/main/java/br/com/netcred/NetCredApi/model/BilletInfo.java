package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import br.com.netcred.NetCredApi.model.enuns.BilletType;
import br.com.netcred.NetCredApi.model.enuns.JurosType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Getter
@Setter
public class BilletInfo extends AbstractEntity {
    @Enumerated(EnumType.STRING)
    private BilletType billetType;

    private String digitableLine;

    private String barCode;

    private String txid;

    private String pixCopyPaste;

    @Enumerated(EnumType.STRING)
    private JurosType interestType;

    private BigDecimal interestValue;

    @Enumerated(EnumType.STRING)
    private JurosType fineType;

    private BigDecimal fine;

    @Enumerated(EnumType.STRING)
    private JurosType discountType;

    private String advanceDiscountValue;

    private BigDecimal discountValue1;

    private int discountDateDelta1;

    private BigDecimal discountValue2;

    private int discountDateDelta2;

    private BigDecimal discountValue3;

    private int discountDateDelta3;
}
