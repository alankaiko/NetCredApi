package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class PayoutRule extends AbstractEntity {
    private Company company;

    private boolean isActive;

    private boolean isPrimary;

    private List<RuleItem> ruleItems;
}
