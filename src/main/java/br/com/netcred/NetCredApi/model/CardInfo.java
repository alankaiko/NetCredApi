package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import br.com.netcred.NetCredApi.model.enuns.CardMode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
public class CardInfo extends AbstractEntity {
    private String cardNumber;

    @Enumerated(EnumType.STRING)
    private CardMode cardMode;

    private String cardHolderName;

    private int expiryMonth;

    private int expiryYear;

    private String brand;
}
