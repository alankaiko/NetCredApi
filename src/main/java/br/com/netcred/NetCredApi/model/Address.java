package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address extends AbstractEntity {
    private String number;

    private String street;

    private String district;

    private String city;

    private String state;

    private String additionalDetails;

    private String zipCode;

}
