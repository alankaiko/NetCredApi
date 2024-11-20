package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class PixInfo extends AbstractEntity {
    private String pixType;

    private String e2eid;

    private String pixCopyPaste;

    private LocalDateTime expiresAt;

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
