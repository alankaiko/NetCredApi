package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RuleItem extends AbstractEntity {
    private String splitType;

    private BigDecimal proportion;

    private BigDecimal amount;

    private boolean isLiable;

    private BankAccount bankAccount;

    private Schedule schedule;
}
