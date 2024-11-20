package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Company extends AbstractEntity {
    private String companyType;

    private String companyState;

    private String name;

    private String legalName;

    private String cnae;

    private String documentType;

    private String document;

    private String email;

    private String phone;
}
