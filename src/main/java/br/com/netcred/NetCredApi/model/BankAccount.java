package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import br.com.netcred.NetCredApi.model.enuns.AccountType;
import br.com.netcred.NetCredApi.model.enuns.DocumentType;
import br.com.netcred.NetCredApi.model.enuns.PixKeyType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Getter
@Setter
public class BankAccount extends AbstractEntity {
    private Bank bank;

    private String ispb;

    private String compe;

    @Enumerated(EnumType.STRING)
    private DocumentType documentType;

    private String holderDocument;

    private String holderName;

    private String agency;

    private String number;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private BigDecimal transferFee;

    @Enumerated(EnumType.STRING)
    private PixKeyType pixKeyType;

    private String pixKey;
}
