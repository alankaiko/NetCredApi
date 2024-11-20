package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Schedule extends AbstractEntity {
    private String scheduleType;

    private int scheduleAnchor;

    private boolean automaticAdvance;
}
