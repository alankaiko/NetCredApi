package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Customer extends AbstractEntity {
    private Company company;

    private String name;

    private String email;

    private String documentType;

    private String document;

    private String phone;

    private LocalDate birthDate;

    private String gender;
}
